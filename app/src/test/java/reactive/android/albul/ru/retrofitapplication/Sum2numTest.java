package reactive.android.albul.ru.retrofitapplication;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import reactive.android.albul.ru.retrofitapplication.gson.sum.Sum2num;

public class Sum2numTest {

    private Sum2num sum2num;

    @Before
    public void before(){
        sum2num = new Sum2num();
    }

    @Test
    public void sum2num_whenSome_isCorrect(){
        int num1 = 1;
        int num2 = 4;
        int sum = num1 + num2;
        Assert.assertEquals(sum,sum2num.sum(num1, num2));
    }

    @Test
    public void sum2num_whenSome_isIncorrect(){
        int num1 = 1;
        int num2 = 4;
        int sum = num1 + num2 + 1;
        Assert.assertNotEquals(sum,sum2num.sum(num1, num2)) ;
    }

}

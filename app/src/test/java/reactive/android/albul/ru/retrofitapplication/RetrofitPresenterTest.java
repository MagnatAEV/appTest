package reactive.android.albul.ru.retrofitapplication;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import io.reactivex.Scheduler;
import io.reactivex.android.plugins.RxAndroidPlugins;
import io.reactivex.schedulers.Schedulers;
import reactive.android.albul.ru.retrofitapplication.gson.presenters.RetrofitPresenter;

@RunWith(MockitoJUnitRunner.class)
public class RetrofitPresenterTest {

    private RetrofitPresenter presenter;

    @BeforeClass
    public static void setupClass(){
        RxAndroidPlugins.setInitMainThreadSchedulerHandler(___-> Schedulers.trampoline());
    }

    @Before
    public void before(){
        MockitoAnnotations.initMocks(this);
        presenter = Mockito.spy(new RetrofitPresenter());
    }

}

package reactive.android.albul.ru.retrofitapplication;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.plugins.RxAndroidPlugins;
import io.reactivex.schedulers.Schedulers;
import reactive.android.albul.ru.retrofitapplication.app.TestComponent;
import reactive.android.albul.ru.retrofitapplication.app.TestModule;
import reactive.android.albul.ru.retrofitapplication.gson.User;
import reactive.android.albul.ru.retrofitapplication.gson.presenters.RetrofitApi;
import reactive.android.albul.ru.retrofitapplication.gson.presenters.RetrofitPresenter;

@RunWith(MockitoJUnitRunner.class)
public class RetrofitPresenterTest {

    private RetrofitPresenter presenter;

    @Mock
    String string;

    @BeforeClass
    public static void setupClass(){
        RxAndroidPlugins.setInitMainThreadSchedulerHandler(___-> Schedulers.trampoline());
    }

    @Before
    public void before(){
        MockitoAnnotations.initMocks(this);
        presenter = Mockito.spy(new RetrofitPresenter());
    }


    @Test
    public void getString_isCorrect(){
        TestComponent component = DaggerTestComponent.builder()
                .testModule(new TestModule(){

                    @Override
                    public RetrofitApi provideRetrofitApi() {
                       RetrofitApi retrofitApi = super.provideRetrofitApi();
                       User user = new User();
                       user.login = "Anybody";
                       Mockito.when(retrofitApi.request()).thenReturn(Observable.just(user));
                       return retrofitApi;
                    };
                }).build();

        component.inject(presenter);
        presenter.getRequestString();
        Mockito.verify(string).equals("Anybody");
    }

}

package reactive.android.albul.ru.retrofitapplication.app;

import org.mockito.Mockito;

import reactive.android.albul.ru.retrofitapplication.gson.presenters.RetrofitApi;
import reactive.android.albul.ru.retrofitapplication.gson.presenters.RetrofitPresenter;

@Module
public class TestModule {
    @Provides
    public RetrofitApi provideRetrofitApi(){
        return Mockito.mock(RetrofitApi.class);
    }
}

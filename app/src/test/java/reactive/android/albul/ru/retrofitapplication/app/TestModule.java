package reactive.android.albul.ru.retrofitapplication.app;

import org.mockito.Mockito;

import dagger.Module;
import dagger.Provides;
import reactive.android.albul.ru.retrofitapplication.gson.presenters.RetrofitApi;

@Module
public class TestModule {
    @Provides
    public RetrofitApi provideRetrofitApi(){
        return Mockito.mock(RetrofitApi.class);
    }
}

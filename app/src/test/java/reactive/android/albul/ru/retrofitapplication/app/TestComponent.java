package reactive.android.albul.ru.retrofitapplication.app;

import javax.inject.Singleton;

import reactive.android.albul.ru.retrofitapplication.gson.presenters.RetrofitPresenter;

@Singleton
@Component(modules = {TestModule.class})
public interface TestComponent {
    void inject(RetrofitPresenter presenter);
}

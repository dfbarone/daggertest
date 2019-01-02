package app.dfbarone.com.dagger2test;

import javax.inject.Singleton;

import app.dfbarone.com.dagger2test.dagger2.AppModule;
import app.dfbarone.com.mylibrary.dagger2.LibModule;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                AppModule.class,
                LibModule.class
        }
)
public interface AppComponent extends AndroidInjector<App> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<App> {


    }

}

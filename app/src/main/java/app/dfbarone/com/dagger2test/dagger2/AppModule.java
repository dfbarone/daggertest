package app.dfbarone.com.dagger2test.dagger2;

import android.app.Application;

import javax.inject.Singleton;

import app.dfbarone.com.dagger2test.App;
import app.dfbarone.com.dagger2test.MainActivity;
import app.dfbarone.com.mylibrary.dagger2.ActivityScope;
import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class AppModule {
    @ActivityScope
    @ContributesAndroidInjector//(modules = ActivityModule.class)
    abstract MainActivity mainActivityInjector();

    @Binds
    @Singleton
    abstract Application application(App app);
}

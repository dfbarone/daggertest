package app.dfbarone.com.dagger2test.dagger2;

import android.content.Context;

import app.dfbarone.com.dagger2test.MainActivity;
import app.dfbarone.com.mylibrary.dagger2.ActivityScope;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface ActivityModule {
    //@ActivityScope
    //@ContributesAndroidInjector//(modules = FragmentModule.class)
    //MainFragment mainFragmentInjector();

    //void inject(MainActivity mainActivity);

}

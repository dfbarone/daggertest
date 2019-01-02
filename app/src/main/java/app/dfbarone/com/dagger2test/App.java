package app.dfbarone.com.dagger2test;

import android.content.Context;
import android.support.multidex.MultiDex;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class App extends DaggerApplication {

    @Override
    public AndroidInjector applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

}

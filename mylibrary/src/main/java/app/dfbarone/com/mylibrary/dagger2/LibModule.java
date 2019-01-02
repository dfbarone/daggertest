package app.dfbarone.com.mylibrary.dagger2;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class LibModule {

    @Provides
    @Singleton
    public Context getApplcationContext(Application application) {
        return application.getApplicationContext();
    }

    @Provides
    @Singleton
    public SharedPreferences getDefaultSharedPreferences(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }
}

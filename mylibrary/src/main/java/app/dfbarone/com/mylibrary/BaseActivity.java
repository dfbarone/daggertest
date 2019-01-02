package app.dfbarone.com.mylibrary;

import android.content.SharedPreferences;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class BaseActivity extends DaggerAppCompatActivity {

    @Inject
    SharedPreferences sharedPreferences;

}

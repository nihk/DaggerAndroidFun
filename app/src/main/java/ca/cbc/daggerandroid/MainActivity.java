package ca.cbc.daggerandroid;

import android.content.Context;
import android.os.Bundle;

import javax.inject.Inject;

import ca.cbc.daggerandroid.di.app.ApplicationContext;
import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    @Inject
    @ApplicationContext
    Context context;

    @Inject
    Navigator navigator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            navigator.toMainFragment();
        }
    }
}

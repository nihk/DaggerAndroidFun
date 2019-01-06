package ca.cbc.daggerandroid.di.activity;

import android.support.v4.app.FragmentManager;

import ca.cbc.daggerandroid.MainActivity;
import ca.cbc.daggerandroid.R;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class NavigationModule {

    @ActivityScope
    @Provides
    public static FragmentManager fragmentManager(MainActivity mainActivity) {
        return mainActivity.getSupportFragmentManager();
    }

    @ActivityScope
    @Provides
    @FragmentContainerId
    public static int fragmentContainerId() {
        return R.id.container;
    }
}

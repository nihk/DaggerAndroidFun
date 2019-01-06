package ca.cbc.daggerandroid.di.activity;

import ca.cbc.daggerandroid.MainActivity;
import ca.cbc.daggerandroid.di.fragment.FragmentModule;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = {FragmentModule.class, NavigationModule.class})
    public abstract MainActivity mainActivity();
}

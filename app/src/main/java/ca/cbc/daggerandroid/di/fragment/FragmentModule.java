package ca.cbc.daggerandroid.di.fragment;

import ca.cbc.daggerandroid.MainFragment;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = {MainFragmentModule.class})
    public abstract MainFragment mainFragment();
}

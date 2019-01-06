package ca.cbc.daggerandroid.di.fragment;

import android.view.View;

import java.util.Random;

import ca.cbc.daggerandroid.MainFragment;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class MainFragmentModule {

    @FragmentScope
    @Provides
    public static View view(MainFragment mainFragment) {
        return mainFragment.getView();
    }

    @FragmentScope
    @Provides
    public static Random random() {
        return new Random();
    }

    @Provides
    @RandomNumber
    public static int randomNumber(Random random) {
        return random.nextInt();
    }
}

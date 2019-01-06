package ca.cbc.daggerandroid;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import javax.inject.Inject;

import ca.cbc.daggerandroid.di.activity.ActivityScope;
import ca.cbc.daggerandroid.di.activity.FragmentContainerId;

@ActivityScope
public class Navigator {

    private final FragmentManager fragmentManager;
    @FragmentContainerId
    private final int fragmentContainerId;

    @Inject
    public Navigator(FragmentManager fragmentManager, @FragmentContainerId int fragmentContainerId) {
        this.fragmentManager = fragmentManager;
        this.fragmentContainerId = fragmentContainerId;
    }

    private int to(Fragment fragment) {
        return fragmentManager.beginTransaction()
                .replace(fragmentContainerId, fragment)
                .commit();
    }

    public int toMainFragment() {
        return to(new MainFragment());
    }
}

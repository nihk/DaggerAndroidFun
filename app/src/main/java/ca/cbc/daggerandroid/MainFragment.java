package ca.cbc.daggerandroid;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;
import javax.inject.Provider;

import ca.cbc.daggerandroid.di.app.ApplicationContext;
import ca.cbc.daggerandroid.di.fragment.RandomNumber;
import dagger.Lazy;
import dagger.android.support.DaggerFragment;

public class MainFragment extends DaggerFragment {

    private static final String TAG = MainFragment.class.getSimpleName();

    @Inject
    @ApplicationContext
    Context context;

    @Inject
    Navigator navigator;

    @Inject
    Lazy<View> view;

    @Inject
    @RandomNumber
    Provider<Integer> randomNumberProvider;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        assert view.get() != null;

        for (int i = 1; i != 11; ++i) {
            Log.d(TAG, i + ". " + randomNumberProvider.get());
        }
    }
}

package ca.cbc.daggerandroid.di.app;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class AppModule {

    @Singleton
    @Binds
    @ApplicationContext
    public abstract Context applicationContext(Application application);
}

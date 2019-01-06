package ca.cbc.daggerandroid.di.app;

import android.app.Application;

import javax.inject.Singleton;

import ca.cbc.daggerandroid.App;
import ca.cbc.daggerandroid.di.activity.ActivityModule;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {AndroidSupportInjectionModule.class, AppModule.class, ActivityModule.class})
public interface AppComponent extends AndroidInjector<App> {

    @Component.Builder
    interface Builder {

        AppComponent build();

        @BindsInstance
        Builder application(Application application);
    }
}

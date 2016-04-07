package com.tlongdev.androinit;

import android.app.Application;

import com.tlongdev.androinit.component.DaggerInteractorComponent;
import com.tlongdev.androinit.component.InteractorComponent;
import com.tlongdev.androinit.module.AppModule;
import com.tlongdev.androinit.module.ThreadingModule;

/**
 * @author Long
 * @since 2016. 04. 07.
 */
public class InitApplication extends Application {

    private InteractorComponent mInteractorComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        AppModule appModule = new AppModule(this);
        ThreadingModule threadingModule = new ThreadingModule();

        mInteractorComponent = DaggerInteractorComponent.builder()
                .appModule(appModule)
                .threadingModule(threadingModule)
                .build();
    }

    public InteractorComponent getInteractorComponent() {
        return mInteractorComponent;
    }
}

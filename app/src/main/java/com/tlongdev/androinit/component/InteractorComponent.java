package com.tlongdev.androinit.component;

import com.tlongdev.androinit.domain.interactor.AbstractInteractor;
import com.tlongdev.androinit.module.AppModule;
import com.tlongdev.androinit.module.ThreadingModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Component that injects objects used by interactors.
 */
@Singleton
@Component(modules = {ThreadingModule.class, AppModule.class})
public interface InteractorComponent {
    void inject(AbstractInteractor abstractInteractor);
}

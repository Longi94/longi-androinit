package com.tlongdev.androinit.component;

import com.tlongdev.androinit.domain.interactor.AbstractInteractor;
import com.tlongdev.androinit.module.AppModule;
import com.tlongdev.androinit.module.ThreadingModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Long
 * @since 2016. 04. 08.
 */
@Singleton
@Component(modules = {ThreadingModule.class, AppModule.class})
public interface InteractorComponent {
    void inject(AbstractInteractor abstractInteractor);
}

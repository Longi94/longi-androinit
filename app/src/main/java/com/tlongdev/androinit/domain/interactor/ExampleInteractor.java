package com.tlongdev.androinit.domain.interactor;

import com.tlongdev.androinit.InitApplication;

/**
 * @author Long
 * @since 2016. 04. 08.
 */
public class ExampleInteractor extends AbstractInteractor implements Interactor {

    public ExampleInteractor(InitApplication application) {
        super(application.getInteractorComponent());
    }

    @Override
    public void run() {

    }
}

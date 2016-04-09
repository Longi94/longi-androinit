package com.tlongdev.androinit.domain.interactor;

import com.tlongdev.androinit.InitApplication;

public class ExampleInteractorImpl extends AbstractInteractor implements ExampleInteractor {

    private Callback mCallback;

    public ExampleInteractorImpl(InitApplication application, Callback mCallback) {
        super(application.getInteractorComponent());
        this.mCallback = mCallback;
    }

    @Override
    public void run() {
        int value = 1 + 1;
    }

    private void postFinish() {
        if (mCallback != null) {
            mMainThread.post(new Runnable() {
                @Override
                public void run() {
                    mCallback.onFinish();
                }
            });
        }
    }
}

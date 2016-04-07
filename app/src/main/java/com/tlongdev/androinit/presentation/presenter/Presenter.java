package com.tlongdev.androinit.presentation.presenter;

import com.tlongdev.androinit.presentation.ui.view.BaseView;

public interface Presenter<V extends BaseView> {
    void attachView(V view);
    void detachView();
}
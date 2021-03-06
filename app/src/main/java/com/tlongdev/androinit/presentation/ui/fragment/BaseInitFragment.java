package com.tlongdev.androinit.presentation.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import com.tlongdev.androinit.InitApplication;

public abstract class BaseInitFragment extends Fragment{

    protected InitApplication mApplication;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mApplication = (InitApplication) getActivity().getApplication();
    }
}

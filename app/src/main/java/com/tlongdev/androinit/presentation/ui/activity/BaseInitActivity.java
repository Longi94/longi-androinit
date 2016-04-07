package com.tlongdev.androinit.presentation.ui.activity;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.tlongdev.androinit.InitApplication;

public abstract class BaseInitActivity extends AppCompatActivity {

    protected InitApplication mApplication;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mApplication = (InitApplication) getApplication();

        //Set the color of the status bar
        if (Build.VERSION.SDK_INT >= 21) {
            //getWindow().setStatusBarColor(getResources().getColor(R.color.primary_dark));
        }
    }
}

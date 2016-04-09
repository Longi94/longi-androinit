package com.tlongdev.androinit.module;

import com.tlongdev.androinit.domain.executor.Executor;
import com.tlongdev.androinit.domain.executor.ThreadExecutor;
import com.tlongdev.androinit.threading.MainThread;
import com.tlongdev.androinit.threading.MainThreadImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Threading module.
 */
@Module
public class ThreadingModule {

    @Provides
    @Singleton
    Executor provideExecutor() {
        return ThreadExecutor.getInstance();
    }

    @Provides
    @Singleton
    MainThread provideMainThread() {
        return MainThreadImpl.getInstance();
    }
}
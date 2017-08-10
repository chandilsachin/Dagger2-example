package com.sachinchandil.dagger2_learning_project;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {

    private Context context;

    public ContextModule(MyApplication context) {
        this.context = context;
    }

    @Provides
    public Context getContext() {
        return context;
    }
}

package com.sachinchandil.dagger2_learning_project;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class MyApplicationModule {

    @Provides
    static NetworkApi provideNetworkApi(Context context) {
        return new NetworkApi(context);
    }

    @Provides
    static String provideTestString() {
        return "TestString";
    }
}

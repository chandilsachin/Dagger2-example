package com.sachinchandil.dagger2_learning_project;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MyApplicationModule {

    @ContributesAndroidInjector
    abstract MainActivity contributeActivityInjector();

    @Provides
    static NetworkApi provideNetworkApi(){
        return new NetworkApi();
    }

    @Provides
    static String provideTestString(){
        return "TestString";
    }
}

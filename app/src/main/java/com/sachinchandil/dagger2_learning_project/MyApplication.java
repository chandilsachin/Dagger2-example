package com.sachinchandil.dagger2_learning_project;

import android.app.Application;

public class MyApplication extends Application {

    private static MyApplicationComponent component;

    public static MyApplicationComponent getComponent() {
        return component;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerMyApplicationComponent.builder()
                .contextModule(new ContextModule(this))
                .build();
    }
}

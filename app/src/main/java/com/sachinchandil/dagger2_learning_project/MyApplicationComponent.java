package com.sachinchandil.dagger2_learning_project;

import android.app.Application;

import dagger.Component;

@Component(modules = {ContextModule.class, MyApplicationModule.class})
public interface MyApplicationComponent {

    void inject(MainActivity activity);

    void inject(Application activity);
}

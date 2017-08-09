package com.sachinchandil.dagger2_learning_project;

import dagger.Component;
import dagger.android.AndroidInjector;

@Component(modules = {MyApplicationModule.class})
public interface MyApplicationComponent extends AndroidInjector<MyApplication> {
}

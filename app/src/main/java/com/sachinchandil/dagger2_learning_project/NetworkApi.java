package com.sachinchandil.dagger2_learning_project;

import javax.inject.Inject;

import dagger.Provides;

public class NetworkApi {

    public NetworkApi(){
    }


    public boolean validateUser(String username, String password) {
        // imagine an actual network call here
        // for demo purpose return false in "real" life
        if (username == null || username.length() == 0) {
            return false;
        } else {
            return true;
        }
    }
}

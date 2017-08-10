package com.sachinchandil.dagger2_learning_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    @Inject
    NetworkApi api;

    @Inject
    String testString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyApplication.getComponent().inject(this);
        boolean injected = api != null;
        TextView tvText = findViewById(R.id.tvText);
        String message = "";
        if(injected)
            message = "Injection worked("+testString+") : "+ api.validateUser("Sachin", "pasword");
        else
            message = "Injection did not work";

        tvText.setText(message);
    }
}

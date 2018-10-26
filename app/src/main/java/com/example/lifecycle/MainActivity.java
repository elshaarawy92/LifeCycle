package com.example.lifecycle;

import android.arch.lifecycle.LifecycleObserver;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private IPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MyPresenter(this);
        getLifecycle().addObserver(presenter);
    }
}

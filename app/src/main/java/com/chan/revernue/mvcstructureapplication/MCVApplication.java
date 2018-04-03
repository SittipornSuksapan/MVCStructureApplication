package com.chan.revernue.mvcstructureapplication;

import android.app.Application;

import com.inthecheesefactory.thecheeselibrary.manager.Contextor;

public class MCVApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //
        Contextor.getInstance().init(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}

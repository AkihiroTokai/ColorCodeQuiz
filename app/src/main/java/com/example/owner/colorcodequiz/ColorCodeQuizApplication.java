package com.example.owner.colorcodequiz;

import android.app.Application;

import com.crashlytics.android.Crashlytics;
import com.facebook.FacebookSdk;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParseTwitterUtils;

import io.fabric.sdk.android.Fabric;


/**
 * Created by OWNER on 2015/09/16.
 */
public class ColorCodeQuizApplication extends Application {
    private Tracker tracker;

    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());

        GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);

        tracker = analytics.newTracker(R.xml.app_tracker);

        Parse.enableLocalDatastore(this);
        ParseObject.registerSubclass(getData.class);
        FacebookSdk.sdkInitialize(getApplicationContext());

        Parse.initialize(this, "key", "key");
        ParseTwitterUtils.initialize("key", "key");
       // ParseFacebookUtils.initialize("key");


    }
}
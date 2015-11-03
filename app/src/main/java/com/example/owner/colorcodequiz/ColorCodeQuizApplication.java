package com.example.owner.colorcodequiz;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.ParseTwitterUtils;


/**
 * Created by OWNER on 2015/09/16.
 */
public class ColorCodeQuizApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);
        ParseObject.registerSubclass(getData.class);
        FacebookSdk.sdkInitialize(getApplicationContext());

        Parse.initialize(this, "key", "key");
        ParseTwitterUtils.initialize("key", "key");
       // ParseFacebookUtils.initialize("key");
    }
}
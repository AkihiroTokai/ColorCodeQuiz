package com.example.owner.colorcodequiz;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.facebook.FacebookSdk;
import com.parse.GetCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseFacebookUtils;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseTwitterUtils;


/**
 * Created by OWNER on 2015/09/16.
 */
public class ColorCodeQuizApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();

        Parse.enableLocalDatastore(this);
        ParseObject.registerSubclass(getData.class);
        FacebookSdk.sdkInitialize(getApplicationContext());

        Parse.initialize(this, "bXmubL3ilMV11CRRnyP4JTYjvC4lAhlBqRfqOMpB", "LdziUvHA4Yku0TNx2gZNVzjNrjUJFlKGdDygd9Xn");
        //ParseTwitterUtils.initialize("TwitterのConsumer key", "TwitterのConsumer secret");
        ParseFacebookUtils.initialize("1643052322619255");
    }
}


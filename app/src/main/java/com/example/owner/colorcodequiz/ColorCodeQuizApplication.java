package com.example.owner.colorcodequiz;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.parse.Parse;
import com.parse.ParseFacebookUtils;
import com.parse.ParseObject;
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
        ParseTwitterUtils.initialize("NfdDzPee0duxR5blAPdmQbFEO", "PbidbbDG3FY85Pf76dE875zyQy6fTQLFIPEkxwragmQ5pIHP89");
        ParseFacebookUtils.initialize("1643052322619255");
    }
}


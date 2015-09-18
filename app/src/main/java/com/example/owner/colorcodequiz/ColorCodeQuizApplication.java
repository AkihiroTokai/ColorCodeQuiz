package com.example.owner.colorcodequiz;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.parse.GetCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

/**
 * Created by OWNER on 2015/09/16.
 */
public class ColorCodeQuizApplication extends Application {

    private int ull_ColortoCode;
    private int ull_CodetoColor;

    private int nocomp_CodetoColor0;
    private int nocomp_CodetoColor1;
    private int nocomp_CodetoColor2;
    private int nocomp_CodetoColor3;
    private int nocomp_CodetoColor4;
    private int nocomp_CodetoColor5;
    private int nocomp_CodetoColor6;
    private int nocomp_CodetoColor7;
    private int nocomp_CodetoColor8;
    private int nocomp_CodetoColor9;
    private int nocomp_CodetoColor10;

    private int nocomp_ColortoCode1;
    private int nocomp_ColortoCode2;
    private int nocomp_ColortoCode3;
    private int nocomp_ColortoCode4;
    private int nocomp_ColortoCode5;
    private int nocomp_ColortoCode6;
    private int nocomp_ColortoCode7;
    private int nocomp_ColortoCode8;
    private int nocomp_ColortoCode9;
    private int nocomp_ColortoCode10;

    private int nowPoint;
    @Override
    public void onCreate(){
        super.onCreate();

        Parse.enableLocalDatastore(this);
        ParseObject.registerSubclass(getData.class);

        Parse.initialize(this, "bXmubL3ilMV11CRRnyP4JTYjvC4lAhlBqRfqOMpB", "LdziUvHA4Yku0TNx2gZNVzjNrjUJFlKGdDygd9Xn");

    }
}


package com.example.owner.colorcodequiz;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.parse.Parse;

/**
 * Created by OWNER on 2015/09/16.
 */
public class ColorCodeQuizApplication extends Application {

    private int ull_ColortoCode;
    private int ull_CodetoColor;

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
        Parse.initialize(this, "bXmubL3ilMV11CRRnyP4JTYjvC4lAhlBqRfqOMpB", "LdziUvHA4Yku0TNx2gZNVzjNrjUJFlKGdDygd9Xn");

        SharedPreferences prefs = getSharedPreferences("getdata", Context.MODE_PRIVATE);
         ull_CodetoColor = prefs.getInt("LevelSave",1 );
    }

    public int  getull_ColortoCode(){
        return this.ull_ColortoCode;
    }
    public void setull_ColortoCode(int ull_ColortoCode){
        this.ull_ColortoCode = ull_ColortoCode;
    }

    public int  getull_CodetoColor(){
        return this.ull_CodetoColor;
    }
    public void setull_CodetoColor(int ull_CodetoColor){
        this.ull_CodetoColor = ull_CodetoColor;
    }

    public int getnowPoint(){
        return this.nowPoint;
    }
    public void setnowPoint(int nowPoint){
        this.nowPoint = nowPoint;
    }

    public int getnocomp_CodetoColor1(){
        return this.nocomp_CodetoColor1;
    }
    public void setnocomp_CodetoColor1(int nocomp_CodetoColor1){
        this.nocomp_CodetoColor1 = nocomp_CodetoColor1;
    }

    public int getnocomp_CodetoColor2(){
        return this.nocomp_CodetoColor2;
    }
    public void setnocomp_CodetoColor2(int nocomp_CodetoColor2){
        this.nocomp_CodetoColor2 = nocomp_CodetoColor2;
    }

    public int getnocomp_CodetoColor31(){
        return this.nocomp_CodetoColor3;
    }
    public void setnocomp_CodetoColor3(int nocomp_CodetoColor3){
        this.nocomp_CodetoColor3 = nocomp_CodetoColor3;
    }

    public int getnocomp_CodetoColor4(){
        return this.nocomp_CodetoColor4;
    }
    public void setnocomp_CodetoColor4(int nocomp_CodetoColor4){
        this.nocomp_CodetoColor4 = nocomp_CodetoColor4;
    }

    public int getnocomp_CodetoColor5(){
        return this.nocomp_CodetoColor5;
    }
    public void setnocomp_CodetoColor5(int nocomp_CodetoColor5){
        this.nocomp_CodetoColor5 = nocomp_CodetoColor5;
    }

    public int getnocomp_CodetoColor6(){
        return this.nocomp_CodetoColor6;
    }
    public void setnocomp_CodetoColor6(int nocomp_CodetoColor6){
        this.nocomp_CodetoColor6 = nocomp_CodetoColor6;
    }

    public int getnocomp_CodetoColor7(){
        return this.nocomp_CodetoColor7;
    }
    public void setnocomp_CodetoColor7(int nocomp_CodetoColor71){
        this.nocomp_CodetoColor7 = nocomp_CodetoColor71;
    }

    public int getnocomp_CodetoColor8(){
        return this.nocomp_CodetoColor8;
    }
    public void setnocomp_CodetoColor8(int nocomp_CodetoColor8){
        this.nocomp_CodetoColor8 = nocomp_CodetoColor8;
    }

    public int getnocomp_CodetoColor9(){
        return this.nocomp_CodetoColor9;
    }
    public void setnocomp_CodetoColor9(int nocomp_CodetoColor9){
        this.nocomp_CodetoColor9 = nocomp_CodetoColor9;
    }

    public int getnocomp_CodetoColor10(){
        return this.nocomp_CodetoColor10;
    }
    public void setnocomp_CodetoColor10(int nocomp_CodetoColor10){
        this.nocomp_CodetoColor10 = nocomp_CodetoColor10;
    }

    public int getnocomp_ColortoCode1(){
        return this.nocomp_ColortoCode1;
    }
    public void setnocomp_ColortoCode1(int nocomp_ColortoCode1){
        this.nocomp_ColortoCode1 = nocomp_ColortoCode1;
    }

    public int getnocomp_ColortoCode2(){
        return this.nocomp_ColortoCode2;
    }
    public void setnocomp_ColortoCode2(int nocomp_ColortoCode2){
        this.nocomp_ColortoCode2 = nocomp_ColortoCode2;
    }

    public int getnocomp_ColortoCode3(){
        return this.nocomp_ColortoCode3;
    }
    public void setnocomp_ColortoCode3(int nocomp_ColortoCode3){
        this.nocomp_ColortoCode3 = nocomp_ColortoCode3;
    }

    public int getnocomp_ColortoCode4(){
        return this.nocomp_ColortoCode4;
    }
    public void setnocomp_ColortoCode4(int nocomp_ColortoCode4){
        this.nocomp_ColortoCode4 = nocomp_ColortoCode4;
    }

    public int getnocomp_ColortoCode5(){
        return this.nocomp_ColortoCode5;
    }
    public void setnocomp_ColortoCode5(int nocomp_ColortoCode5){
        this.nocomp_ColortoCode5 = nocomp_ColortoCode5;
    }

    public int getnocomp_ColortoCode6(){
        return this.nocomp_ColortoCode6;
    }
    public void setnocomp_ColortoCode6(int nocomp_ColortoCode6){
        this.nocomp_ColortoCode6 = nocomp_ColortoCode6;
    }

    public int getnocomp_ColortoCode7(){
        return this.nocomp_ColortoCode7;
    }
    public void setnocomp_ColortoCode7(int nocomp_ColortoCode7){
        this.nocomp_ColortoCode7 = nocomp_ColortoCode7;
    }

    public int getnocomp_ColortoCode8(){
        return this.nocomp_ColortoCode8;
    }
    public void setnocomp_ColortoCode8(int nocomp_ColortoCode8){
        this.nocomp_ColortoCode8 = nocomp_ColortoCode8;
    }

    public int getnocomp_ColortoCode9(){
        return this.nocomp_ColortoCode9;
    }
    public void setnocomp_ColortoCode9(int nocomp_ColortoCode9){
        this.nocomp_ColortoCode9 = nocomp_ColortoCode9;
    }

    public int getnocomp_ColortoCode10(){
        return this.nocomp_ColortoCode10;
    }
    public void setnocomp_ColortoCode10(int nocomp_ColortoCode10){
        this.nocomp_ColortoCode10 = nocomp_ColortoCode10;
    }
}


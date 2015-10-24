package com.example.owner.colorcodequiz;


import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Random;

public class ColortoCodeActivity extends AppCompatActivity {


    private TextView progress;

    private ImageView question;
    private ImageView check_select1;
    private ImageView check_select2;
    private ImageView check_select3;
    private ImageView check_select4;

    private TextView answer1;
    private TextView answer2;
    private TextView answer3;
    private TextView answer4;

    private String unlockmode;
    private int gameCount;
    private int check_answer;
    private int noq;
    private int noca;
    private int maxlimit;
    private int minlimit;
    private int getPoint;
    private int this_nowPoint;
    private int level;
    private int ull_old;

    private int r , g , b;
    private int r_a1, r_a2, r_a3, g_a1, g_a2, g_a3, b_a1, b_a2, b_a3;
    private int colormode;

    private int this_ull_ColortoCode;
    private int this_ull_CodetoColor;

    private int this_nocomp_CodetoColor1;
    private int this_nocomp_CodetoColor2;
    private int this_nocomp_CodetoColor3;
    private int this_nocomp_CodetoColor4;
    private int this_nocomp_CodetoColor5;
    private int this_nocomp_CodetoColor6;
    private int this_nocomp_CodetoColor7;
    private int this_nocomp_CodetoColor8;
    private int this_nocomp_CodetoColor9;
    private int this_nocomp_CodetoColor10;


    private int this_nocomp_ColortoCode1;
    private int this_nocomp_ColortoCode2;
    private int this_nocomp_ColortoCode3;
    private int this_nocomp_ColortoCode4;
    private int this_nocomp_ColortoCode5;
    private int this_nocomp_ColortoCode6;
    private int this_nocomp_ColortoCode7;
    private int this_nocomp_ColortoCode8;
    private int this_nocomp_ColortoCode9;
    private int this_nocomp_ColortoCode10;

    private boolean nextquestion;

    private String gameResult;
    private String st_colormode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colorto_code);
        gameCount = 1;
        noca = 0;

        answer1 = (TextView) findViewById(R.id.answer1);
        answer2 = (TextView) findViewById(R.id.answer2);
        answer3 = (TextView) findViewById(R.id.answer3);
        answer4 = (TextView) findViewById(R.id.answer4);

        progress = (TextView) findViewById(R.id.progress);

        check_select1 = (ImageView) findViewById(R.id.check_select1);
        check_select2 = (ImageView) findViewById(R.id.check_select2);
        check_select3 = (ImageView) findViewById(R.id.check_select3);
        check_select4 = (ImageView) findViewById(R.id.check_select4);
        question = (ImageView) findViewById(R.id.questioncode);

        Intent intent = getIntent();
        noq = intent.getIntExtra("getnumber", 10);
        maxlimit = intent.getIntExtra("getnumber", 255);
        minlimit = intent.getIntExtra("getnumber", 0);
        level = intent.getIntExtra("getlevel", level);
        colormode = intent.getIntExtra("getcolormode",1);

        //getData(Parse)
       /* getData checkData = new getData();
        ull_CodetoColor = checkData.getull_CodetoColor();
        ull_ColortoCode = checkData.getull_CodetoColor();
        nowPoint = checkData.getnowPoint();

        nocomp_CodetoColor1 = checkData.getnocomp_CodetoColor1();
        nocomp_CodetoColor2 = checkData.getnocomp_CodetoColor2();
        nocomp_CodetoColor3 = checkData.getnocomp_CodetoColor3();
        nocomp_CodetoColor4 = checkData.getnocomp_CodetoColor4();
        nocomp_CodetoColor5 = checkData.getnocomp_CodetoColor5();
        nocomp_CodetoColor6 = checkData.getnocomp_CodetoColor6();
        nocomp_CodetoColor7 = checkData.getnocomp_CodetoColor7();
        nocomp_CodetoColor8 = checkData.getnocomp_CodetoColor8();
        nocomp_CodetoColor9 = checkData.getnocomp_CodetoColor9();
        nocomp_CodetoColor10 = checkData.getnocomp_CodetoColor10();

        nocomp_ColortoCode1 = checkData.getnocomp_ColortoCode1();
        nocomp_ColortoCode2 = checkData.getnocomp_ColortoCode2();
        nocomp_ColortoCode3 = checkData.getnocomp_ColortoCode3();
        nocomp_ColortoCode4 = checkData.getnocomp_ColortoCode4();
        nocomp_ColortoCode5 = checkData.getnocomp_ColortoCode5();
        nocomp_ColortoCode6 = checkData.getnocomp_ColortoCode6();
        nocomp_ColortoCode7 = checkData.getnocomp_ColortoCode7();
        nocomp_ColortoCode8 = checkData.getnocomp_ColortoCode8();
        nocomp_ColortoCode9 = checkData.getnocomp_ColortoCode9();
        nocomp_ColortoCode10 = checkData.getnocomp_ColortoCode10();     */

    /*    Calendar cal = Calendar.getInstance();
        int nowyear = cal.get(Calendar.YEAR);
        String stnowyear = String.valueOf(nowyear);
        int nowmoth = cal.get(Calendar.MONTH);
        String stnowmonth = String.valueOf(nowmoth);
        int nowday  = cal.get(Calendar.DAY_OF_MONTH);
        String stnowday = String.valueOf(nowday);
        String nowdate =  (stnowyear+stnowmonth+stnowday);
        if ("getpoint"+ nowdate == null){

        } else {
            getPoint = checkData.getgetPoint();
        }                                        */

        //getData（SharedPreference)
        if (colormode == 1) {
            st_colormode = "RGB_";

            SharedPreferences getData = getSharedPreferences("DataSave", Context.MODE_PRIVATE);
            this_ull_CodetoColor = getData.getInt("RGB_ull_CodetoColor", 0);
            this_ull_ColortoCode = getData.getInt("RGB_ull_ColortoCode", 0);
            this_nowPoint = getData.getInt("RGB_nowPoint", 0);

            this_nocomp_CodetoColor1 = getData.getInt("RGB_nocomp_CodetoColor1", 0);
            this_nocomp_CodetoColor2 = getData.getInt("RGB_nocomp_CodetoColor2", 0);
            this_nocomp_CodetoColor3 = getData.getInt("RGB_nocomp_CodetoColor3", 0);
            this_nocomp_CodetoColor4 = getData.getInt("RGB_nocomp_CodetoColor4", 0);
            this_nocomp_CodetoColor5 = getData.getInt("RGB_nocomp_CodetoColor5", 0);
            this_nocomp_CodetoColor6 = getData.getInt("RGB_nocomp_CodetoColor6", 0);
            this_nocomp_CodetoColor7 = getData.getInt("RGB_nocomp_CodetoColor7", 0);
            this_nocomp_CodetoColor8 = getData.getInt("RGB_nocomp_CodetoColor8", 0);
            this_nocomp_CodetoColor9 = getData.getInt("RGB_nocomp_CodetoColor9", 0);
            this_nocomp_CodetoColor10 = getData.getInt("RGB_nocomp_CodetoColor10", 0);

            this_nocomp_ColortoCode1 = getData.getInt("RGB_nocomp_ColortoCode1", 0);
            this_nocomp_ColortoCode2 = getData.getInt("RGB_nocomp_ColortoCode2", 0);
            this_nocomp_ColortoCode3 = getData.getInt("RGB_nocomp_ColortoCode3", 0);
            this_nocomp_ColortoCode4 = getData.getInt("RGB_nocomp_ColortoCode4", 0);
            this_nocomp_ColortoCode5 = getData.getInt("RGB_nocomp_ColortoCode5", 0);
            this_nocomp_ColortoCode6 = getData.getInt("RGB_nocomp_ColortoCode6", 0);
            this_nocomp_ColortoCode7 = getData.getInt("RGB_nocomp_ColortoCode7", 0);
            this_nocomp_ColortoCode8 = getData.getInt("RGB_nocomp_ColortoCode8", 0);
            this_nocomp_ColortoCode9 = getData.getInt("RGB_nocomp_ColortoCode9", 0);
            this_nocomp_ColortoCode10 = getData.getInt("RGB_nocomp_ColortoCode10", 0);
        } else if(colormode == 2){
            st_colormode = "HSB_";

            SharedPreferences getData = getSharedPreferences("DataSave", Context.MODE_PRIVATE);
            this_ull_CodetoColor = getData.getInt("HSB_ull_CodetoColor", 0);
            this_ull_ColortoCode = getData.getInt("HSB_ull_ColortoCode", 0);
            this_nowPoint = getData.getInt("HSB_nowPoint", 0);

            this_nocomp_CodetoColor1 = getData.getInt("HSB_nocomp_CodetoColor1", 0);
            this_nocomp_CodetoColor2 = getData.getInt("HSB_nocomp_CodetoColor2", 0);
            this_nocomp_CodetoColor3 = getData.getInt("HSB_nocomp_CodetoColor3", 0);
            this_nocomp_CodetoColor4 = getData.getInt("HSB_nocomp_CodetoColor4", 0);
            this_nocomp_CodetoColor5 = getData.getInt("HSB_nocomp_CodetoColor5", 0);
            this_nocomp_CodetoColor6 = getData.getInt("HSB_nocomp_CodetoColor6", 0);
            this_nocomp_CodetoColor7 = getData.getInt("HSB_nocomp_CodetoColor7", 0);
            this_nocomp_CodetoColor8 = getData.getInt("HSB_nocomp_CodetoColor8", 0);
            this_nocomp_CodetoColor9 = getData.getInt("HSB_nocomp_CodetoColor9", 0);
            this_nocomp_CodetoColor10 = getData.getInt("HSB_nocomp_CodetoColor10", 0);

            this_nocomp_ColortoCode1 = getData.getInt("HSB_nocomp_ColortoCode1", 0);
            this_nocomp_ColortoCode2 = getData.getInt("HSB_nocomp_ColortoCode2", 0);
            this_nocomp_ColortoCode3 = getData.getInt("HSB_nocomp_ColortoCode3", 0);
            this_nocomp_ColortoCode4 = getData.getInt("HSB_nocomp_ColortoCode4", 0);
            this_nocomp_ColortoCode5 = getData.getInt("HSB_nocomp_ColortoCode5", 0);
            this_nocomp_ColortoCode6 = getData.getInt("HSB_nocomp_ColortoCode6", 0);
            this_nocomp_ColortoCode7 = getData.getInt("HSB_nocomp_ColortoCode7", 0);
            this_nocomp_ColortoCode8 = getData.getInt("HSB_nocomp_ColortoCode8", 0);
            this_nocomp_ColortoCode9 = getData.getInt("HSB_nocomp_ColortoCode9", 0);
            this_nocomp_ColortoCode10 = getData.getInt("HSB_nocomp_ColortoCode10", 0);
        }
        setanswer();
    }

    public void select1(View view) {
        if (!nextquestion) {
            if (check_answer == 1) {
                check_select1.setImageResource(R.drawable.maru);
            } else {
                check_select1.setImageResource(R.drawable.batu);
                noca = noca + 1;
            }
            if (gameCount <= noq) {
                showRightanswer();
                gameCount = gameCount + 1;
                progress.setText("Progress:" + gameCount + "/" + noq);
                nextquestion = true;
            }
            if (gameCount >= noq) {
                gameFinish();
            } else {
                setanswer();
                nextquestion = false;
            }
        }
    }


    public void select2(View view) {
        if (!nextquestion)   {
            if (check_answer == 2) {
                check_select2.setImageResource(R.drawable.maru);
                noca = noca+1;
            } else {
                check_select2.setImageResource(R.drawable.batu);
            }
            if (gameCount <= noq) {
                showRightanswer();
                gameCount = gameCount + 1;
                progress.setText("Progress:" + gameCount + "/" + noq);
                nextquestion = true;
            }  if (gameCount >= noq ){
               gameFinish();
            }
        }else {
            setanswer();
            nextquestion = false;
        }
    }

    public void select3(View view) {
        if (!nextquestion) {
            if (check_answer == 3) {
                check_select3.setImageResource(R.drawable.maru);
                noca = noca+1;
            } else {
                check_select3.setImageResource(R.drawable.batu);
            }
            if (gameCount <= noq) {
                showRightanswer();
                gameCount = gameCount + 1;
                progress.setText("Progress:" + gameCount + "/"+ noq);
                nextquestion = true;
            }if (gameCount >= noq){
                gameFinish();
            }
        }else {
            setanswer();
            nextquestion = false;
        }
    }

    public void select4(View view) {
        if (!nextquestion )   {
            if (check_answer == 4) {
                check_select4.setImageResource(R.drawable.maru);
            } else {
                check_select4.setImageResource(R.drawable.batu);
            }
            if (gameCount <= noq) {
                showRightanswer();
                gameCount = gameCount + 1;
                progress.setText("Progress:" + gameCount + "/"+ noq);
                nextquestion = true;
            }if(gameCount >= noq){
              gameFinish();
            }
            nextquestion = true;
        }else {
            setanswer();
            nextquestion = false;
        }

    }

    public void showRightanswer(){
        switch (check_answer) {
            case 1:
                answer1.setTextColor(Color.rgb(r, g, b));
                answer2.setTextColor(Color.rgb(r_a1, g_a1, b_a1));
                answer3.setTextColor(Color.rgb(r_a2, g_a2, b_a2));
                answer4.setTextColor(Color.rgb(r_a3, g_a3, b_a3));
            break;

            case 2:
                answer1.setTextColor(Color.rgb(r_a1, g_a1, b_a1));
                answer2.setTextColor(Color.rgb(r, g, b));
                answer3.setTextColor(Color.rgb(r_a2, g_a2, b_a2));
                answer4.setTextColor(Color.rgb(r_a3, g_a3, b_a3));
            break;

            case 3:
                answer1.setTextColor(Color.rgb(r_a1, g_a1, b_a1));
                answer2.setTextColor(Color.rgb(r_a2, g_a2, b_a2));
                answer3.setTextColor(Color.rgb(r, g, b));
                answer4.setTextColor(Color.rgb(r_a3, g_a3, b_a3));
            break;

            case 4:
                answer1.setTextColor(Color.rgb(r_a1, g_a1, b_a1));
                answer2.setTextColor(Color.rgb(r_a2, g_a2, b_a2));
                answer3.setTextColor(Color.rgb(r_a3, g_a3, b_a3));
                answer4.setTextColor(Color.rgb(r, g, b));
            break;
        }
    }


    public void gameFinish(){
        //Add:Score
        if (level <= 3) {
            if (noca <= 7) {
                getPoint = 1;
                gameResult = "クリアできませんでした。";
            } else if (noca == 8) {
                getPoint = 10;
                gameResult = "クリアしました。";
            } else if ( noca == 9 ||noca == 10) {
                getPoint = 11;
                gameResult = "クリアしました。";
            }
        }
        else if (level >= 4 && level <= 8) {
            if(noca <= 6) {
                getPoint = 2;
                gameResult = "クリアできませんでした。";
            } else if (noca == 7 || noca == 8) {
                getPoint = 12;
                gameResult = "クリアしました。";
            } else if (noca == 9) {
                getPoint = 13;
                gameResult = "クリアしました。";
            }else if(noca == 10){
                getPoint = 14;
                gameResult = "クリアしました。";
            }
        }
        else if (level>=9&&level<=10){
            if (noca <= 7) {
                 getPoint = 3;
                gameResult = "クリアできませんでした。";
            } else if (noca == 8) {
                 getPoint = 14;
                gameResult = "クリアしました。";
            } else if (noca == 9) {
                 getPoint = 15;
                gameResult = "クリアしました。";
            } else if (noca == 10) {
                getPoint = 16;
                gameResult = "クリアしました。";
            }
        }

        this_nowPoint = this_nowPoint + getPoint ;

        // Count:nocomp
       switch(level) {
           case 1:
               getData checkData1 = new getData();
               this_nocomp_ColortoCode1++;
               checkData1.setnocomp_ColortoCode1(this_nocomp_ColortoCode1);
           break;

           case 2:
               getData checkData2 = new getData();
               this_nocomp_ColortoCode2++;
               checkData2.setnocomp_ColortoCode2(this_nocomp_ColortoCode2);
           break;

           case 3:
               getData checkData3 = new getData();
               this_nocomp_ColortoCode3++;
               checkData3.setnocomp_ColortoCode3(this_nocomp_ColortoCode3);
           break;

           case 4:
               getData checkData4 = new getData();
               this_nocomp_ColortoCode4++;
               checkData4.setnocomp_ColortoCode4(this_nocomp_ColortoCode4);

           case 5:
               getData checkData5 = new getData();
               this_nocomp_ColortoCode5++;
               checkData5.setnocomp_ColortoCode5(this_nocomp_ColortoCode5);
           break;

           case 6:
               getData checkData6 = new getData();
               this_nocomp_ColortoCode6++;
               checkData6.setnocomp_ColortoCode6(this_nocomp_ColortoCode6);
           break;

           case 7:
               getData checkData7 = new getData();
               this_nocomp_ColortoCode7++;
               checkData7.setnocomp_ColortoCode7(this_nocomp_ColortoCode7);
           break;

           case 8:
               getData checkData8 = new getData();
               this_nocomp_ColortoCode8++;
               checkData8.setnocomp_ColortoCode8(this_nocomp_ColortoCode8);
           break;

           case 9:
               getData checkData9 = new getData();
               this_nocomp_ColortoCode9++;
               checkData9.setnocomp_ColortoCode9(this_nocomp_ColortoCode9);
           break;

           case 10:
               getData checkData10 = new getData();
               this_nocomp_ColortoCode10++;
               checkData10.setnocomp_ColortoCode10(this_nocomp_ColortoCode10);
           break;
       }

        //Check:Levelup(ColortoCode)
        if (this_ull_ColortoCode  == 1 && this_nowPoint >= 60 &&  this_nocomp_ColortoCode1 >= 3 ){
            unlockmode = "ColortoCode";
            this_ull_ColortoCode  = 2;
            ulm_ColortoCode();
            ull_old = this_ull_ColortoCode-1;
        }

        else if(this_ull_ColortoCode == 2 && this_nowPoint >= 90 && this_nocomp_ColortoCode2>= 3 ){
            unlockmode = "ColortoCode";
            this_ull_ColortoCode = 3;
            ull_old = this_ull_ColortoCode-1;
            ulm_ColortoCode();
        }

        else if(this_ull_ColortoCode == 3 && this_nowPoint >= 125 && this_nocomp_ColortoCode3 >= 3){
            unlockmode = "ColortoCode";
            this_ull_ColortoCode = 4;
            ull_old = this_ull_ColortoCode-1;
            ulm_ColortoCode();
        }

        else if(this_ull_ColortoCode == 4 && this_nowPoint >= 180 && this_nocomp_ColortoCode4 >= 4 && this_ull_CodetoColor>= 3){
            unlockmode = "ColortoCode";
            this_ull_ColortoCode = 5;
            ull_old = this_ull_ColortoCode-1;
            ulm_ColortoCode();
        }

        else if(this_ull_ColortoCode == 5 && this_nowPoint >= 240 && this_nocomp_ColortoCode5 >= 4) {
            unlockmode = "ColortoCode";
            this_ull_ColortoCode = 6;
            ull_old = this_ull_ColortoCode-1;
           ulm_ColortoCode();
        }

        else if(this_ull_ColortoCode == 6 && this_nowPoint >= 320 && this_nocomp_ColortoCode6 >= 5 && this_ull_CodetoColor>= 5){
            unlockmode = "ColortoCode";
            this_ull_ColortoCode = 7;
            ull_old = this_ull_ColortoCode-1;
            ulm_ColortoCode();
        }

        else if(this_ull_ColortoCode == 7 && this_nowPoint >= 425 && this_nocomp_ColortoCode7 >= 6){
            unlockmode = "ColortoCode";
            this_ull_ColortoCode = 8;
            ull_old = this_ull_ColortoCode-1;
            ulm_ColortoCode();
        }

        else if(this_ull_ColortoCode == 8 && this_nowPoint >= 560 && this_nocomp_ColortoCode8 >= 7 && this_ull_CodetoColor>= 7){
            unlockmode = "ColortoCode";
            this_ull_ColortoCode = 9;
            ull_old = this_ull_ColortoCode-1;
            ulm_ColortoCode();
        }

        else if(this_ull_ColortoCode == 9 && this_nowPoint >= 750 && this_nocomp_ColortoCode9 >= 8){
            unlockmode = "ColortoCode";
            this_ull_ColortoCode = 10;
            ull_old = this_ull_ColortoCode-1;
            ulm_ColortoCode();
        }

        else if(this_ull_ColortoCode == 10 && this_nowPoint >= 1000 && this_nocomp_ColortoCode10 >= 10){
            unlockmode = "ColortoCode";
            this_ull_ColortoCode = 11;
            ull_old = this_ull_ColortoCode-1;
            compm();
        }


        //Check:Levelup(CodetoColor)
        if (this_ull_CodetoColor  == 1 && this_nowPoint >= 60 && this_nocomp_CodetoColor1 >= 3 ){
            unlockmode = "CodetoColor";
            this_ull_CodetoColor  = 2;
            ull_old = this_ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if(this_ull_CodetoColor == 2 && this_nowPoint >= 90 && this_nocomp_CodetoColor2 >= 3 ){
            unlockmode = "CodetoColor";
            this_ull_CodetoColor = 3;
            ull_old = this_ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if(this_ull_CodetoColor == 3 && this_nowPoint >= 125 && this_nocomp_CodetoColor3 >= 3){
            unlockmode = "CodetoColor";
            this_ull_CodetoColor = 4;
            ull_old = this_ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if(this_ull_CodetoColor == 4 && this_nowPoint >= 180 && this_nocomp_CodetoColor4 >= 4 && this_ull_ColortoCode>= 3){
            unlockmode = "CodetoColor";
            this_ull_CodetoColor = 5;
            ull_old = this_ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if(this_ull_CodetoColor == 5 && this_nowPoint >= 240 && this_nocomp_CodetoColor5 >= 4) {
            unlockmode = "CodetoColor";
            this_ull_CodetoColor = 6;
            ull_old = this_ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if(this_ull_CodetoColor == 6 && this_nowPoint >= 320 && this_nocomp_CodetoColor6 >= 5 && this_ull_ColortoCode>= 5){
            unlockmode = "CodetoColor";
            this_ull_CodetoColor = 7;
            ull_old = this_ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if(this_ull_CodetoColor == 7 && this_nowPoint >= 425 && this_nocomp_CodetoColor7 >= 6){
            unlockmode = "CodetoColor";
            this_ull_CodetoColor = 8;
            ull_old = this_ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if(this_ull_CodetoColor == 8 && this_nowPoint >= 560 && this_nocomp_CodetoColor8 >= 7 && this_ull_ColortoCode>= 7){
            unlockmode = "CodetoColor";
            this_ull_CodetoColor = 9;
            ull_old = this_ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if(this_ull_CodetoColor == 9 && this_nowPoint >= 750 && this_nocomp_CodetoColor9 >= 8){
            unlockmode = "CodetoColor";
            this_ull_CodetoColor= 10;
            ull_old = this_ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if(this_ull_CodetoColor == 10 && this_nowPoint >= 1000 && this_nocomp_CodetoColor10 >= 10){
            unlockmode = "CodetoColor";
            this_ull_CodetoColor = 11;
            ull_old = this_ull_CodetoColor-1;
            compm();
        }

        //saveData (Parse)
    /*    getData checkData = new getData();
        checkData.setull_CodetoColor(ull_CodetoColor);
        checkData.setull_ColortoCode(ull_ColortoCode);
        checkData.setnowPoint(nowPoint);
        checkData.setgetPoint(getPoint);
        checkData.saveEventually();       */

        //saveData（SharedPreference)
        if (colormode == 1) {
            SharedPreferences getData = getSharedPreferences("DataSave", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = getData.edit();

            editor.putInt("RGB_ull_CodetoColor", this_ull_CodetoColor);
            editor.putInt("RGB_ull_ColoretoCode", this_ull_ColortoCode);
            editor.putInt("RGB_nowPoint", this_nowPoint);

            editor.putInt("RGB_nocomp_ColortoCode1", this_nocomp_ColortoCode1);
            editor.putInt("RGB_nocomp_ColortoCode2", this_nocomp_ColortoCode2);
            editor.putInt("RGB_nocomp_ColortoCode3", this_nocomp_ColortoCode3);
            editor.putInt("RGB_nocomp_ColortoCode4", this_nocomp_ColortoCode4);
            editor.putInt("RGB_nocomp_ColortoCode5", this_nocomp_ColortoCode5);
            editor.putInt("RGB_nocomp_ColortoCode6", this_nocomp_ColortoCode6);
            editor.putInt("RGB_nocomp_ColortoCode7", this_nocomp_ColortoCode7);
            editor.putInt("RGB_nocomp_ColortoCode8", this_nocomp_ColortoCode8);
            editor.putInt("RGB_nocomp_ColortoCode9", this_nocomp_ColortoCode9);
            editor.putInt("RGB_nocomp_ColortoCode10", this_nocomp_ColortoCode10);
            editor.apply();
        } else if (colormode == 2) {
            SharedPreferences getData = getSharedPreferences("DataSave", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = getData.edit();

            editor.putInt("HSB_ull_CodetoColor", this_ull_CodetoColor);
            editor.putInt("HSB_ull_ColoretoCode", this_ull_ColortoCode);
            editor.putInt("HSB_nowPoint", this_nowPoint);

            editor.putInt("HSB_nocomp_ColortoCode1", this_nocomp_ColortoCode1);
            editor.putInt("HSB_nocomp_ColortoCode2", this_nocomp_ColortoCode2);
            editor.putInt("HSB_nocomp_ColortoCode3", this_nocomp_ColortoCode3);
            editor.putInt("HSB_nocomp_ColortoCode4", this_nocomp_ColortoCode4);
            editor.putInt("HSB_nocomp_ColortoCode5", this_nocomp_ColortoCode5);
            editor.putInt("HSB_nocomp_ColortoCode6", this_nocomp_ColortoCode6);
            editor.putInt("HSB_nocomp_ColortoCode7", this_nocomp_ColortoCode7);
            editor.putInt("HSB_nocomp_ColortoCode8", this_nocomp_ColortoCode8);
            editor.putInt("HSB_nocomp_ColortoCode9", this_nocomp_ColortoCode9);
            editor.putInt("HSB_nocomp_ColortoCode10", this_nocomp_ColortoCode10);
            editor.apply();
        }

        //gameFinish
        new AlertDialog.Builder(ColortoCodeActivity.this)
                .setTitle( getPoint + "Point獲得しました。")
                .setMessage(noq + "問中" + noca + "問正解したので、" + gameResult)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // OK button pressed
                        Intent intent = new Intent(ColortoCodeActivity.this, MenuActivity.class);
                        intent.putExtra("nowScore",this_nowPoint);
                        intent.putExtra("getScore",getPoint);
                        intent.putExtra("ull_ColortoCode ",this_ull_ColortoCode );
                        startActivity(intent);
                    }
                }).show();
    }

    public  void ulm_CodetoColor(){
        new AlertDialog.Builder(ColortoCodeActivity.this)
                .setTitle(st_colormode + unlockmode + "Level" + ull_old + "をMasterしました！")
                .setMessage(unlockmode + "Level" + this_ull_CodetoColor + "がUnLockされました。おめでとうございます。Twetterに投稿しますか？")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // OK button pressed
                        tweeting();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    public  void ulm_ColortoCode(){
        new AlertDialog.Builder(ColortoCodeActivity.this)
                .setTitle(st_colormode + unlockmode + "Level" + ull_old + "をMasterしました！")
                .setMessage(unlockmode + "Level" + this_ull_ColortoCode + "がUnLockされました。おめでとうございます。Twetterに投稿しますか？")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // OK button pressed
                        tweeting();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    public void compm(){
        new AlertDialog.Builder(ColortoCodeActivity.this)
                .setTitle(st_colormode + unlockmode+"をMasterしました！")
                .setMessage("おめでとうございます。Twetterに投稿しますか？")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // OK button pressed
                        tweeting();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }

    private void tweeting() {
        String strTweet = "";
        String strMessage = st_colormode + unlockmode + ull_old + "をMasterしました！";
        String strHashTag = "#Why don't you be a color code master? ";
        String strUrl = "https://twitter.com/tr_techrelation";
        try {
            strTweet = "http://twitter.com/intent/tweet?text="
                    + URLEncoder.encode(strMessage, "UTF-8")
                    + "+"
                    + URLEncoder.encode(strHashTag, "UTF-8")
                    + "&url="
                    + URLEncoder.encode(strUrl, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(strTweet));
        startActivity(intent);
    }

    public void setanswer() {
        if (colormode == 1) {
            //createColorCode
            Random rnd1 = new Random();
            r = rnd1.nextInt(256);
            Random rnd2 = new Random();
            g = rnd2.nextInt(256);
            Random rnd3 = new Random();
            b = rnd3.nextInt(256);


            //createChoicesColorcode
            while (true) {

                Random rnd5 = new Random();
                r_a1 = rnd5.nextInt(256);
                Random rnd6 = new Random();
                r_a2 = rnd6.nextInt(256);
                Random rnd7 = new Random();
                r_a3 = rnd7.nextInt(256);

                Random rnd8 = new Random();
                g_a1 = rnd8.nextInt(256);
                Random rnd9 = new Random();
                g_a2 = rnd9.nextInt(256);
                Random rnd10 = new Random();
                g_a3 = rnd10.nextInt(256);

                Random rnd11 = new Random();
                b_a1 = rnd11.nextInt(256);
                Random rnd12 = new Random();
                b_a2 = rnd12.nextInt(256);
                Random rnd13 = new Random();
                b_a3 = rnd13.nextInt(256);


                int abs_r1_2 = Math.abs(r_a1 - r_a2);
                int abs_r2_3 = Math.abs(r_a2 - r_a3);
                int abs_r3_1 = Math.abs(r_a3 - r_a1);
                int abs_r_1 = Math.abs(r - r_a1);
                int abs_r_2 = Math.abs(r - r_a2);
                int abs_r_3 = Math.abs(r - r_a3);

                int abs_g1_2 = Math.abs(g_a1 - g_a2);
                int abs_g2_3 = Math.abs(g_a2 - g_a3);
                int abs_g3_1 = Math.abs(g_a3 - g_a1);
                int abs_g_1 = Math.abs(g - g_a1);
                int abs_g_2 = Math.abs(g - g_a2);
                int abs_g_3 = Math.abs(g - g_a3);

                int abs_b1_2 = Math.abs(b_a1 - b_a2);
                int abs_b2_3 = Math.abs(b_a2 - b_a3);
                int abs_b3_1 = Math.abs(b_a3 - b_a1);
                int abs_b_1 = Math.abs(b - b_a1);
                int abs_b_2 = Math.abs(b - b_a2);
                int abs_b_3 = Math.abs(b - b_a3);

                int abs_ca_1 = abs_r_1 + abs_g_1 + abs_b_1;
                int abs_ca_2 = abs_r_2 + abs_g_2 + abs_b_2;
                int abs_ca_3 = abs_r_3 + abs_g_3 + abs_b_3;
                int abs_1_2 = abs_r1_2 + abs_g1_2 + abs_b1_2;
                int abs_1_3 = abs_r3_1 + abs_b3_1 + abs_b3_1;
                int abs_2_3 = abs_r2_3 + abs_b2_3 + abs_b2_3;

                boolean check_break = false;


                //ｒ,g,bのいずれかがほかの選択肢及び正解と20以上離れている。
                if ((minlimit <= abs_r_1) || (minlimit <= abs_b_1) || ((minlimit <= abs_b_1))) {
                    if ((minlimit <= abs_r_2) || (minlimit <= abs_b_2) || (minlimit <= abs_b_2)) {
                        if ((minlimit <= abs_r_3) || (minlimit <= abs_b_3) || (minlimit <= abs_b_3)) {
                            if ((minlimit <= abs_r1_2) || (minlimit <= abs_b1_2) || (minlimit <= abs_b1_2)) {
                                if ((minlimit <= abs_r2_3) || (minlimit <= abs_b2_3) || (minlimit <= abs_b2_3)) {
                                    if ((minlimit <= abs_r3_1) || (minlimit <= abs_b3_1) || (minlimit <= abs_b3_1)) {
                                        check_break = true;
                                    }
                                }
                            }
                        }
                    }
                }

                // 難易度調整
                if ((check_break == true) && (abs_ca_1 >= minlimit) && (abs_ca_1 <= maxlimit)) {
                    if ((abs_ca_2 >= minlimit) && (abs_ca_2 <= maxlimit)) {
                        if ((abs_ca_3 >= minlimit) && (abs_ca_3 <= maxlimit)) {
                            if ((abs_1_2 >= minlimit) && (abs_1_2 <= maxlimit)) {
                                if ((abs_1_3 >= minlimit) && (abs_1_3 <= maxlimit)) {
                                    if ((abs_2_3 >= minlimit) && (abs_2_3 <= maxlimit)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }


            //cleanCheckselect
            check_select1.setImageDrawable(null);
            check_select2.setImageDrawable(null);
            check_select3.setImageDrawable(null);
            check_select4.setImageDrawable(null);

            // setanswer
            Random rnd4 = new Random();
            check_answer = rnd4.nextInt(3) + 1;
            String r16 = Integer.toHexString(r);
            if (r16.length() < 2) r16 = "0" + r16;
            String g16 = Integer.toHexString(g);
            if (g16.length() < 2) g16 = "0" + g16;
            String b16 = Integer.toHexString(b);
            if (b16.length() < 2) b16 = "0" + b16;

            String r_a1_16 = Integer.toHexString(r_a1);
            if (r_a1_16.length() < 2) r_a1_16 = "0" + r_a1_16;
            String g_a1_16 = Integer.toHexString(g_a1);
            if (g_a1_16.length() < 2) g_a1_16 = "0" + g_a1_16;
            String b_a1_16 = Integer.toHexString(b_a1);
            if (b_a1_16.length() < 2) b_a1_16 = "0" + b_a1_16;

            String r_a2_16 = Integer.toHexString(r_a2);
            if (r_a2_16.length() < 2) r_a2_16 = "0" + r_a2_16;
            String g_a2_16 = Integer.toHexString(g_a2);
            if (g_a2_16.length() < 2) g_a2_16 = "0" + g_a2_16;
            String b_a2_16 = Integer.toHexString(b_a2);
            if (b_a2_16.length() < 2) b_a2_16 = "0" + b_a2_16;

            String r_a3_16 = Integer.toHexString(r_a3);
            if (r_a3_16.length() < 2) r_a3_16 = "0" + r_a3_16;
            String g_a3_16 = Integer.toHexString(g_a3);
            if (g_a3_16.length() < 2) g_a3_16 = "0" + g_a3_16;
            String b_a3_16 = Integer.toHexString(b_a3);
            if (b_a2_16.length() < 2) b_a2_16 = "0" + b_a2_16;

            switch (check_answer) {
                case 1:
                    answer1.setText("#" + r16 + g16 + b16);
                    answer2.setText("#" + r_a1_16 + g_a1_16 + b_a1_16);
                    answer3.setText("#" + r_a2_16 + g_a2_16 + b_a2_16);
                    answer4.setText("#" + r_a3_16 + g_a3_16 + b_a3_16);
                    break;

                case 2:
                    answer1.setText("#" + r_a1_16 + g_a1_16 + b_a1_16);
                    answer2.setText("#" + r16 + g16 + b16);
                    answer3.setText("#" + r_a2_16 + g_a2_16 + b_a2_16);
                    answer4.setText("#" + r_a3_16 + g_a3_16 + b_a3_16);
                    break;

                case 3:
                    answer1.setText("#" + r_a1_16 + g_a1_16 + b_a1_16);
                    answer2.setText("#" + r_a2_16 + g_a2_16 + b_a2_16);
                    answer3.setText("#" + r16 + g16 + b16);
                    answer4.setText("#" + r_a3_16 + g_a3_16 + b_a3_16);
                    break;

                case 4:
                    answer1.setText("#" + r_a1_16 + g_a1_16 + b_a1_16);
                    answer2.setText("#" + r_a2_16 + g_a2_16 + b_a2_16);
                    answer3.setText("#" + r_a3_16 + g_a3_16 + b_a3_16);
                    answer4.setText("#" + r16 + g16 + b16);
                    break;
            }
            question.setBackgroundColor(Color.rgb(r, g, b));
        }else if (colormode == 2){
            //Color.HSVToColor()
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_colorto_code, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

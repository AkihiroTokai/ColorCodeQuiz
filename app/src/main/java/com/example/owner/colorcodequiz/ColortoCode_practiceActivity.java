package com.example.owner.colorcodequiz;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
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

public class ColortoCode_practiceActivity extends AppCompatActivity {

    private TextView progress;
    private TextView red;
    private TextView green;
    private TextView blue;

    private TextView answer1;
    private TextView answer2;
    private TextView answer3;
    private TextView answer4;

    private ImageView question;
    private ImageView check_select1;
    private ImageView check_select2;
    private ImageView check_select3;
    private ImageView check_select4;

    private int gameCount;
    private int check_answer;
    private int noca;
    private int ull_CodetoColor;
    private int ull_ColortoCode;
    private int ull_old;
    private int nowPoint;
    private int getPoint;

    private int colormode;

    private int this_ull_CodetoColor;
    private int this_ull_ColortoCode;
    private int this_nowPoint;
    private int this_nocomp_CodetoColor0;
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

    private int this_nocomp_ColortoCode0;
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
    private String unlockmode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colorto_code_practice);
        check_answer = 1;
        gameCount = 1;
        answer1 = (TextView) findViewById(R.id.answer1);
        answer2 = (TextView) findViewById(R.id.answer2);
        answer3 = (TextView) findViewById(R.id.answer3);
        answer4 = (TextView) findViewById(R.id.answer4);

        progress = (TextView) findViewById(R.id.progress);
        red = (TextView) findViewById(R.id.red);
        green = (TextView) findViewById(R.id.green);
        blue = (TextView) findViewById(R.id.blue);

        check_select1 = (ImageView) findViewById(R.id.check_select1);
        check_select2 = (ImageView) findViewById(R.id.check_select2);
        check_select3 = (ImageView) findViewById(R.id.check_select3);
        check_select4 = (ImageView) findViewById(R.id.check_select4);
        question = (ImageView) findViewById(R.id.questioncode);

        Intent intent = getIntent();
        colormode = intent.getIntExtra("getcolormode",1);


        //getData(Parse)
       /* getData checkData = new getData();
        ull_CodetoColor = checkData.getull_CodetoColor();
        ull_ColortoCode = checkData.getull_CodetoColor();
        nowPoint = checkData.getnowPoint();

        nocomp_CodetoColor0 = checkData.getnocomp_CodetoColor0();
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

        nocomp_ColortoCode0 = checkData.getnocomp_ColortoCode0();
        nocomp_ColortoCode1 = checkData.getnocomp_ColortoCode1();
        nocomp_ColortoCode2 = checkData.getnocomp_ColortoCode2();
        nocomp_ColortoCode3 = checkData.getnocomp_ColortoCode3();
        nocomp_ColortoCode4 = checkData.getnocomp_ColortoCode4();
        nocomp_ColortoCode5 = checkData.getnocomp_ColortoCode5();
        nocomp_ColortoCode6 = checkData.getnocomp_ColortoCode6();
        nocomp_ColortoCode7 = checkData.getnocomp_ColortoCode7();
        nocomp_ColortoCode8 = checkData.getnocomp_ColortoCode8();
        nocomp_ColortoCode9 = checkData.getnocomp_ColortoCode9();
        nocomp_ColortoCode10 = checkData.getnocomp_ColortoCode10();        */

       /* Calendar cal = Calendar.getInstance();
        int nowyear = cal.get(Calendar.YEAR);
        int nowmoth = cal.get(Calendar.MONTH);
        int nowday  = cal.get(Calendar.DAY_OF_MONTH);
        int nowdate = nowyear + nowmoth + nowday;
        if ("getpoint"+nowdate == null){

        } else {
            getPoint = checkData.getgetPoint();
        }   */

        if (colormode == 1) {
            //getData（SharedPreference)
            SharedPreferences getData = getSharedPreferences("DataSave", Context.MODE_PRIVATE);
            this_ull_CodetoColor = getData.getInt("RGB_ull_CodetoColor", 0);
            this_ull_ColortoCode = getData.getInt("RGB_ull_ColortoCode", 0);
            this_nowPoint = getData.getInt("RGB_nowPoint", 0);

            this_nocomp_CodetoColor0 = getData.getInt("RGB_nocomp_CodetoColor", 0);
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

            this_nocomp_ColortoCode0 = getData.getInt("RGB_nocomp_ColortoCode0", 0);
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
        } else if (colormode == 2) {
            SharedPreferences getData = getSharedPreferences("DataSave", Context.MODE_PRIVATE);
            this_ull_CodetoColor = getData.getInt("HSB_ull_CodetoColor", 0);
            this_ull_ColortoCode = getData.getInt("HSB_ull_ColortoCode", 0);
            this_nowPoint = getData.getInt("HSB_nowPoint", 0);

            this_nocomp_CodetoColor0 = getData.getInt("HSB_nocomp_CodetoColor", 0);
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

            this_nocomp_ColortoCode0 = getData.getInt("HSB_nocomp_ColortoCode0", 0);
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
        if (!nextquestion)   {
            if (check_answer == 1 ) {
                check_select1.setImageResource(R.drawable.maru);
                noca = noca+1;
            } else {
                check_select1.setImageResource(R.drawable.batu);
            }
            if (gameCount <= 10) {
                gameCount = gameCount + 1;
                progress.setText("Progress:" + gameCount + "/" + 10 );
                nextquestion = true;
            }  if (gameCount >= 10 ){
                gameFinish();
            }
        }else {
            setanswer();
            nextquestion = false;
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
            if (gameCount <= 10) {
                gameCount = gameCount + 1;
                progress.setText("Progress:" + gameCount + "/" + 10 );
                nextquestion = true;
            }  if (gameCount >= 10 ){
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
            if (gameCount <= 10) {
                gameCount = gameCount + 1;
                progress.setText("Progress:" + gameCount + "/"+ 10);
                nextquestion = true;
            }if (gameCount >= 10){
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
            if (gameCount <= 10) {
                gameCount = gameCount + 1;
                progress.setText("Progress:" + gameCount + "/"+10);
                nextquestion = true;
            }if(gameCount >= 10){
                gameFinish();
            }
            nextquestion = true;
        }else {
            setanswer();
            nextquestion = false;
        }

    }
    public void gameFinish(){
        //Add:Score
            if (noca <= 7) {
                getPoint = 1;
                gameResult = "クリアできませんでした。";
            } else if (noca == 8  ) {
                getPoint = 10;
                gameResult = "クリアしました。";
            } else if (noca == 9 ||noca == 10) {
                getPoint = 11;
                gameResult = "クリアしました。";
            }


        nowPoint = nowPoint + getPoint ;

        //Check:Levelup(ColortoCode)
        if (ull_ColortoCode  == 0&& nowPoint >= 30& this_nocomp_ColortoCode0 >= 3 ){
            unlockmode = "ColortoCode";
            ull_CodetoColor  = 1;
            ull_old = ull_CodetoColor-1;
            ulm_ColortoCode();
        }
        if (ull_ColortoCode  == 1 && nowPoint >= 60 &&  this_nocomp_ColortoCode1 >= 3 ){
            unlockmode = "ColortoCode";
            ull_ColortoCode  = 2;
            ull_old = ull_ColortoCode-1;
            ulm_ColortoCode();
        }

        else if(ull_ColortoCode == 2 && nowPoint >= 90 && this_nocomp_ColortoCode2>= 3 ){
            unlockmode = "ColortoCode";
            ull_ColortoCode = 3;
            ull_old = ull_ColortoCode-1;
            ulm_ColortoCode();
        }

        else if(ull_ColortoCode == 3 && nowPoint >= 125 && this_nocomp_ColortoCode3 >= 3){
            unlockmode = "ColortoCode";
            ull_ColortoCode = 4;
            ull_old = ull_ColortoCode-1;
            ulm_ColortoCode();
        }

        else if(ull_ColortoCode == 4 && nowPoint >= 180 && this_nocomp_ColortoCode4 >= 4 && ull_CodetoColor>= 3){
            unlockmode = "ColortoCode";
            ull_ColortoCode = 5;
            ull_old = ull_ColortoCode-1;
            ulm_ColortoCode();
        }

        else if(ull_ColortoCode == 5 && nowPoint >= 240 && this_nocomp_ColortoCode5 >= 4) {
            unlockmode = "ColortoCode";
            ull_ColortoCode = 6;
            ull_old = ull_ColortoCode-1;
            ulm_ColortoCode();
        }

        else if(ull_ColortoCode == 6 && nowPoint >= 320 && this_nocomp_ColortoCode6 >= 5 && ull_CodetoColor>= 5){
            unlockmode = "ColortoCode";
            ull_ColortoCode = 7;
            ull_old = ull_ColortoCode-1;
            ulm_ColortoCode();
        }

        else if(ull_ColortoCode == 7 && nowPoint >= 425 && this_nocomp_ColortoCode7 >= 6){
            unlockmode = "ColortoCode";
            ull_ColortoCode = 8;
            ull_old = ull_ColortoCode-1;
            ulm_ColortoCode();
        }

        else if(ull_ColortoCode == 8 && nowPoint >= 560 && this_nocomp_ColortoCode8 >= 7 && ull_CodetoColor>= 7){
            unlockmode = "ColortoCode";
            ull_ColortoCode = 9;
            ull_old = ull_ColortoCode-1;
            ulm_ColortoCode();
        }

        else if(ull_ColortoCode == 9 && nowPoint >= 750 && this_nocomp_ColortoCode9 >= 8){
            unlockmode = "ColortoCode";
            ull_ColortoCode = 10;
            ull_old = ull_ColortoCode-1;
            ulm_ColortoCode();
        }

        else if(ull_ColortoCode == 10 && nowPoint >= 1000 && this_nocomp_ColortoCode10 >= 10){
            unlockmode = "ColortoCode";
            ull_ColortoCode = 11;
            ull_old = ull_ColortoCode-1;
            compm();
        }


        //Check:Levelup(CodetoColor)
         if (ull_CodetoColor  == 0&& nowPoint >= 30& this_nocomp_CodetoColor0 >= 3 ){
            unlockmode = "CodetoColor";
            ull_CodetoColor  = 1;
            ull_old = ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if (ull_CodetoColor  == 1 && nowPoint >= 60 && this_nocomp_CodetoColor1 >= 3 ){
            unlockmode = "CodetoColor";
            ull_CodetoColor  = 2;
            ull_old = ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if(ull_CodetoColor == 2 && nowPoint >= 90 && this_nocomp_CodetoColor2 >= 3 ){
            unlockmode = "CodetoColor";
            ull_CodetoColor = 3;
            ull_old = ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if(ull_CodetoColor == 3 && nowPoint >= 125 && this_nocomp_CodetoColor3 >= 3){
            unlockmode = "CodetoColor";
            ull_CodetoColor = 4;
            ull_old = ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if (ull_CodetoColor == 4 && nowPoint >= 180 && this_nocomp_CodetoColor4 >= 4 && ull_ColortoCode>= 3){
            unlockmode = "CodetoColor";
            ull_CodetoColor = 5;
            ull_old = ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if(ull_CodetoColor == 5 && nowPoint >= 240 && this_nocomp_CodetoColor5 >= 4) {
            unlockmode = "CodetoColor";
            ull_CodetoColor = 6;
            ull_old = ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if (ull_CodetoColor == 6 && nowPoint >= 320 && this_nocomp_CodetoColor6 >= 5 && ull_ColortoCode>= 5){
            unlockmode = "CodetoColor";
            ull_CodetoColor = 7;
            ull_old = ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if(ull_CodetoColor == 7 && nowPoint >= 425 && this_nocomp_CodetoColor7 >= 6){
            unlockmode = "CodetoColor";
            ull_CodetoColor = 8;
            ull_old = ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if (ull_CodetoColor == 8 && nowPoint >= 560 && this_nocomp_CodetoColor8 >= 7 && ull_ColortoCode>= 7){
            unlockmode = "CodetoColor";
            ull_CodetoColor = 9;
            ull_old = ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if(ull_CodetoColor == 9 && nowPoint >= 750 && this_nocomp_CodetoColor9 >= 8){
            unlockmode = "CodetoColor";
            ull_CodetoColor= 10;
            ull_old = ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if(ull_CodetoColor == 10 && nowPoint >= 1000 && this_nocomp_CodetoColor10 >= 10){
            unlockmode = "CodetoColor";
            ull_CodetoColor = 11;
            ull_old = ull_CodetoColor-1;
            compm();
        }

        this_nocomp_ColortoCode0++;

        //saveData(Parse)
        /*getData checkData = new getData();
        checkData.setull_CodetoColor(ull_CodetoColor);
        checkData.setull_ColortoCode(ull_ColortoCode);
        checkData.setnowPoint(nowPoint);
        checkData.setgetPoint(getPoint);
        checkData.setnocomp_CodetoColor0(nocomp_ColortoCode0);
        checkData.saveEventually(); */

        //saveData(SharedPreference)
        if (colormode == 1) {
            SharedPreferences getData = getSharedPreferences("DataSave", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = getData.edit();

            editor.putInt("RGB_ull_CodetoColor", this_ull_CodetoColor);
            editor.putInt("RGB_ull_ColoretoCode", this_ull_ColortoCode);
            editor.putInt("RGB_nowPoint", this_nowPoint);
            editor.putInt("RGB_nocomp_ColortoCode0", this_nocomp_ColortoCode0);
            editor.apply();
        } else if (colormode == 2){
            SharedPreferences getData = getSharedPreferences("DataSave", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = getData.edit();

            editor.putInt("HSB_ull_CodetoColor",this_ull_CodetoColor);
            editor.putInt("HSB_ull_ColoretoCode",this_ull_ColortoCode);
            editor.putInt("HSB_nowPoint", this_nowPoint);
            editor.putInt("HSB_nocomp_ColortoCode0", this_nocomp_ColortoCode0);
            editor.apply();
        }

        //gameFinish
        new AlertDialog.Builder(ColortoCode_practiceActivity.this)
                .setTitle( getPoint + "Point獲得しました。")
                .setMessage(10 + "問中" + noca + "問正解したので、" + gameResult)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // OK button pressed
                        Intent intent = new Intent(ColortoCode_practiceActivity.this, MenuActivity.class);
                        intent.putExtra("nowScore",nowPoint);
                        intent.putExtra("getScore",getPoint);
                        intent.putExtra("ull_ColortoCode ",ull_ColortoCode );
                        startActivity(intent);
                    }
                }).show();
    }


    public  void ulm_CodetoColor(){
        new AlertDialog.Builder(ColortoCode_practiceActivity.this)
                .setTitle(unlockmode+"Level" + ull_old + "をMasterしました！")
                .setMessage(unlockmode + "Level" + ull_CodetoColor + "がUnLockされました。おめでとうございます。Twetterに投稿しますか？")
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
        new AlertDialog.Builder(ColortoCode_practiceActivity.this)
                .setTitle(unlockmode+"Level" + ull_old + "をMasterしました！")
                .setMessage(unlockmode + "Level" + ull_ColortoCode + "がUnLockされました。おめでとうございます。Twetterに投稿しますか？")
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
        new AlertDialog.Builder(ColortoCode_practiceActivity.this)
                .setTitle(unlockmode+"をMasterしました！")
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
        String strMessage = unlockmode + ull_old + "をMasterしました！";
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
        //cleanCheck_select
        check_select1.setImageDrawable(null);
        check_select2.setImageDrawable(null);
        check_select3.setImageDrawable(null);
        check_select4.setImageDrawable(null);
        if (colormode == 1) {
            if (gameCount == 1) {
                //setQuestionImage
                Bitmap bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);

                Canvas canvas;
                canvas = new Canvas(bitmap);
                canvas.drawColor(Color.parseColor("#000000"));

                question.setImageBitmap(bitmap);
                //setChoices
                answer1.setText("#000000");
                answer2.setText("#ffff00");
                answer3.setText("#ff00ff");
                answer4.setText("#ffffff");
                check_answer = 1;
            } else if (gameCount == 2) {
                //setQuestionImage
                Bitmap bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);

                Canvas canvas;
                canvas = new Canvas(bitmap);
                canvas.drawColor(Color.parseColor("#ffffff"));

                question.setImageBitmap(bitmap);
                //setChoices
                answer1.setText("#000000");
                answer2.setText("#ffffff");
                answer3.setText("#ffff00");
                answer4.setText("#ff00ff");
                check_answer = 2;
            } else if (gameCount == 3) {
                //setQuestionImage
                Bitmap bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);

                Canvas canvas;
                canvas = new Canvas(bitmap);
                canvas.drawColor(Color.parseColor("#00ffff"));

                question.setImageBitmap(bitmap);
                //setChoices
                answer1.setText("#0088ff");
                answer2.setText("#00ffff");
                answer3.setText("#ffff00");
                answer4.setText("#ff00ff");
                check_answer = 2;
            } else if (gameCount == 4) {
                //setQuestionImage
                Bitmap bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);

                Canvas canvas;
                canvas = new Canvas(bitmap);
                canvas.drawColor(Color.parseColor("#ff00ff"));

                question.setImageBitmap(bitmap);
                //setChoices
                answer1.setText("#ff88ff");
                answer2.setText("#00ffff");
                answer3.setText("#ffff00");
                answer4.setText("#ff00ff");
                check_answer = 4;
            } else if (gameCount == 5) {
                //setQuestionImage
                Bitmap bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);

                Canvas canvas;
                canvas = new Canvas(bitmap);
                canvas.drawColor(Color.parseColor("#ffff00"));

                question.setImageBitmap(bitmap);
                //setChoices
                answer1.setText("#ffff00");
                answer2.setText("#00ffff");
                answer3.setText("#ffff88");
                answer4.setText("#ff00ff");
                check_answer = 1;
            } else if (gameCount == 6) {
                //setQuestionImage
                Bitmap bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);

                Canvas canvas;
                canvas = new Canvas(bitmap);
                canvas.drawColor(Color.parseColor("#00ffff"));

                question.setImageBitmap(bitmap);
                //setChoices
                answer1.setText("#00ff00");
                answer2.setText("#880000");
                answer3.setText("#00ffff");
                answer4.setText("#ff00ff");
                check_answer = 3;
            } else if (gameCount == 7) {
                //setQuestionImage
                Bitmap bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);

                Canvas canvas;
                canvas = new Canvas(bitmap);
                canvas.drawColor(Color.parseColor("#ff0088"));

                question.setImageBitmap(bitmap);
                //setChoices
                answer1.setText("#ff0000");
                answer2.setText("#ff0088");
                answer3.setText("#ffff00");
                answer4.setText("#00ffff");
                check_answer = 2;
            } else if (gameCount == 8) {
                //setQuestionImage
                Bitmap bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);

                Canvas canvas;
                canvas = new Canvas(bitmap);
                canvas.drawColor(Color.parseColor("#00ff00"));

                question.setImageBitmap(bitmap);
                //setChoices
                answer1.setText("#ff0000");
                answer2.setText("#00ffff");
                answer3.setText("#ffff88");
                answer4.setText("#00ff00");
                check_answer = 4;
            } else if (gameCount == 9) {
                //setQuestionImage
                Bitmap bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);

                Canvas canvas;
                canvas = new Canvas(bitmap);
                canvas.drawColor(Color.parseColor("#880088"));

                question.setImageBitmap(bitmap);
                //setChoices
                answer1.setText("#008800");
                answer2.setText("#008888");
                answer3.setText("#000088");
                answer4.setText("#880088");

                check_answer = 4;
            } else if (gameCount == 10) {
                //setQuestionImage
                Bitmap bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);

                Canvas canvas;
                canvas = new Canvas(bitmap);
                canvas.drawColor(Color.parseColor("#008888"));

                question.setImageBitmap(bitmap);
                //setChoices
                answer1.setText("#008800");
                answer2.setText("#008888");
                answer3.setText("#000088");
                answer4.setText("#880000");

                check_answer = 2;
            }
        } else if (colormode == 2) {
            //Color.HSVToColor()
            int h,s,b,color;
            if (gameCount == 1) {
                //SetQuestionImage
                h = 360;
                s = 100;
                b = 100;

                color = Color.HSVToColor(new float[] { h, s, b });
                Bitmap bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);
                Canvas canvas;
                canvas = new Canvas(bitmap);
                canvas.drawColor(color);

                answer1.setText("360,100,100");
                answer2.setText("0,0,0");
            }
        }
}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.colorto_code_practice, menu);
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

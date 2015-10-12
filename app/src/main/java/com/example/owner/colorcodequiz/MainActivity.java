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


public class MainActivity extends AppCompatActivity {

    private TextView progress;
    private TextView red;
    private TextView green;
    private TextView blue;
    private ImageView check_select1;
    private ImageView check_select2;
    private ImageView check_select3;
    private ImageView check_select4;
    private TextView answer1;
    private TextView answer2;
    private TextView answer3;
    private TextView answer4;

    private int gameCount;
    private int check_answer;
    private int noca;
    private int ull_old;
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
        setContentView(R.layout.activity_main);

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

        Intent intent = getIntent();
        colormode = intent.getIntExtra("getcolormode",1);
        //getData(Parse)
      /*  getData checkData = new getData();

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
        nocomp_ColortoCode10 = checkData.getnocomp_ColortoCode10();
        nowPoint = checkData.getnowPoint();                      */

    /*    Calendar cal = Calendar.getInstance();
        int nowyear = cal.get(Calendar.YEAR);
        String stnowyear = String.valueOf(nowyear);
        int nowmoth = cal.get(Calendar.MONTH);
        String stnowmonth = String.valueOf(nowmoth);
        int nowday = cal.get(Calendar.DAY_OF_MONTH);
        String stnowday = String.valueOf(nowday);
        String nowdate = (stnowyear + stnowmonth + stnowday);
        if ("getpoint" + nowdate == null) {

        } else {
            getPoint = checkData.getgetPoint();
        }       */
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
        gameCount = 1;
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
        } else if (noca == 8 ) {
            getPoint = 10;
            gameResult = "クリアしました。";
        } else if (noca == 9|| noca == 10) {
            getPoint = 11;
            gameResult = "クリアしました。";
        }

        this_nowPoint = this_nowPoint + getPoint ;

        //Check:Levelup(ColortoCode)
        if (this_ull_ColortoCode  == 0&& this_nowPoint >= 30& this_nocomp_ColortoCode0 >= 3 ){
            unlockmode = "ColortoCode";
            this_ull_CodetoColor  = 1;
            ull_old = this_ull_CodetoColor-1;
            ulm_ColortoCode();
        }
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
        if (this_ull_CodetoColor  == 0&& this_nowPoint >= 30& this_nocomp_CodetoColor0 >= 3 ){
            unlockmode = "CodetoColor";
            this_ull_CodetoColor  = 1;
            ull_old = this_ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if (this_ull_CodetoColor  == 1 && this_nowPoint >= 60 && this_nocomp_CodetoColor1 >= 3 ){
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

        else if (this_ull_CodetoColor == 4 && this_nowPoint >= 180 && this_nocomp_CodetoColor4 >= 4 && this_ull_ColortoCode>= 3){
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

        else if (this_ull_CodetoColor == 6 && this_nowPoint >= 320 && this_nocomp_CodetoColor6 >= 5 && this_ull_ColortoCode>= 5){
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

        else if (this_ull_CodetoColor == 8 && this_nowPoint >= 560 && this_nocomp_CodetoColor8 >= 7 && this_ull_ColortoCode>= 7){
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

        //saveData(Parse)
     /*   getData checkData = new getData();
        checkData.setull_CodetoColor(ull_CodetoColor);
        checkData.setull_ColortoCode(ull_ColortoCode);
        checkData.setnowPoint(nowPoint);
        checkData.setgetPoint(getPoint);
        nocomp_CodetoColor0++;
        checkData.setnocomp_CodetoColor0(nocomp_CodetoColor0);  */

        if (colormode == 1) {
            //saveData(SharedPreference)
            SharedPreferences getData = getSharedPreferences("DataSave", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = getData.edit();
            editor.putInt("RGB_ull_CodetoColor", this_ull_CodetoColor);
            editor.putInt("RGB_ull_ColoretoCode", this_ull_ColortoCode);
            editor.putInt("RGB_nowPoint", this_nowPoint);
            editor.putInt("RGB_nocomp_CodetoColor0", this_nocomp_CodetoColor0);
            editor.apply();
        }else if (colormode == 2){
            SharedPreferences getData = getSharedPreferences("DataSave", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = getData.edit();
            editor.putInt("HSB_ull_CodetoColor", this_ull_CodetoColor);
            editor.putInt("HSB_ull_ColoretoCode", this_ull_ColortoCode);
            editor.putInt("HSB_nowPoint", this_nowPoint);
            editor.putInt("HSB_nocomp_CodetoColor0", this_nocomp_CodetoColor0);
            editor.apply();
        }
        //gameFinish
        new AlertDialog.Builder(MainActivity.this)
                .setTitle(getPoint + "Point獲得しました。")
                .setMessage(10 + "問中" + noca + "問正解したので、" + gameResult)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // OK button pressed
                        Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                        startActivity(intent);
                    }
                }).show();
    }

    public  void ulm_CodetoColor(){
        new AlertDialog.Builder(MainActivity.this)
                .setTitle(unlockmode+"Level" + ull_old + "をMasterしました！")
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
        new AlertDialog.Builder(MainActivity.this)
                .setTitle(unlockmode+"Level" + ull_old + "をMasterしました！")
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
        new AlertDialog.Builder(MainActivity.this)
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

    private void setanswer() {
        //cleanCheckselect
        check_select1.setImageDrawable(null);
        check_select2.setImageDrawable(null);
        check_select3.setImageDrawable(null);
        check_select4.setImageDrawable(null);
        if (colormode == 1 ) {
            if (gameCount == 1) {
                red.setText("00");
                green.setText("00");
                blue.setText("00");
                answer1.setBackgroundColor(Color.parseColor("#000000"));
                answer2.setBackgroundColor(Color.parseColor("#ffffff"));
                answer3.setBackgroundColor(Color.parseColor("#ff0000"));
                answer4.setBackgroundColor(Color.parseColor("#0000ff"));
                check_answer = 1;
            } else if (gameCount == 2) {
                red.setText("ff");
                green.setText("ff");
                blue.setText("ff");
                answer1.setBackgroundColor(Color.parseColor("#00ffff"));
                answer2.setBackgroundColor(Color.parseColor("#ffffff"));
                answer3.setBackgroundColor(Color.parseColor("#ffff00"));
                answer4.setBackgroundColor(Color.parseColor("#ff00ff"));
                check_answer = 2;
            } else if (gameCount == 3) {
                red.setText("00");
                green.setText("ff");
                blue.setText("ff");
                answer1.setBackgroundColor(Color.parseColor("#00ffff"));
                answer2.setBackgroundColor(Color.parseColor("#ffff00"));
                answer3.setBackgroundColor(Color.parseColor("#0088ff"));
                answer4.setBackgroundColor(Color.parseColor("#ff00ff"));
                check_answer = 1;
            } else if (gameCount == 4) {
                red.setText("ff");
                green.setText("00");
                blue.setText("ff");
                answer1.setBackgroundColor(Color.parseColor("#00ffff"));
                answer2.setBackgroundColor(Color.parseColor("#ff00ff"));
                answer3.setBackgroundColor(Color.parseColor("#ffff00"));
                answer4.setBackgroundColor(Color.parseColor("#ff88ff"));
                check_answer = 2;
            } else if (gameCount == 5) {
                red.setText("ff");
                green.setText("ff");
                blue.setText("00");
                answer1.setBackgroundColor(Color.parseColor("#00ffff"));
                answer2.setBackgroundColor(Color.parseColor("#ffff00"));
                answer3.setBackgroundColor(Color.parseColor("#88ff00"));
                answer4.setBackgroundColor(Color.parseColor("#ff00ff"));
                check_answer = 2;
            } else if (gameCount == 6) {
                red.setText("ff");
                green.setText("00");
                blue.setText("00");
                answer1.setBackgroundColor(Color.parseColor("#ff0000"));
                answer2.setBackgroundColor(Color.parseColor("#ffffff"));
                answer3.setBackgroundColor(Color.parseColor("#ffff00"));
                answer4.setBackgroundColor(Color.parseColor("#ff00ff"));
                check_answer = 1;
            } else if (gameCount == 7) {
                red.setText("00");
                green.setText("ff");
                blue.setText("00");
                answer1.setBackgroundColor(Color.parseColor("#00ffff"));
                answer2.setBackgroundColor(Color.parseColor("#00ff00"));
                answer3.setBackgroundColor(Color.parseColor("#ffff00"));
                answer4.setBackgroundColor(Color.parseColor("#ff0088"));
                check_answer = 2;
            } else if (gameCount == 8) {
                red.setText("00");
                green.setText("00");
                blue.setText("ff");
                answer1.setBackgroundColor(Color.parseColor("#008888"));
                answer2.setBackgroundColor(Color.parseColor("#0000ff"));
                answer3.setBackgroundColor(Color.parseColor("#88ff00"));
                answer4.setBackgroundColor(Color.parseColor("#ff00ff"));
                check_answer = 2;
            } else if (gameCount == 9) {
                red.setText("88");
                green.setText("00");
                blue.setText("88");
                answer1.setBackgroundColor(Color.parseColor("#880088"));
                answer2.setBackgroundColor(Color.parseColor("#888888"));
                answer3.setBackgroundColor(Color.parseColor("#888800"));
                answer4.setBackgroundColor(Color.parseColor("#ff8888"));
                check_answer = 1;
            } else if (gameCount == 10) {
                red.setText("00");
                green.setText("88");
                blue.setText("88");
                answer1.setBackgroundColor(Color.parseColor("#8800ff"));
                answer2.setBackgroundColor(Color.parseColor("#ff88ff"));
                answer3.setBackgroundColor(Color.parseColor("#88ff00"));
                answer4.setBackgroundColor(Color.parseColor("#008888"));
                check_answer = 4;
            }
        }else if (colormode == 2){
           if (gameCount == 1){
               red.setTextColor(Color.parseColor("#000000"));or.HSVToColor()
           }
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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


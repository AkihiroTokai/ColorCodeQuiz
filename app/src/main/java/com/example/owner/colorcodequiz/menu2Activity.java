package com.example.owner.colorcodequiz;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class menu2Activity extends AppCompatActivity {

    private int this_ull_CodetoColor;
    private int this_ull_ColortoCode;

    private int this_nocomp_CodetoColor1;
    private int this_nocomp_CodetoColor2;
    private int this_nocomp_CodetoColor3;
    private int this_nocomp_CodetoColor4;
    private int this_nocomp_CodetoColor5;

    private int this_nocomp_ColortoCode1;
    private int this_nocomp_ColortoCode2;
    private int this_nocomp_ColortoCode3;
    private int this_nocomp_ColortoCode4;
    private int this_nocomp_ColortoCode5;

    private int this_nowPoint;
    private int maxlimit;
    private int minlimit;
    private int number;
    private int level;
    private int req_nocomp;
    private int req_Point;
    private int req_level;
    private int colormode;

    private String plus;

    private TextView nowPointview;
    private EditText setnum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
        setnum = (EditText)findViewById(R.id.setnum);
        nowPointview = (TextView)findViewById(R.id.nowPointview);
        setnum.setKeyListener(null);

        Intent intent = getIntent();
        colormode = intent.getIntExtra("getcolormode", 1);

        //Checkcolomode
        if (colormode == 1){
            //getData（SharedPreference)
            SharedPreferences getData = getSharedPreferences("DataSave", Context.MODE_PRIVATE);
            this_ull_CodetoColor = getData.getInt("RGB_ull_CodetoColor",0 );
            this_ull_ColortoCode = getData.getInt("RGB_ull_ColortoCode",0);
            this_nowPoint = getData.getInt("RGB_nowPoint",0);

            this_nocomp_CodetoColor1 = getData.getInt("RGB_nocomp_CodetoColor1",0);
            this_nocomp_CodetoColor2 = getData.getInt("RGB_nocomp_CodetoColor2",0);
            this_nocomp_CodetoColor3 = getData.getInt("RGB_nocomp_CodetoColor3",0);
            this_nocomp_CodetoColor4 = getData.getInt("RGB_nocomp_CodetoColor4",0);
            this_nocomp_CodetoColor5 = getData.getInt("RGB_nocomp_CodetoColor5",0);

            this_nocomp_ColortoCode1 = getData.getInt("RGB_nocomp_ColortoCode1",0);
            this_nocomp_ColortoCode2 = getData.getInt("RGB_nocomp_ColortoCode2",0);
            this_nocomp_ColortoCode3 = getData.getInt("RGB_nocomp_ColortoCode3",0);
            this_nocomp_ColortoCode4 = getData.getInt("RGB_nocomp_ColortoCode4",0);
            this_nocomp_ColortoCode5 = getData.getInt("RGB_nocomp_ColortoCode5",0);


            nowPointview.setText("RGBPoint:"+this_nowPoint);

        } else if(colormode == 2){
            //getData（SharedPreference)
            SharedPreferences getData = getSharedPreferences("DataSave", Context.MODE_PRIVATE);
            this_ull_CodetoColor = getData.getInt("HSB_ull_CodetoColor",0 );
            this_ull_ColortoCode = getData.getInt("HSB_ull_ColortoCode",0);
            this_nowPoint = getData.getInt("HSB_nowPoint",0);

            this_nocomp_CodetoColor1 = getData.getInt("HSB_nocomp_CodetoColor1",0);
            this_nocomp_CodetoColor2 = getData.getInt("HSB_nocomp_CodetoColor2",0);
            this_nocomp_CodetoColor3 = getData.getInt("HSB_nocomp_CodetoColor3",0);
            this_nocomp_CodetoColor4 = getData.getInt("HSB_nocomp_CodetoColor4",0);
            this_nocomp_CodetoColor5 = getData.getInt("HSB_nocomp_CodetoColor5",0);

            this_nocomp_ColortoCode1 = getData.getInt("HSB_nocomp_ColortoCode1",0);
            this_nocomp_ColortoCode2 = getData.getInt("HSB_nocomp_ColortoCode2",0);
            this_nocomp_ColortoCode3 = getData.getInt("HSB_nocomp_ColortoCode3",0);
            this_nocomp_ColortoCode4 = getData.getInt("HSB_nocomp_ColortoCode4",0);
            this_nocomp_ColortoCode5 = getData.getInt("HSB_nocomp_ColortoCode5",0);

            nowPointview.setText("HSBPoint:"+this_nowPoint);

            //-----------------↓TestData↓-----------------.
            this_ull_ColortoCode = 5;
            this_ull_CodetoColor = 4;
            //------------------↑TestData↑--------------ー
        }



        //IconChange
        if(this_ull_CodetoColor >= 1){
            com.beardedhen.androidbootstrap.BootstrapButton CodetoColor1 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.CodetoColor1);
            CodetoColor1.setLeftIcon("fa-unlock");
        }
        if(this_ull_CodetoColor >= 2){
            com.beardedhen.androidbootstrap.BootstrapButton CodetoColor2 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.CodetoColor2);
            CodetoColor2.setLeftIcon("fa-unlock");
        }
        if(this_ull_CodetoColor >= 3){
            com.beardedhen.androidbootstrap.BootstrapButton CodetoColor3 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.CodetoColor3);
            CodetoColor3.setLeftIcon("fa-unlock");
        }
        if(this_ull_CodetoColor >= 4){
            com.beardedhen.androidbootstrap.BootstrapButton CodetoColor4 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.CodetoColor4);
            CodetoColor4.setLeftIcon("fa-unlock");
        }
        if(this_ull_CodetoColor >= 5){
            com.beardedhen.androidbootstrap.BootstrapButton CodetoColor5 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.CodetoColor5);
            CodetoColor5.setLeftIcon("fa-unlock");
        }
        if(this_ull_ColortoCode >= 1){
            com.beardedhen.androidbootstrap.BootstrapButton ColortoCode1 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.ColortoCode1);
            ColortoCode1.setLeftIcon("fa-unlock");
        }
        if(this_ull_ColortoCode >= 2){
            com.beardedhen.androidbootstrap.BootstrapButton ColortoCode2 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.ColortoCode2);
            ColortoCode2.setLeftIcon("fa-unlock");
        }
        if(this_ull_ColortoCode >= 3){
            com.beardedhen.androidbootstrap.BootstrapButton ColortoCode3 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.ColortoCode3);
            ColortoCode3.setLeftIcon("fa-unlock");
        }
        if(this_ull_ColortoCode >= 4){
            com.beardedhen.androidbootstrap.BootstrapButton ColortoCode4 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.ColortoCode4);
            ColortoCode4.setLeftIcon("fa-unlock");
        }
        if(this_ull_ColortoCode >= 5){
            com.beardedhen.androidbootstrap.BootstrapButton ColortoCode5 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.ColortoCode5);
            ColortoCode5.setLeftIcon("fa-unlock");
        }
    }

    public void ColortoCode1(View v){
            maxlimit = 255;
            minlimit = 225;
            plus= "";
            intent_ColortoCode();
    }

    public void ColortoCode2(View v){
        level = 2;
        if(this_ull_ColortoCode >=2){
            maxlimit = 225;
            minlimit = 195;
            intent_ColortoCode();
        }else{
            req_level = level -1;
            req_nocomp = 3;
            req_Point = 60;
            plus= "";
            lockedmessage();
        }
    }

    public void ColortoCode3(View v){
        level = 3;
        if(this_ull_ColortoCode >=3){
            maxlimit = 195;
            minlimit = 165;
            intent_ColortoCode();
        }else{
            req_level = level -1;
            req_nocomp = 3;
            req_Point = 90;
            plus= "";
            lockedmessage();
        }
    }

    public void ColortoCode4(View v){
        level = 4;
        if(this_ull_ColortoCode >=4){
            maxlimit = 165;
            minlimit = 135;
            intent_ColortoCode();
        }else{
            req_level = level -1;
            req_nocomp = 3;
            req_Point = 90;
            plus= "";
            plus = "CodetoColorのLevel3をUnlockしてください。";
            lockedmessage();
        }
    }

    public void ColortoCode5(View v){
        level = 5;
        if(this_ull_ColortoCode >=5){
            maxlimit = 135;
            minlimit = 105;
            plus= "";
            intent_ColortoCode();
        }else{
            req_level = level -1;
            req_nocomp = 4;
            req_Point = 125;
            plus= "";
            lockedmessage();
        }
    }

    public void CodetoColor1(View v){
            maxlimit = 255;
            minlimit = 225;
            level = 1;
            plus= "";
            intent_CodetoColor();
    }

    public void CodetoColor2(View v){
        level = 2;
        if(this_ull_CodetoColor >=2){
            maxlimit = 225;
            minlimit = 195;
            intent_CodetoColor();
        }else{
            req_level = level -1;
            req_nocomp = 3;
            req_Point = 60;
            plus= "";
            lockedmessage();
        }
    }

    public void CodetoColor3(View v){
        level = 3;
        if(this_ull_CodetoColor >=3){
            maxlimit = 195;
            minlimit = 165;
            intent_CodetoColor();
        }else{
            req_level = level -1;
            req_nocomp = 3;
            req_Point = 90;
            plus= "";
            lockedmessage();
        }
    }

    public void CodetoColor4(View v){
        level = 4;
        if(this_ull_CodetoColor >=4){
            maxlimit = 165;
            minlimit = 135;
            intent_CodetoColor();
        }else{
            req_level = level -1;
            req_nocomp = 3;
            req_Point = 125;
            plus = "ColortoCodeのLevel3をUnlockしてください。";
            lockedmessage();
        }
    }

    public void CodetoColor5(View v){
        level = 5;
        if(this_ull_CodetoColor >=5){
            maxlimit = 135;
            minlimit = 105;
            intent_CodetoColor();
        }else{
            req_level = level -1;
            req_nocomp = 180;
            req_Point = 4;
            plus= "";
            lockedmessage();
        }
    }

    public void lockedmessage(){
        new AlertDialog.Builder(menu2Activity.this)
                .setTitle("Lockされています。")
                .setMessage("Level"+ req_level+"を"+req_nocomp+"回以上クリアし、"+req_Point+"以上獲得してください。" + plus)
                .setPositiveButton("OK", null)
                .show();
    }

    public void intent_ColortoCode() {
            setnum.selectAll();
            String num = setnum.getText().toString();
            if( num.equals("") ){
                number = 0;
            }else {
                number = Integer.parseInt(num);
            } if (number > 0){
                new AlertDialog.Builder(menu2Activity.this)
                        .setTitle("ColortoCodeをStartしますか？")
                        .setMessage("問題は"+number+"問です。")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // OK button pressed
                                Intent intent = new Intent(menu2Activity.this, ColortoCodeActivity.class);
                                intent.putExtra("getnumber", number);
                                intent.putExtra("getmaxlimit",maxlimit);
                                intent.putExtra("getminlimit",minlimit);
                                intent.putExtra("getlevel",level);
                                intent.putExtra("getcolormode",colormode);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("Cancel",null)
                        .show();
            }else {
                new AlertDialog.Builder(menu2Activity.this)
                        .setTitle("ColortoCodeをStartできません。")
                        .setMessage("入力した内容を確認してください。")
                        .setPositiveButton("OK",null)
                        .show();
            }
    }

    public void intent_CodetoColor() {
        setnum.selectAll();
        String num = setnum.getText().toString();
        if( num.equals("") ){
            number = 0;
        }else {
            number = Integer.parseInt(num);
        } if (number > 0){
            new AlertDialog.Builder(menu2Activity.this)
                    .setTitle("CodetoColorをStartしますか？")
                    .setMessage("問題は"+number+"問です。")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // OK button pressed
                            Intent intent = new Intent(menu2Activity.this, CodetoColorActivity.class);
                            intent.putExtra("getnumber", number);
                            intent.putExtra("getmaxlimit",maxlimit);
                            intent.putExtra("getminlimit",minlimit);
                            intent.putExtra("getlevel",level);
                            intent.putExtra("getcolormode",colormode);
                            startActivity(intent);
                        }
                    })
                    .setNegativeButton("Cancel",null)
                    .show();
        }else {
            new AlertDialog.Builder(menu2Activity.this)
                    .setTitle("CodetoColorをStartできません。")
                    .setMessage("入力した内容を確認してください。")
                    .setPositiveButton("OK",null)
                    .show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu2, menu);
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

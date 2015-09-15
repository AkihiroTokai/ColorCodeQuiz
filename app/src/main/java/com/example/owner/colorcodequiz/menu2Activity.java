package com.example.owner.colorcodequiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.EditText;
import android.widget.TextView;

public class menu2Activity extends AppCompatActivity {
    private int ull_CodetoColor;
    private int ull_ColortoCode;
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

    private int maxlimit;
    private int minlimit;
    private int number;
    private int level;
    private EditText setnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
        setnum = (EditText)findViewById(R.id.setnum);
        setnum.setKeyListener(null);
        number = 10;
        //testdata （SharedPreference→Parse）
        ull_CodetoColor = 5;
        ull_ColortoCode = 1;
        nocomp_ColortoCode1 = 1;
        nocomp_ColortoCode2 = 0;
        nocomp_ColortoCode3 = 0;
        nocomp_ColortoCode4 = 0;
        nocomp_ColortoCode5 = 0;
        nocomp_ColortoCode6 = 4;
        nocomp_ColortoCode7 = 0;
        nocomp_ColortoCode8 = 0;
        nocomp_ColortoCode9 = 0;
        nocomp_ColortoCode10 = 0;

        nocomp_CodetoColor1 = 3;
        nocomp_CodetoColor2 = 4;
        nocomp_CodetoColor3 = 5;
        nocomp_CodetoColor4 = 3;
        nocomp_CodetoColor5 = 4;
        nocomp_CodetoColor6 = 5;
        nocomp_CodetoColor7 = 4;
        nocomp_CodetoColor8 = 5;
        nocomp_CodetoColor9 = 3;
        nocomp_CodetoColor10 = 4;

        //IconChange
        if(ull_CodetoColor >= 1){
            com.beardedhen.androidbootstrap.BootstrapButton CodetoColor1 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.CodetoColor1);
            CodetoColor1.setLeftIcon("fa-unlock");
        }
        if(ull_CodetoColor >= 2){
            com.beardedhen.androidbootstrap.BootstrapButton CodetoColor2 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.CodetoColor2);
            CodetoColor2.setLeftIcon("fa-unlock");
        }
        if(ull_CodetoColor >= 3){
            com.beardedhen.androidbootstrap.BootstrapButton CodetoColor3 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.CodetoColor3);
            CodetoColor3.setLeftIcon("fa-unlock");
        }
        if(ull_CodetoColor >= 4){
            com.beardedhen.androidbootstrap.BootstrapButton CodetoColor4 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.CodetoColor4);
            CodetoColor4.setLeftIcon("fa-unlock");
        }
        if(ull_CodetoColor >= 5){
            com.beardedhen.androidbootstrap.BootstrapButton CodetoColor5 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.CodetoColor5);
            CodetoColor5.setLeftIcon("fa-unlock");
        }
        if(ull_ColortoCode >= 1){
            com.beardedhen.androidbootstrap.BootstrapButton ColortoCode1 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.ColortoCode1);
            ColortoCode1.setLeftIcon("fa-unlock");
        }
        if(ull_ColortoCode >= 2){
            com.beardedhen.androidbootstrap.BootstrapButton ColortoCode2 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.ColortoCode2);
            ColortoCode2.setLeftIcon("fa-unlock");
        }
        if(ull_ColortoCode >= 3){
            com.beardedhen.androidbootstrap.BootstrapButton ColortoCode3 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.ColortoCode3);
            ColortoCode3.setLeftIcon("fa-unlock");
        }
        if(ull_ColortoCode >= 4){
            com.beardedhen.androidbootstrap.BootstrapButton ColortoCode4 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.ColortoCode4);
            ColortoCode4.setLeftIcon("fa-unlock");
        }
        if(ull_ColortoCode >= 5){
            com.beardedhen.androidbootstrap.BootstrapButton ColortoCode5 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.ColortoCode5);
            ColortoCode5.setLeftIcon("fa-unlock");
        }
    }

    public void ColortoCode1(View v){
        if(ull_ColortoCode >=1){
            maxlimit = 255;
            minlimit = 225;
            level = 1;
            intent_ColortoCode();
        }else{
            lockedmessage();
        }
    }

    public void ColortoCode2(View v){
        if(ull_ColortoCode >=2){
            maxlimit = 255;
            minlimit = 225;
            level = 2;
            intent_ColortoCode();
        }else{
            lockedmessage();
        }
    }

    public void ColortoCode3(View v){
        if(ull_ColortoCode >=3){
            maxlimit = 255;
            minlimit = 225;
            level = 3;
            intent_ColortoCode();
        }else{
            lockedmessage();
        }
    }

    public void ColortoCode4(View v){
        if(ull_ColortoCode >=4){
            maxlimit = 255;
            minlimit = 225;
            level = 4;
            intent_ColortoCode();
        }else{
            lockedmessage();
        }
    }

    public void ColortoCode5(View v){
        if(ull_ColortoCode >=5){
            maxlimit = 255;
            minlimit = 225;
            level = 5;
            intent_ColortoCode();
        }else{
            lockedmessage();
        }
    }

    public void CodetoColor1(View v){
        if(ull_CodetoColor >=1){
            maxlimit = 255;
            minlimit = 225;
            level = 1;
            intent_CodetoColor();
        }else{
            lockedmessage();
        }
    }

    public void CodetoColor2(View v){
        if(ull_CodetoColor >=2){
            maxlimit = 255;
            minlimit = 225;
            level = 2;
            intent_CodetoColor();
        }else{
            lockedmessage();
        }
    }

    public void CodetoColor3(View v){
        if(ull_CodetoColor >=3){
            maxlimit = 255;
            minlimit = 225;
            level = 3;
            intent_CodetoColor();
        }else{
            lockedmessage();
        }
    }

    public void CodetoColor4(View v){
        if(ull_CodetoColor >=4){
            maxlimit = 255;
            minlimit = 225;
            level = 4;
            intent_CodetoColor();
        }else{
            lockedmessage();
        }
    }

    public void CodetoColor5(View v){
        if(ull_CodetoColor >=5){
            maxlimit = 255;
            minlimit = 225;
            level = 5;
            intent_CodetoColor();
        }else{
            lockedmessage();
        }
    }

    public void lockedmessage(){
        new AlertDialog.Builder(menu2Activity.this)
                .setTitle("Lockされています。")
                .setMessage("unLock条件を確認してください。")
                .setPositiveButton("OK",null)
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
                                intent.putExtra("getull_ColortoCode",ull_ColortoCode);
                                intent.putExtra("getull_ColortoCode",ull_CodetoColor);
                                intent.putExtra("getnocomp_ColortoCode1",nocomp_ColortoCode1);
                                intent.putExtra("getnocomp_ColortoCode2",nocomp_ColortoCode2);
                                intent.putExtra("getnocomp_ColortoCode3",nocomp_ColortoCode4);
                                intent.putExtra("getnocomp_ColortoCode4",nocomp_ColortoCode5);
                                intent.putExtra("getnocomp_ColortoCode6",nocomp_ColortoCode6);
                                intent.putExtra("getnocomp_ColortoCode7",nocomp_ColortoCode7);
                                intent.putExtra("getnocomp_ColortoCode8",nocomp_ColortoCode8);
                                intent.putExtra("getnocomp_ColortoCode9",nocomp_ColortoCode9);
                                intent.putExtra("getnocomp_ColortoCode10",nocomp_ColortoCode10);
                                intent.putExtra("getlevel",level);
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
                            intent.putExtra("getull",ull_CodetoColor);
                            //intent.putExtra("getnocomp",);
                            intent.putExtra("getlevel",level);
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

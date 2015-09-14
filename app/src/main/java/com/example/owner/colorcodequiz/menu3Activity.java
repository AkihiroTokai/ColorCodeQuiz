package com.example.owner.colorcodequiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class menu3Activity extends AppCompatActivity {
    private int ull_CodetoColor;
    private int ull_ColortoCode;
    private int nocomp_ColortoCode6;
    private int nocomp_ColortoCode7;
    private int nocomp_ColortoCode8;
    private int nocomp_ColortoCode9;
    private int nocomp_ColortoCode10;
    private int nocomp_CodetoColor6;
    private int nocomp_CodetoColor7;
    private int nocomp_CodetoColor8;
    private int nocomp_CodetoColor9;
    private int nocomp_CodetoColor10;
    private int nocomp;
    private int maxlimit;
    private int minlimit;
    private int number;
    private int level;
    private EditText setnum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu3);
        setnum = (EditText)findViewById(R.id.setnum);
        setnum.setKeyListener(null);
        number = 10;
        //testdata (Intentでメニュー１から飛ばす予定）（メニュー１ではSharedPreference→Parse）
        ull_CodetoColor = 5;
        ull_ColortoCode = 1;
        nocomp_ColortoCode6 = 1;
        nocomp_ColortoCode7 = 0;
        nocomp_ColortoCode8 = 0;
        nocomp_ColortoCode9 = 0;
        nocomp_ColortoCode10 = 0;
        nocomp_CodetoColor6 = 3;
        nocomp_CodetoColor7 = 4;
        nocomp_CodetoColor8 = 5;
        nocomp_CodetoColor9 = 3;
        nocomp_CodetoColor10 = 4;
        //IconChange
        if(ull_CodetoColor >= 6){
            com.beardedhen.androidbootstrap.BootstrapButton CodetoColor6 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.CodetoColor6);
            CodetoColor6.setLeftIcon("fa-unlock");
        }
        if(ull_CodetoColor >= 7){
            com.beardedhen.androidbootstrap.BootstrapButton CodetoColor7 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.CodetoColor7);
            CodetoColor7.setLeftIcon("fa-unlock");
        }
        if(ull_CodetoColor >= 8){
            com.beardedhen.androidbootstrap.BootstrapButton CodetoColor8 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.CodetoColor8);
            CodetoColor8.setLeftIcon("fa-unlock");
        }
        if(ull_CodetoColor >= 9){
            com.beardedhen.androidbootstrap.BootstrapButton CodetoColor9 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.CodetoColor9);
            CodetoColor9.setLeftIcon("fa-unlock");
        }
        if(ull_CodetoColor >= 10){
            com.beardedhen.androidbootstrap.BootstrapButton CodetoColor10 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.CodetoColor10);
            CodetoColor10.setLeftIcon("fa-unlock");
        }
        if(ull_ColortoCode >= 6){
            com.beardedhen.androidbootstrap.BootstrapButton ColortoCode6 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.ColortoCode6);
            ColortoCode6.setLeftIcon("fa-unlock");
        }
        if(ull_ColortoCode >= 7){
            com.beardedhen.androidbootstrap.BootstrapButton ColortoCode7 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.ColortoCode7);
            ColortoCode7.setLeftIcon("fa-unlock");
        }
        if(ull_ColortoCode >= 8){
            com.beardedhen.androidbootstrap.BootstrapButton ColortoCode8 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.ColortoCode8);
            ColortoCode8.setLeftIcon("fa-unlock");
        }
        if(ull_ColortoCode >= 9){
            com.beardedhen.androidbootstrap.BootstrapButton ColortoCode9 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.ColortoCode9);
            ColortoCode9.setLeftIcon("fa-unlock");
        }
        if(ull_ColortoCode >= 10){
            com.beardedhen.androidbootstrap.BootstrapButton ColortoCode10 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.ColortoCode10);
            ColortoCode10.setLeftIcon("fa-unlock");
        }
    }
    public void ColortoCode6(View v){
        if(ull_ColortoCode >=6){
            maxlimit = 255;
            minlimit = 225;
            level = 6;
            nocomp = nocomp_ColortoCode6;
                        intent_ColortoCode();
        }else{
            lockedmessage();
        }
    }

    public void ColortoCode7(View v){
        if(ull_ColortoCode >=7){
            maxlimit = 255;
            minlimit = 225;
            level =7;
            nocomp = nocomp_ColortoCode7;
            intent_ColortoCode();
        }else{
            lockedmessage();
        }
    }

    public void ColortoCode8(View v){
        if(ull_ColortoCode >=8){
            maxlimit = 255;
            minlimit = 225;
            level = 8;
            nocomp = nocomp_ColortoCode8;
            intent_ColortoCode();
        }else{
            lockedmessage();
        }
    }

    public void ColortoCode9(View v){
        if(ull_ColortoCode >=9){
            maxlimit = 255;
            minlimit = 225;
            level = 9;
            nocomp = nocomp_ColortoCode9;
            intent_ColortoCode();
        }else{
            lockedmessage();
        }
    }

    public void ColortoCode10(View v){
        if(ull_ColortoCode >=10){
            maxlimit = 255;
            minlimit = 225;
            level = 10;
            nocomp = nocomp_ColortoCode10;
            intent_ColortoCode();
        }else{
            lockedmessage();
        }
    }

    public void CodetoColor6(View v){
        if(ull_CodetoColor >=6){
            maxlimit = 255;
            minlimit = 225;
            level = 6;
            nocomp = nocomp_CodetoColor6;
            intent_CodetoColor();
        }else{
            lockedmessage();
        }
    }

    public void CodetoColor7(View v){
        if(ull_CodetoColor >=7){
            maxlimit = 255;
            minlimit = 225;
            level = 7;
            nocomp = nocomp_CodetoColor7;
            intent_CodetoColor();
        }else{
            lockedmessage();
        }
    }

    public void CodetoColor8(View v){
        if(ull_CodetoColor >=8){
            maxlimit = 255;
            minlimit = 225;
            level = 8;
            nocomp = nocomp_CodetoColor8;
            intent_CodetoColor();
        }else{
            lockedmessage();
        }
    }

    public void CodetoColor9(View v){
        if(ull_CodetoColor >=9){
            maxlimit = 255;
            minlimit = 225;
            level = 9;
            nocomp = nocomp_CodetoColor9;
            intent_CodetoColor();
        }else{
            lockedmessage();
        }
    }

    public void CodetoColor10(View v){
        if(ull_CodetoColor >=10){
            maxlimit = 255;
            minlimit = 225;
            level = 10;
            nocomp = nocomp_CodetoColor10;
            intent_CodetoColor();
        }else{
            lockedmessage();
        }
    }

    public void lockedmessage(){
        new AlertDialog.Builder(menu3Activity.this)
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
            new AlertDialog.Builder(menu3Activity.this)
                    .setTitle("ColortoCodeをStartしますか？")
                    .setMessage("問題は"+number+"問です。")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // OK button pressed
                            Intent intent = new Intent(menu3Activity.this, ColortoCodeActivity.class);
                            intent.putExtra("getnumber", number);
                            intent.putExtra("getmaxlimit",maxlimit);
                            intent.putExtra("getminlimit",minlimit);
                            intent.putExtra("getull",ull_ColortoCode);
                            intent.putExtra("getnocomp",nocomp);
                            intent.putExtra("getlevel",level);
                            startActivity(intent);
                        }
                    })
                    .setNegativeButton("Cancel",null)
                    .show();
        }else {
            new AlertDialog.Builder(menu3Activity.this)
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
            new AlertDialog.Builder(menu3Activity.this)
                    .setTitle("CodetoColorをStartしますか？")
                    .setMessage("問題は"+number+"問です。")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // OK button pressed
                            Intent intent = new Intent(menu3Activity.this, CodetoColorActivity.class);
                            intent.putExtra("getnumber", number);
                            intent.putExtra("getmaxlimit",maxlimit);
                            intent.putExtra("getminlimit",minlimit);
                            intent.putExtra("getull",ull_ColortoCode);
                            intent.putExtra("getnocomp",nocomp);
                            intent.putExtra("getlevel",level);
                            startActivity(intent);
                        }
                    })
                    .setNegativeButton("Cancel",null)
                    .show();
        }else {
            new AlertDialog.Builder(menu3Activity.this)
                    .setTitle("CodetoColorをStartできません。")
                    .setMessage("入力した内容を確認してください。")
                    .setPositiveButton("OK",null)
                    .show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu3, menu);
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

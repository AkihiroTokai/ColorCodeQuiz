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
import android.widget.TextView;

import com.beardedhen.androidbootstrap.BootstrapButton;


public class MenuActivity extends AppCompatActivity {

    private TextView nowPointview;
    private int nowPoint;
    private int ull_CodetoColor;
    private int ull_ColortoCode;
    private int nd_getPoint;
    private int nocomp_CodetoColor0;
    private int nocomp_ColortoCode0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        nowPointview = (TextView) findViewById(R.id.nowPointview);

       /* ParseQuery<getData> parseQuery = new ParseQuery<>(getData.class);
        parseQuery.findInBackground(new FindCallback<getData>() {
            @Override
            public void done(List<getData> list, ParseException e) {
                if (e == null) {

                } else{
                    e.printStackTrace();
                }
            }
        });    */

        //getData (Parse)
    /*    getData checkData = new getData();
        ull_CodetoColor = checkData.getull_CodetoColor();
        String stull_CodetoColor = String.valueOf(ull_CodetoColor);
        ull_ColortoCode = checkData.getull_CodetoColor();
        String stull_ColortoCode = String.valueOf(ull_ColortoCode);
        nocomp_CodetoColor0 = checkData.getnocomp_CodetoColor0();
        String stnocomp_CodetoColor0 = String.valueOf(nocomp_CodetoColor0);
        nocomp_ColorttoCode0 = checkData.getnocomp_ColortoCode0();
        String stnocomp_ColortoCode =String.valueOf(nocomp_ColorttoCode0);   */

    /*  Calendar cal = Calendar.getInstance();
        int nowyear = cal.get(Calendar.YEAR);
        String stnowyear = String.valueOf(nowyear);
        int nowmoth = cal.get(Calendar.MONTH);
        String stnowmonth = String.valueOf(nowmoth);
        int nowday  = cal.get(Calendar.DAY_OF_MONTH);
        String stnowday = String.valueOf(nowday);

        String nowdate =  (stnowyear+stnowmonth+stnowday);   */

    /*  nowPoint = checkData.getnowPoint();
        String stnowPoint = String.valueOf(nowPoint);
        nowPointview.setText("YourPoint:" + nowPoint);       */

    /*  Log.d("nowpoint", stnowPoint);
        Log.d("ull_ColortoCode", stull_ColortoCode);
        Log.d("ull_CodetoColor", stull_CodetoColor);    */


        //getData（SharedPreference)
        SharedPreferences getData = getSharedPreferences("DataSave", Context.MODE_PRIVATE);
        ull_CodetoColor = getData.getInt("ull_CodetoColor",0 );
        ull_ColortoCode = getData.getInt("ull_ColortoCode",0);
        nowPoint = getData.getInt("nowPoint",0);
        nocomp_CodetoColor0 = getData.getInt("nocomp_CodetoColor",0);
        nocomp_ColortoCode0 = getData.getInt("nocomp_ColortoCode0",0);

        nowPointview.setText("YourPoint:"+nowPoint);

        //changeIcon
        if (ull_CodetoColor >= 1 || ull_ColortoCode >= 1) {
            BootstrapButton tomenu2 = (BootstrapButton) findViewById(R.id.tomenu2);
            tomenu2.setLeftIcon("fa-unlock");
        }
        if (ull_CodetoColor >= 6 || ull_ColortoCode >= 6) {
            BootstrapButton tomenu3 = (BootstrapButton) findViewById(R.id.tomenu3);
            tomenu3.setLeftIcon("fa-unlock");
        }


    }

    public void gotologin(View v) {
            Intent intent = new Intent(MenuActivity.this, loginActivity.class);
            startActivity(intent);
    }



    public void tomenu2(View v) {
        if (ull_CodetoColor>=1||ull_CodetoColor>=1) {
            Intent intent = new Intent(MenuActivity.this, menu2Activity.class);
            startActivity(intent);
        } else{
            new AlertDialog.Builder(MenuActivity.this)
                    .setTitle("Lockされています。")
                    .setMessage("Practiceをそれぞれ3回以上クリアし、30Point以上獲得してください。")
                    .setPositiveButton("OK", null)
                    .show();
        }
    }

    public void tomenu3(View v) {
        if (ull_CodetoColor >= 6||ull_CodetoColor >= 6) {
            Intent intent = new Intent(MenuActivity.this, menu3Activity.class);
            startActivity(intent);
        } else{
            new AlertDialog.Builder(MenuActivity.this)
                    .setTitle("Lockされています。")
                    .setMessage("レベル6をUnLockしてください。")
                    .setPositiveButton("OK",null)
                    .show();
        }
    }

    public void CodetoColor_practice (View v){
        new AlertDialog.Builder(MenuActivity.this)
                .setTitle("CodetoColor_praciceをStartしますか？")
                .setMessage("問題は10問です。"+ nocomp_CodetoColor0 +"回クリアしています。")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // OK button pressed
                        Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("Cancel", null)
                .show();
    }

    public void ColortoCode_practice (View v){
        new AlertDialog.Builder(MenuActivity.this)
                .setTitle("CodetoColor_praciceをStartしますか？")
                .setMessage("問題は10問です。"+ nocomp_ColortoCode0 +"回クリアしています。")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // OK button pressed
                        Intent intent = new Intent(MenuActivity.this, ColortoCode_practiceActivity.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("Cancel", null)
                .show();
    }

     public void menu2 (View v) {
         Intent intent = new Intent(MenuActivity.this, menu2Activity.class);
         startActivity(intent);
     }

    public void menu3 (View v) {
        Intent intent = new Intent(MenuActivity.this, menu3Activity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
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

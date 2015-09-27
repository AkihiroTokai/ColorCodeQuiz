package com.example.owner.colorcodequiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.beardedhen.androidbootstrap.BootstrapButton;
import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseQuery;

import java.util.Calendar;
import java.util.List;


public class MenuActivity extends AppCompatActivity {

    private TextView nowPointview;
    private int nowPoint;
    private int ull_CodetoColor;
    private int ull_ColortoCode;
    private int nd_getPoint;
    private int nocomp_CodetoColor0;
    private int nocomp_ColorttoCode0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        nowPointview = (TextView) findViewById(R.id.nowPointview);

        ParseQuery<getData> parseQuery = new ParseQuery<>(getData.class);
        parseQuery.findInBackground(new FindCallback<getData>() {
            @Override
            public void done(List<getData> list, ParseException e) {
                if (e == null) {
                    new AlertDialog.Builder(MenuActivity.this)
                            .setTitle("Lockされています。")
                            .setMessage("レベル6をUnLockしてください。")
                            .setPositiveButton("OK",null)
                            .show();
                } else{
                    e.printStackTrace();
                }
            }
        });
        //getData
        getData checkData = new getData();
        ull_CodetoColor = checkData.getull_CodetoColor();
        ull_ColortoCode = checkData.getull_CodetoColor();
        nocomp_CodetoColor0 = checkData.getnocomp_CodetoColor0();
        nocomp_ColorttoCode0 = checkData.getnocomp_ColortoCode0();
        Calendar cal = Calendar.getInstance();
        int nowyear = cal.get(Calendar.YEAR);
        String stnowyear = String.valueOf(nowyear);
        int nowmoth = cal.get(Calendar.MONTH);
        String stnowmonth = String.valueOf(nowmoth);
        int nowday  = cal.get(Calendar.DAY_OF_MONTH);
        String stnowday = String.valueOf(nowday);
        String nowdate =  (stnowyear+stnowmonth+stnowday);

        nowPoint = checkData.getnowPoint();

        nowPointview.setText("YourPoint:" + nowPoint);

        //changeIcon
        if (ull_CodetoColor >= 1 || ull_ColortoCode >= 1) {
            BootstrapButton tomenu2 = (BootstrapButton) findViewById(R.id.tomenu2);
            tomenu2.setLeftIcon("fa-unlock");
        }
        if (ull_CodetoColor >= 6 || ull_ColortoCode >= 6) {
            BootstrapButton tomenu3 = (BootstrapButton) findViewById(R.id.facebook);
            tomenu3.setLeftIcon("fa-unlock");
        }

        nowPointview.setText("YourPoint:" + nowPoint);
        String stnowPoint = String.valueOf(nowPoint);
        Log.d("d",stnowPoint);
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
                .setMessage("問題は10問です。"+ nocomp_ColorttoCode0 +"回クリアしています。")
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

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
    private int colormode;
    private int noq;

    private int RGB_nowPoint;
    private int RGB_ull_CodetoColor;
    private int RGB_ull_ColortoCode;
    private int RGB_nocomp_CodetoColor0;
    private int RGB_nocomp_ColortoCode0;

    private int HSB_nowPoint;
    private int HSB_ull_CodetoColor;
    private int HSB_ull_ColortoCode;
    private int HSB_nocomp_CodetoColor0;
    private int HSB_nocomp_ColortoCode0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        nowPointview = (TextView) findViewById(R.id.nowPointview);
        colormode = 1;
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
        /*SharedPreferences.Editor editor = getData.edit();
        editor.clear().commit();*/
        RGB_ull_CodetoColor = getData.getInt("RGB_ull_CodetoColor", 0);
        RGB_ull_ColortoCode = getData.getInt("RGB_ull_ColortoCode", 0);
        RGB_nowPoint = getData.getInt("RGB_nowPoint", 0);
        RGB_nocomp_CodetoColor0 = getData.getInt("RGB_nocomp_CodetoColor", 0);
        RGB_nocomp_ColortoCode0 = getData.getInt("RGB_nocomp_ColortoCode0", 0);

        HSB_ull_CodetoColor = getData.getInt("HSB_ull_CodetoColor", 0);
        HSB_ull_ColortoCode = getData.getInt("HSB_ull_ColortoCode", 0);
        HSB_nowPoint = getData.getInt("HSB_nowPoint", 0);
        HSB_nocomp_CodetoColor0 = getData.getInt("HSB_nocomp_CodetoColor", 0);
        HSB_nocomp_ColortoCode0 = getData.getInt("HSB_nocomp_ColortoCode0", 0);

        changeIcon();

        nowPointview.setText("RGBPoint:" + RGB_nowPoint);

        //-----------------↓TestData↓-----------------.
        RGB_ull_CodetoColor = 5;
        RGB_ull_ColortoCode = 4;
        HSB_ull_CodetoColor = 7;
        HSB_ull_ColortoCode = 8;
        //------------------↑TestData↑--------------ー
    }

    public void gotologin(View v) {
        Intent intent = new Intent(MenuActivity.this, loginActivity.class);
        startActivity(intent);
    }

    public void selectRGB(View v) {
        colormode = 1;
        nowPointview.setText("RGBPoint:" + RGB_nowPoint);
        changeIcon();
    }

    public void selectHSB(View v) {
        colormode = 2;
        nowPointview.setText("HSBPoint:" + HSB_nowPoint);
        changeIcon();
    }

    public void changeIcon() {
        //changeIcon
        if (colormode == 1) {
            if (RGB_ull_CodetoColor >= 1 || RGB_ull_ColortoCode >= 1) {
                BootstrapButton tomenu2 = (BootstrapButton) findViewById(R.id.tomenu2);
                tomenu2.setLeftIcon("fa-unlock");
            }
            if (RGB_ull_CodetoColor >= 6 || RGB_ull_ColortoCode >= 6) {
                BootstrapButton tomenu3 = (BootstrapButton) findViewById(R.id.tomenu3);
                tomenu3.setLeftIcon("fa-unlock");
            }
        } else if (colormode == 2) {
            if (HSB_ull_CodetoColor >= 1 || HSB_ull_ColortoCode >= 1) {
                BootstrapButton tomenu2 = (BootstrapButton) findViewById(R.id.tomenu2);
                tomenu2.setLeftIcon("fa-unlock");
            }
            if (HSB_ull_CodetoColor >= 6 || HSB_ull_ColortoCode >= 6) {
                BootstrapButton tomenu3 = (BootstrapButton) findViewById(R.id.tomenu3);
                tomenu3.setLeftIcon("fa-unlock");
            }
        }
    }

    public void tomenu2(View v) {
        if (colormode == 1) {
            if (RGB_ull_CodetoColor >= 1 || RGB_ull_CodetoColor >= 1) {
                Intent intent = new Intent(MenuActivity.this, menu2Activity.class);
                intent.putExtra("getcolormode", colormode);
                startActivity(intent);
            } else {
                new AlertDialog.Builder(MenuActivity.this)
                        .setTitle("Lockされています。")
                        .setMessage("Practiceをそれぞれ3回以上クリアし、30Point以上獲得してください。")
                        .setPositiveButton("OK", null)
                        .show();
            }
        } else if (colormode == 2) {
            if (HSB_ull_CodetoColor >= 1 || HSB_ull_CodetoColor >= 1) {
                Intent intent = new Intent(MenuActivity.this, menu2Activity.class);
                intent.putExtra("getcolormode", colormode);
                startActivity(intent);
            } else {
                new AlertDialog.Builder(MenuActivity.this)
                        .setTitle("Lockされています。")
                        .setMessage("Practiceをそれぞれ3回以上クリアし、30Point以上獲得してください。")
                        .setPositiveButton("OK", null)
                        .show();
            }
        }
    }


    public void tomenu3(View v) {
        if (colormode == 1) {
            if (RGB_ull_CodetoColor >= 6 || RGB_ull_CodetoColor >= 6) {
                Intent intent = new Intent(MenuActivity.this, menu3Activity.class);
                intent.putExtra("getcolormode", colormode);
                startActivity(intent);
            } else {
                new AlertDialog.Builder(MenuActivity.this)
                        .setTitle("Lockされています。")
                        .setMessage("レベル6をUnLockしてください。")
                        .setPositiveButton("OK", null)
                        .show();
            }
        } else if (colormode == 2) {
            if (HSB_ull_CodetoColor >= 6 || HSB_ull_CodetoColor >= 6) {
                Intent intent = new Intent(MenuActivity.this, menu3Activity.class);
                intent.putExtra("getcolormode", colormode);
                startActivity(intent);
            } else {
                new AlertDialog.Builder(MenuActivity.this)
                        .setTitle("Lockされています。")
                        .setMessage("レベル6をUnLockしてください。")
                        .setPositiveButton("OK", null)
                        .show();
            }
        }
    }

    public void CodetoColor_practice(View v) {
        int this_nocomp = 0;
        if (colormode == 1) {
            this_nocomp = RGB_nocomp_CodetoColor0;
            noq = 10;
        } else if (colormode == 2) {
            this_nocomp = HSB_nocomp_CodetoColor0;
            noq = 15;
        }
        new AlertDialog.Builder(MenuActivity.this)
                .setTitle("CodetoColor_praciceをStartしますか？")
                .setMessage("問題は" + noq + "問です。" + this_nocomp + "回クリアしています。")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // OK button pressed
                        Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                        intent.putExtra("getcolormode", colormode);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("Cancel", null)
                .show();
    }

    public void ColortoCode_practice(View v) {
        int this_nocomp = 0;
        if (colormode == 1) {
            this_nocomp = RGB_nocomp_ColortoCode0;
            noq = 10;
        } else if (colormode == 2) {
            this_nocomp = HSB_nocomp_ColortoCode0;
            noq = 15;
        }
        new AlertDialog.Builder(MenuActivity.this)
                .setTitle("ColortoCode_praciceをStartしますか？")
                .setMessage("問題は" + noq + "問です。" + this_nocomp + "回クリアしています。")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // OK button pressed
                        Intent intent = new Intent(MenuActivity.this, ColortoCode_practiceActivity.class);
                        intent.putExtra("getcolormode", colormode);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("Cancel", null)
                .show();
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

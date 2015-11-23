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
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.util.Random;


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

    private int this_nocomp_CodetoColor0;
    private int this_nocomp_ColortoCode0;


    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //showAd
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        String interstitial_ad_menu1_unit_id = getString(R.string.interstitial_ad_menu1_unit_id);
        mInterstitialAd.setAdUnitId(interstitial_ad_menu1_unit_id);
        requestNewInterstitial();


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

        //-----------------↓TestData↓-----------------//
        /*SharedPreferences.Editor editor = getData.edit();
        editor.clear().commit();*/
        RGB_ull_CodetoColor = 5;
        RGB_ull_ColortoCode = 4;
        HSB_ull_CodetoColor = 7;
        HSB_ull_ColortoCode = 8;
        //------------------↑TestData↑--------------ー //

        changeIcon();

        nowPointview.setText("RGBPoint:" + RGB_nowPoint);

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
                BootstrapButton tomenu2= (BootstrapButton) findViewById(R.id.tomenu2);
                tomenu2.setLeftIcon("fa-unlock");
            }
            if (RGB_ull_CodetoColor >= 6 || RGB_ull_ColortoCode >= 6) {
                BootstrapButton tomenu3= (BootstrapButton) findViewById(R.id.tomenu3);
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
                String locked_message = getString(R.string.locked_message);
                String locked_message_tomenu2 =getString(R.string.locked_message_tomenu2);
                String posstive_button = getString(R.string.posstive_button);
                new AlertDialog.Builder(MenuActivity.this)
                        .setTitle(locked_message)
                        .setMessage(locked_message_tomenu2)
                        .setPositiveButton(posstive_button, null)
                        .show();
            }
        } else if (colormode == 2) {
            if (HSB_ull_CodetoColor >= 1 || HSB_ull_CodetoColor >= 1) {
                Intent intent = new Intent(MenuActivity.this, menu2Activity.class);
                intent.putExtra("getcolormode", colormode);
                startActivity(intent);
            } else {
                String locked_message = getString(R.string.locked_message);
                String locked_message_tomenu2 =getString(R.string.locked_message_tomenu2);
                String posstive_button = getString(R.string.posstive_button);
                new AlertDialog.Builder(MenuActivity.this)
                        .setTitle(locked_message)
                        .setMessage(locked_message_tomenu2)
                        .setPositiveButton(posstive_button, null)
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
                String locked_message = getString(R.string.locked_message);
                String locked_message_tomenu3 =getString(R.string.locked_message_tomenu3);
                String posstive_button = getString(R.string.posstive_button);
                new AlertDialog.Builder(MenuActivity.this)
                        .setTitle(locked_message)
                        .setMessage(locked_message_tomenu3)
                        .setPositiveButton(posstive_button, null)
                        .show();
            }
        } else if (colormode == 2) {
            if (HSB_ull_CodetoColor >= 6 || HSB_ull_CodetoColor >= 6) {
                Intent intent = new Intent(MenuActivity.this, menu3Activity.class);
                intent.putExtra("getcolormode", colormode);
                startActivity(intent);
            } else {
                String locked_message = getString(R.string.locked_message);
                String locked_message_tomenu3 =getString(R.string.locked_message_tomenu3);
                String posstive_button = getString(R.string.posstive_button);
                new AlertDialog.Builder(MenuActivity.this)
                        .setTitle(locked_message)
                        .setMessage(locked_message_tomenu3)
                        .setPositiveButton(posstive_button, null)
                        .show();
            }
        }
    }

    public void CodetoColor_practice(View v) {
        if (colormode == 1) {
            this_nocomp_CodetoColor0 = RGB_nocomp_CodetoColor0;
            noq = 10;
        } else if (colormode == 2) {
            this_nocomp_CodetoColor0 = HSB_nocomp_CodetoColor0;
            noq = 15;
        }

        Random rnd = new Random();
        int decide_showAd = rnd.nextInt(5);
        if (decide_showAd == 0 && mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    mInterstitialAd.show();
                    requestNewInterstitial();
                    intent_CodetoColor_practice();
                }
            });
        } else {
            intent_CodetoColor_practice();
        }
    }

    public void intent_CodetoColor_practice() {
        new AlertDialog.Builder(MenuActivity.this)
                String start_message_CodetoColor_practice = getString(R.string.start_message_CodetoColor_practice)
                .setTitle(start_message_CodetoColor_practice)
                .setMessage("問題は" + noq + "問です。" + this_nocomp_CodetoColor0 + "回クリアしています。")
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
        if (colormode == 1) {
            this_nocomp_ColortoCode0 = RGB_nocomp_ColortoCode0;
            noq = 10;
        } else if (colormode == 2) {
            this_nocomp_ColortoCode0 = HSB_nocomp_ColortoCode0;
            noq = 15;
        }
        Random rnd = new Random();
        int decide_showAd = rnd.nextInt(5);
        if (decide_showAd == 0 && mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    mInterstitialAd.show();
                    requestNewInterstitial();
                    intent_ColortoCode_practice();
                }
            });
        } else {
            intent_ColortoCode_practice();
        }
    }

    public void intent_ColortoCode_practice() {
        new AlertDialog.Builder(MenuActivity.this)
                .setTitle("CodetoColor_praciceをStartしますか？")
                .setMessage("問題は" + noq + "問です。" + this_nocomp_ColortoCode0 + "回クリアしています。")
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

    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();

        mInterstitialAd.loadAd(adRequest);
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

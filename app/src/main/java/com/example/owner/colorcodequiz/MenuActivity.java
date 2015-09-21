package com.example.owner.colorcodequiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.beardedhen.androidbootstrap.BootstrapButton;
import com.example.owner.colorcodequiz.getData;

import java.security.MessageDigest;
import java.security.Signature;


public class MenuActivity extends AppCompatActivity {

    private TextView nowPointview;
    private int nowPoint;
    private int ull_CodetoColor;
    private int ull_ColortoCode;
    private int nocomp_CodetoColor0;
    private int nocomp_ColorttoCode0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        nowPointview = (TextView)findViewById(R.id.nowPointview);

        //getData
        getData checkData = new getData();
        ull_CodetoColor = checkData.getull_CodetoColor();
        ull_ColortoCode = checkData.getull_CodetoColor();
        nocomp_CodetoColor0 = checkData.getnocomp_CodetoColor0();
        nocomp_ColorttoCode0 = checkData.getnocomp_ColortoCode0();

        nowPoint = checkData.getnowPoint();

        nowPointview.setText("YourPoint:"+nowPoint);

        //changeIcon
        if(ull_CodetoColor >= 1 || ull_ColortoCode >= 1) {
            BootstrapButton tomenu2 = (BootstrapButton)findViewById(R.id.tomenu2);
            tomenu2.setLeftIcon("fa-unlock");
        }
        if(ull_CodetoColor >= 6 || ull_ColortoCode >= 6){
            BootstrapButton tomenu3 = (BootstrapButton)findViewById(R.id.tomenu3);
            tomenu3.setLeftIcon("fa-unlock");
        }


      /*  try {
            PackageInfo info = getPackageManager().getPackageInfo(
                    "com.facebook.samples.loginhowto",
                    PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.d("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT));
            }
        } catch (NameNotFoundException e) {

        } catch (NoSuchAlgorithmException e) {

        }    */
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

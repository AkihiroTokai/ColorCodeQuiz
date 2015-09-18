package com.example.owner.colorcodequiz;

import android.app.AlertDialog;
import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.parse.GetCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;


public class MenuActivity extends AppCompatActivity {

    private  int ull_CodetoColor;
    private  int ull_ColortoCode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //testdata
        ull_CodetoColor =1;
        ull_ColortoCode =1;

        ParseQuery<ParseObject> query = ParseQuery.getQuery("gamedata");
        query.fromLocalDatastore();
        query.getInBackground("xWMyZ4YEGZ", new GetCallback<ParseObject>() {
            public void done(ParseObject object, ParseException e) {
                if (e == null) {
                    // object will be your game score
                } else {
                    // something went wrong
                }
            }
        });
        if(ull_CodetoColor >= 1 || ull_ColortoCode >= 1 ){
            com.beardedhen.androidbootstrap.BootstrapButton tomenu2 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.tomenu2);
            tomenu2.setLeftIcon("fa-unlock");
        }
        if(ull_CodetoColor >= 6 || ull_ColortoCode >= 6){
            com.beardedhen.androidbootstrap.BootstrapButton tomenu3 = (com.beardedhen.androidbootstrap.BootstrapButton)findViewById(R.id.tomenu3);
            tomenu3.setLeftIcon("fa-unlock");
        }
    }


    public void tomenu2(View v) {
        if (ull_CodetoColor>=1||ull_CodetoColor>=1) {
            Intent intent = new Intent(MenuActivity.this, menu2Activity.class);
            startActivity(intent);
        } else{
            new AlertDialog.Builder(MenuActivity.this)
                    .setTitle("Lockされています。")
                    .setMessage("Practiceをそれぞれ3回以上クリアしてください。")
                    .setPositiveButton("OK",null)
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
                .setMessage("問題は10問です。")
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

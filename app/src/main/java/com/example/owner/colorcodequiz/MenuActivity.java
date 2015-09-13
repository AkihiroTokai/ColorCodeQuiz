package com.example.owner.colorcodequiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MenuActivity extends AppCompatActivity {
     private EditText setnum;
     private int number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setnum = (EditText)findViewById(R.id.setnum) ;
    }


    public void CodetoColor(View v) {
        setnum.selectAll();
        String num = setnum.getText().toString();
       if( num.equals("") ){
         number = 0;
       }else {
           number = Integer.parseInt(num);
       } if (number > 0){
            new AlertDialog.Builder(MenuActivity.this)
                .setTitle("CodetoColorをStartしますか？")
                .setMessage("問題は"+number+"問です。")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // OK button pressed
                        Intent intent = new Intent(MenuActivity.this, CodetoColorActivity.class);
                        intent.putExtra("getnumber", number);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("Cancel",null)
                .show();
        }else {
            new AlertDialog.Builder(MenuActivity.this)
                    .setTitle("CodetoColorをStartできません。")
                    .setMessage("入力した内容を確認してください。")
                    .setPositiveButton("OK",null)
                    .show();
        }
    }


    public void ColortoCode(View v) {
        setnum.selectAll();
        String num = setnum.getText().toString();
        if( num.equals("") ){
            number = 0;
        }else {
            number = Integer.parseInt(num);
        }if (number > 0) {
            new AlertDialog.Builder(MenuActivity.this)
                    .setTitle("ColortoCodeをStartしますか？")
                    .setMessage("問題は" + number + "問です。")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // OK button pressed
                            Intent intent = new Intent(MenuActivity.this, ColortoCodeActivity.class);
                            intent.putExtra("getnumber", number);
                            startActivity(intent);
                        }
                    })
                    .setNegativeButton("Cancel", null)
                    .show();
        }else{
            new AlertDialog.Builder(MenuActivity.this)
                    .setTitle("ColortoCodeをStartできません。")
                    .setMessage("入力した内容を確認してください。")
                    .setPositiveButton("OK",null)
                    .show();
        }
    }

    public void ColortoCode_practice(View v) {
        new AlertDialog.Builder(MenuActivity.this)
                .setTitle("ColortoCode_practiceをStartしますか？")
                .setMessage("問題は10問です。")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // OK button pressed
                        Intent intent = new Intent(MenuActivity.this, ColortoCode_practiceActivity.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("Cancel",null)
                .show();
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

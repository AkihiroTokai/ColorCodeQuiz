package com.example.owner.colorcodequiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;





public class MainActivity extends AppCompatActivity {

    private TextView progress;
    private TextView red;
    private TextView green;
    private TextView blue;
    private ImageView check_select1;
    private ImageView check_select2;
    private ImageView check_select3;
    private ImageView check_select4;
    private TextView answer1;
    private TextView answer2;
    private TextView answer3;
    private TextView answer4;
    private int gameCount;
    private int check_answer;
    private int noca;
    private int ull_CodetoColor;
    private int ull_ColortoCode;
    private int ull_old;
    private int nowPoint;
    private int getPoint;

    private int nocomp_CodetoColor0;
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

    private int nocomp_ColortoCode0;
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

    private boolean nextquestion;

    private String gameResult;
    private String unlockmode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer1 = (TextView) findViewById(R.id.answer1);
        answer2 = (TextView) findViewById(R.id.answer2);
        answer3 = (TextView) findViewById(R.id.answer3);
        answer4 = (TextView) findViewById(R.id.answer4);

        progress = (TextView)findViewById(R.id.progress);
        red = (TextView) findViewById(R.id.red);
        green = (TextView) findViewById(R.id.green);
        blue = (TextView) findViewById(R.id.blue);

        check_select1 = (ImageView)findViewById(R.id.check_select1);
        check_select2 = (ImageView)findViewById(R.id.check_select2);
        check_select3 = (ImageView)findViewById(R.id.check_select3);
        check_select4 = (ImageView)findViewById(R.id.check_select4);

        nextquestion = false;
         setanswer();

    }

    public void select1(View view) {
        if (!nextquestion) {
            if (check_answer == 1) {
                check_select1.setImageResource(R.drawable.maru);
                noca = noca+1;
            } else {
                check_select1.setImageResource(R.drawable.batu);
            }
            if (gameCount <= 10) {
                gameCount = gameCount + 1;
                progress.setText("Progress:" + gameCount + "/"+ 10);
                nextquestion = true;
            }if (gameCount >= 10){
                gameFinish();
            }
        }else {
            setanswer();
            nextquestion = false;
        }
    }


    public void select2(View view) {
        if (!nextquestion) {
            if (check_answer == 2) {
                check_select2.setImageResource(R.drawable.maru);
                noca = noca+1;
            } else {
                check_select2.setImageResource(R.drawable.batu);
            }
            if (gameCount <= 10) {
                gameCount = gameCount + 1;
                progress.setText("Progress:" + gameCount + "/"+ 10);
                nextquestion = true;
            }if (gameCount >= 10){
                gameFinish();
            }
        }else {
            setanswer();
            nextquestion = false;
        }
    }

    public void select3(View view) {
        if (!nextquestion) {
            if (check_answer == 3) {
                check_select3.setImageResource(R.drawable.maru);
                noca = noca+1;
            } else {
                check_select3.setImageResource(R.drawable.batu);
            }
            if (gameCount <= 10) {
                gameCount = gameCount + 1;
                progress.setText("Progress:" + gameCount + "/"+ 10);
                nextquestion = true;
            }if (gameCount >= 10){
                gameFinish();
            }
        }else {
            setanswer();
            nextquestion = false;
        }
    }

    public void select4(View view) {
        if (!nextquestion) {
            if (check_answer == 4) {
                check_select4.setImageResource(R.drawable.maru);
                noca = noca+1;
            } else {
                check_select4.setImageResource(R.drawable.batu);
            }
            if (gameCount <= 10) {
                gameCount = gameCount + 1;
                progress.setText("Progress:" + gameCount + "/"+ 10);
                nextquestion = true;
            }if (gameCount >= 10){
                gameFinish();
            }
        }else {
            setanswer();
            nextquestion = false;
        }
    }

    public void gameFinish(){
        //Add:Score
        if (noca <= 7) {
            getPoint = 1;
            gameResult = "クリアできませんでした。";
        } else if (noca == 8 || noca == 9) {
            getPoint = 10;
            gameResult = "クリアしました。";
        } else if (noca == 10) {
            getPoint = 11;
            gameResult = "クリアしました。";
        }


        nowPoint = nowPoint + getPoint ;

        //Check:Levelup(ColortoCode)
        if (ull_ColortoCode  == 0&& nowPoint >= 30& nocomp_ColortoCode0 >= 3 ){
            unlockmode = "ColortoCode";
            ull_CodetoColor  = 1;
            ull_old = ull_CodetoColor-1;
            ulm_CodetoColor();
        }
        if (ull_ColortoCode  == 1 && nowPoint >= 60 &&  nocomp_ColortoCode1 >= 3 ){
            unlockmode = "ColortoCode";
            ull_ColortoCode  = 2;
            ulm_ColortoCode();
            ull_old = ull_ColortoCode-1;
        }

        else if(ull_ColortoCode == 2 && nowPoint >= 90 && nocomp_ColortoCode2>= 3 ){
            unlockmode = "ColortoCode";
            ull_ColortoCode = 3;
            ull_old = ull_ColortoCode-1;
            ulm_ColortoCode();
        }

        else if(ull_ColortoCode == 3 && nowPoint >= 125 && nocomp_ColortoCode3 >= 3){
            unlockmode = "ColortoCode";
            ull_ColortoCode = 4;
            ull_old = ull_ColortoCode-1;
            ulm_ColortoCode();
        }

        else if(ull_ColortoCode == 4 && nowPoint >= 180 && nocomp_ColortoCode4 >= 4 && ull_CodetoColor>= 3){
            unlockmode = "ColortoCode";
            ull_ColortoCode = 5;
            ull_old = ull_ColortoCode-1;
            ulm_ColortoCode();
        }

        else if(ull_ColortoCode == 5 && nowPoint >= 240 && nocomp_ColortoCode5 >= 4) {
            unlockmode = "ColortoCode";
            ull_ColortoCode = 6;
            ull_old = ull_ColortoCode-1;
            ulm_ColortoCode();
        }

        else if(ull_ColortoCode == 6 && nowPoint >= 320 && nocomp_ColortoCode6 >= 5 && ull_CodetoColor>= 5){
            unlockmode = "ColortoCode";
            ull_ColortoCode = 7;
            ull_old = ull_ColortoCode-1;
            ulm_ColortoCode();
        }

        else if(ull_ColortoCode == 7 && nowPoint >= 425 && nocomp_ColortoCode7 >= 6){
            unlockmode = "ColortoCode";
            ull_ColortoCode = 8;
            ull_old = ull_ColortoCode-1;
            ulm_ColortoCode();
        }

        else if(ull_ColortoCode == 8 && nowPoint >= 560 && nocomp_ColortoCode8 >= 7 && ull_CodetoColor>= 7){
            unlockmode = "ColortoCode";
            ull_ColortoCode = 9;
            ull_old = ull_ColortoCode-1;
            ulm_ColortoCode();
        }

        else if(ull_ColortoCode == 9 && nowPoint >= 750 && nocomp_ColortoCode9 >= 8){
            unlockmode = "ColortoCode";
            ull_ColortoCode = 10;
            ull_old = ull_ColortoCode-1;
            ulm_ColortoCode();
        }

        else if(ull_ColortoCode == 10 && nowPoint >= 1000 && nocomp_ColortoCode10 >= 10){
            unlockmode = "ColortoCode";
            ull_ColortoCode = 11;
            ull_old = ull_ColortoCode-1;
            compm();
        }


        //Check:Levelup(CodetoColor)
        if (ull_CodetoColor  == 0&& nowPoint >= 30& nocomp_CodetoColor0 >= 3 ){
            unlockmode = "CodetoColor";
            ull_CodetoColor  = 1;
            ull_old = ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if (ull_CodetoColor  == 1 && nowPoint >= 60 && nocomp_CodetoColor1 >= 3 ){
            unlockmode = "CodetoColor";
            ull_CodetoColor  = 2;
            ull_old = ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if(ull_CodetoColor == 2 && nowPoint >= 90 && nocomp_CodetoColor2 >= 3 ){
            unlockmode = "CodetoColor";
            ull_CodetoColor = 3;
            ull_old = ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if(ull_CodetoColor == 3 && nowPoint >= 125 && nocomp_CodetoColor3 >= 3){
            unlockmode = "CodetoColor";
            ull_CodetoColor = 4;
            ull_old = ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if (ull_CodetoColor == 4 && nowPoint >= 180 && nocomp_CodetoColor4 >= 4 && ull_ColortoCode>= 3){
            unlockmode = "CodetoColor";
            ull_CodetoColor = 5;
            ull_old = ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if(ull_CodetoColor == 5 && nowPoint >= 240 && nocomp_CodetoColor5 >= 4) {
            unlockmode = "CodetoColor";
            ull_CodetoColor = 6;
            ull_old = ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if (ull_CodetoColor == 6 && nowPoint >= 320 && nocomp_CodetoColor6 >= 5 && ull_ColortoCode>= 5){
            unlockmode = "CodetoColor";
            ull_CodetoColor = 7;
            ull_old = ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if(ull_CodetoColor == 7 && nowPoint >= 425 && nocomp_CodetoColor7 >= 6){
            unlockmode = "CodetoColor";
            ull_CodetoColor = 8;
            ull_old = ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if (ull_CodetoColor == 8 && nowPoint >= 560 && nocomp_CodetoColor8 >= 7 && ull_ColortoCode>= 7){
            unlockmode = "CodetoColor";
            ull_CodetoColor = 9;
            ull_old = ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if(ull_CodetoColor == 9 && nowPoint >= 750 && nocomp_CodetoColor9 >= 8){
            unlockmode = "CodetoColor";
            ull_CodetoColor= 10;
            ull_old = ull_CodetoColor-1;
            ulm_CodetoColor();
        }

        else if(ull_CodetoColor == 10 && nowPoint >= 1000 && nocomp_CodetoColor10 >= 10){
            unlockmode = "CodetoColor";
            ull_CodetoColor = 11;
            ull_old = ull_CodetoColor-1;
            compm();
        }
        //gameFinish
        new AlertDialog.Builder(MainActivity.this)
                .setTitle( getPoint + "Point獲得しました。")
                .setMessage(10 + "問中" + noca + "問正解したので、" + gameResult)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // OK button pressed
                        Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                        intent.putExtra("nowScore",nowPoint);
                        intent.putExtra("getScore",getPoint);
                        intent.putExtra("ull_ColortoCode ",ull_ColortoCode );
                        startActivity(intent);
                    }
                }).show();
    }

    public  void ulm_ColortoCode(){
        new AlertDialog.Builder(MainActivity.this)
                .setTitle(unlockmode+"Level" + ull_old + "をMasterしました！")
                .setMessage(unlockmode + "Level" + ull_ColortoCode + "がUnLockされました。")
                .setPositiveButton("OK",null)
                .show();
    }

    public  void ulm_CodetoColor(){
        new AlertDialog.Builder(MainActivity.this)
                .setTitle(unlockmode+"Level" + ull_old + "をMasterしました！")
                .setMessage(unlockmode+"Level"+ull_CodetoColor +"がUnLockされました。")
                .setPositiveButton("OK", null)
                .show();
    }

    public void compm(){
        new AlertDialog.Builder(MainActivity.this)
                .setTitle(unlockmode+"をMasterしました！")
                .setMessage("おめでとうございます。")
                .setPositiveButton("OK", null)
                .show();
    }

    private void setanswer() {
        //cleanCheckselect
        check_select1.setImageDrawable(null);
        check_select2.setImageDrawable(null);
        check_select3.setImageDrawable(null);
        check_select4.setImageDrawable(null);

        gameCount = gameCount + 1;

         if (gameCount == 1) {
            red.setText("00");
            green.setText("00");
            blue.setText("00");
            answer1.setBackgroundColor(Color.parseColor("#000000"));
            answer2.setBackgroundColor(Color.parseColor("#ffffff"));
            answer3.setBackgroundColor(Color.parseColor("#ff0000"));
            answer4.setBackgroundColor(Color.parseColor("#0000ff"));
            check_answer = 1;
        }

        else if (gameCount == 2) {
            red.setText("ff");
            green.setText("ff");
            blue.setText("ff");
            answer1.setBackgroundColor(Color.parseColor("#00ffff"));
            answer2.setBackgroundColor(Color.parseColor("#ffffff"));
            answer3.setBackgroundColor(Color.parseColor("#ffff00"));
            answer4.setBackgroundColor(Color.parseColor("#ff00ff"));
            check_answer = 2;
        }

        else if (gameCount == 3) {
            red.setText("00");
            green.setText("ff");
            blue.setText("ff");
            answer1.setBackgroundColor(Color.parseColor("#00ffff"));
            answer2.setBackgroundColor(Color.parseColor("#ffff00"));
            answer3.setBackgroundColor(Color.parseColor("#0088ff"));
            answer4.setBackgroundColor(Color.parseColor("#ff00ff"));
            check_answer = 1;
        }

        else if (gameCount == 4) {
            red.setText("ff");
            green.setText("00");
            blue.setText("ff");
            answer1.setBackgroundColor(Color.parseColor("#00ffff"));
            answer2.setBackgroundColor(Color.parseColor("#ff00ff"));
            answer3.setBackgroundColor(Color.parseColor("#ffff00"));
            answer4.setBackgroundColor(Color.parseColor("#ff88ff"));
            check_answer = 2;
        }

        else if (gameCount == 5) {
            red.setText("ff");
            green.setText("ff");
            blue.setText("00");
            answer1.setBackgroundColor(Color.parseColor("#00ffff"));
            answer2.setBackgroundColor(Color.parseColor("#ffff00"));
            answer3.setBackgroundColor(Color.parseColor("#88ff00"));
            answer4.setBackgroundColor(Color.parseColor("#ff00ff"));
            check_answer = 2;
        }

        else if (gameCount == 6) {
            red.setText("ff");
            green.setText("00");
            blue.setText("00");
            answer1.setBackgroundColor(Color.parseColor("#ff0000"));
            answer2.setBackgroundColor(Color.parseColor("#ffffff"));
            answer3.setBackgroundColor(Color.parseColor("#ffff00"));
            answer4.setBackgroundColor(Color.parseColor("#ff00ff"));
            check_answer = 1;
        }

        else if (gameCount == 7) {
            red.setText("00");
            green.setText("ff");
            blue.setText("00");
            answer1.setBackgroundColor(Color.parseColor("#00ffff"));
            answer2.setBackgroundColor(Color.parseColor("#00ff00"));
            answer3.setBackgroundColor(Color.parseColor("#ffff00"));
            answer4.setBackgroundColor(Color.parseColor("#ff0088"));
            check_answer = 2;
        }

        else if (gameCount == 8) {
            red.setText("00");
            green.setText("00");
            blue.setText("ff");
            answer1.setBackgroundColor(Color.parseColor("#008888"));
            answer2.setBackgroundColor(Color.parseColor("#0000ff"));
            answer3.setBackgroundColor(Color.parseColor("#88ff00"));
            answer4.setBackgroundColor(Color.parseColor("#ff00ff"));
            check_answer = 2;
        }

        else if (gameCount == 9) {
            red.setText("88");
            green.setText("00");
            blue.setText("88");
            answer1.setBackgroundColor(Color.parseColor("#880088"));
            answer2.setBackgroundColor(Color.parseColor("#888888"));
            answer3.setBackgroundColor(Color.parseColor("#888800"));
            answer4.setBackgroundColor(Color.parseColor("#ff8888"));
            check_answer = 1;
        }

        else if (gameCount == 10) {
            red.setText("00");
            green.setText("88");
            blue.setText("88");
            answer1.setBackgroundColor(Color.parseColor("#8800ff"));
            answer2.setBackgroundColor(Color.parseColor("#ff88ff"));
            answer3.setBackgroundColor(Color.parseColor("#88ff00"));
            answer4.setBackgroundColor(Color.parseColor("#008888"));
            check_answer = 4;
        }
    }







    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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


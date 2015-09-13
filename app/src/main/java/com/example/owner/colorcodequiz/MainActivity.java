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

import com.astuetz.PagerSlidingTabStrip;




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
    private boolean nextquestion;



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
            checkprogress();
        }else {
            setanswer();
            nextquestion = false;
        }
    }


    public void select2(View view) {
        if (!nextquestion) {
            if (check_answer == 2) {
                check_select2.setImageResource(R.drawable.maru);
                noca = noca +1;
            } else {
                check_select2.setImageResource(R.drawable.batu);
            }
           checkprogress();
        }else {
            setanswer();
            nextquestion = false;
        }
    }

    public void select3(View view) {
        if (!nextquestion){
            if (check_answer == 3) {
                check_select3.setImageResource(R.drawable.maru);
                noca = noca +1;
            } else {
                check_select3.setImageResource(R.drawable.batu);
            }
        checkprogress();
        }else {
            setanswer();
            nextquestion = false;
        }
    }

    public void select4(View view) {
        if (!nextquestion)   {
            if (check_answer == 1) {
                check_select4.setImageResource(R.drawable.maru);
                noca = noca +1;
            } else {
                check_select4.setImageResource(R.drawable.batu);
            }
        checkprogress();
        }else {
            setanswer();
            nextquestion = false;
            check_select4.setImageDrawable(null);
        }
    }

    private void checkprogress(){
        if (gameCount <= 10) {
            progress.setText("Progress:" + gameCount + "/10");
        }
        nextquestion = true;
        if(gameCount >= 10){
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Menuに戻ります。")
                    .setMessage("10問中"+noca+"問正解しました。")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // OK button pressed
                            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                            startActivity(intent);
                        }
                    }).show();
        }
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


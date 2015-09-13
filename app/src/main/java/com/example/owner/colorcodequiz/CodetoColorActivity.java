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
import android.widget.TextView;

import java.util.Random;

public class CodetoColorActivity extends AppCompatActivity {
    private TextView progress;
    private TextView questioncode;

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
    private int noq;
    private int noca;
    private int maxlimit;
    private int minlimit;

    private boolean nextquestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codeto_color);

        gameCount = 1;
        answer1 = (TextView) findViewById(R.id.answer1);
        answer2 = (TextView) findViewById(R.id.answer2);
        answer3 = (TextView) findViewById(R.id.answer3);
        answer4 = (TextView) findViewById(R.id.answer4);
        questioncode = (TextView)findViewById(R.id.questioncode);

        progress =(TextView)findViewById(R.id.progress);

        check_select1 = (ImageView)findViewById(R.id.check_select1);
        check_select2 = (ImageView)findViewById(R.id.check_select2);
        check_select3 = (ImageView)findViewById(R.id.check_select3);
        check_select4 = (ImageView)findViewById(R.id.check_select4);

        Intent intent = getIntent();
        noq  = intent.getIntExtra("getnumber",0);
        //Prepare:addLevel
        maxlimit = intent.getIntExtra("getnumber",255);
        minlimit = intent.getIntExtra("getnumber",0);

        setanswer();
    }

    public void select1(View view) {
        if (!nextquestion)   {
            if (check_answer == 1) {
                check_select1.setImageResource(R.drawable.maru);
            } else {
                check_select1.setImageResource(R.drawable.batu);
                noca = noca+1;
            }
            if (gameCount <= noq) {
                gameCount = gameCount + 1;
                progress.setText("Progress:" + gameCount + "/"+ noq);
                nextquestion = true;
            }if(gameCount >= noq){
                new AlertDialog.Builder(CodetoColorActivity.this)
                        .setTitle("Menuに戻ります。")
                        .setMessage(noq+"問中"+noca+"問正解しました。")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // OK button pressed
                                Intent intent = new Intent(CodetoColorActivity.this, MenuActivity.class);
                                startActivity(intent);
                            }
                        }).show();
            }
        }else {
            setanswer();
            nextquestion = false;
        }
    }

    public void select2(View view) {
        if (!nextquestion) {
            if (check_answer == 2) {
                check_select1.setImageDrawable(null);
                check_select2.setImageResource(R.drawable.maru);
                check_select3.setImageDrawable(null);
                check_select4.setImageDrawable(null);
            } else {
                check_select2.setImageResource(R.drawable.batu);
            }
            gameCount = gameCount + 1;
            if (gameCount <= noq) {
                progress.setText("Progress:" + gameCount + "/"+noq);
                nextquestion = true;
            }
            if(gameCount>= noq){
                new AlertDialog.Builder(CodetoColorActivity.this)
                        .setTitle("Menuに戻ります。")
                        .setMessage(noq+"問中"+noca+"問正解しました。")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // OK button pressed
                                Intent intent = new Intent(CodetoColorActivity.this, MenuActivity.class);
                                startActivity(intent);
                            }
                        }).show();
            }
        }else {
            setanswer();
            nextquestion = false;
        }
    }

    public void select3(View view) {
        if (!nextquestion){
            if (check_answer == 3) {
                check_select3.setImageResource(R.drawable.maru);
            } else {
                check_select3.setImageResource(R.drawable.batu);
            }
            gameCount = gameCount + 1;
            nextquestion = true;
            if (gameCount <= noq) {
                progress.setText("Progress:" + gameCount + "/"+noq);
            }
            if(gameCount >= noq) {
                new AlertDialog.Builder(CodetoColorActivity.this)
                        .setTitle("Menuに戻ります。")
                        .setMessage(noq+"問中"+noca+"問正解しました。")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // OK button pressed
                                Intent intent = new Intent(CodetoColorActivity.this, MenuActivity.class);
                                startActivity(intent);
                            }
                        }).show();

            }
        }else {
            setanswer();
            nextquestion = false;
        }
    }

    public void select4(View view) {
        if (!nextquestion)   {
            if (check_answer == 4) {
                check_select4.setImageResource(R.drawable.maru);
            } else {
                check_select4.setImageResource(R.drawable.batu);
            }
            gameCount = gameCount + 1;
            if (gameCount <= noq) {
                progress.setText("Progress:" + gameCount + "/"+ noq);
                nextquestion = true;
            }if (gameCount>= noq){
                new AlertDialog.Builder(CodetoColorActivity.this)
                        .setTitle("Menuに戻ります。")
                        .setMessage(noq+"問中"+noca+"問正解しました。")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // OK button pressed
                                Intent intent = new Intent(CodetoColorActivity.this, MenuActivity.class);
                                startActivity(intent);
                            }
                        }).show();
            }
        }else {
            setanswer();
            nextquestion = false;
        }
    }

    public void setanswer() {
        //createQuesionCode
        Random rnd1 = new Random();
        int r = rnd1.nextInt(256);
        Random rnd2 = new Random();
        int g = rnd1.nextInt(256);
        Random rnd3 = new Random();
        int b = rnd3.nextInt(256);

        int r_a1,r_a2,r_a3,g_a1,g_a2,g_a3,b_a1,b_a2,b_a3;

        //setQuestionCode
        Random rnd4 = new Random();
        check_answer = rnd4.nextInt(3) + 1;
        String r16 = Integer.toHexString(r);
        if ( r16.length() < 2) r16 = "0" + r16;
        String g16 = Integer.toHexString(g);
        if ( g16.length() < 2) g16 = "0" + g16;
        String b16 = Integer.toHexString(b);
        if ( b16.length() < 2) b16 = "0" + b16;
        questioncode.setText("#"+r16+g16+b16);


        //createChoicesColorcode
        while (true) {

            Random rnd5 = new Random();
            r_a1 = rnd5.nextInt(256);
            Random rnd6 = new Random();
            r_a2 = rnd6.nextInt(256);
            Random rnd7 = new Random();
            r_a3 = rnd7.nextInt(256);

            Random rnd8 = new Random();
            g_a1 = rnd8.nextInt(256);
            Random rnd9 = new Random();
            g_a2 = rnd9.nextInt(256);
            Random rnd10 = new Random();
            g_a3 = rnd10.nextInt(256);

            Random rnd11 = new Random();
            b_a1 = rnd11.nextInt(256);
            Random rnd12 = new Random();
            b_a2 = rnd12.nextInt(256);
            Random rnd13 = new Random();
            b_a3 = rnd13.nextInt(256);


            int abs_r1_2 = Math.abs(r_a1 - r_a2);
            int abs_r2_3 = Math.abs(r_a2 - r_a3);
            int abs_r3_1 = Math.abs(r_a3 - r_a1);
            int abs_r_1  = Math.abs(r - r_a1);
            int abs_r_2  = Math.abs(r - r_a2);
            int abs_r_3  = Math.abs(r - r_a3);

            int abs_g1_2 = Math.abs(g_a1 - g_a2);
            int abs_g2_3 = Math.abs(g_a2 - g_a3);
            int abs_g3_1 = Math.abs(g_a3 - g_a1);
            int abs_g_1  = Math.abs(g - g_a1);
            int abs_g_2  = Math.abs(g - g_a2);
            int abs_g_3  = Math.abs(g - g_a3);

            int abs_b1_2 = Math.abs(b_a1 - b_a2);
            int abs_b2_3 = Math.abs(b_a2 - b_a3);
            int abs_b3_1 = Math.abs(b_a3 - b_a1);
            int abs_b_1  = Math.abs(b - b_a1);
            int abs_b_2  = Math.abs(b - b_a2);
            int abs_b_3  = Math.abs(b - b_a3);

             //ｒ,g,bのいずれかがほかの選択肢及び正解とminlimitからmaxlimitの範囲で離れていたらbreak
            if ((maxlimit>=abs_r_1)&&(minlimit<=abs_r_1 )||(maxlimit>=abs_g_1)&&(minlimit<=abs_b_1 )||((maxlimit>=abs_b_1)&&(minlimit<=abs_b_1 ))) {
                if ((maxlimit >= abs_r_2) && (minlimit <= abs_r_2) || (maxlimit >= abs_g_2) && (minlimit <= abs_b_2) || ((maxlimit >= abs_b_2) && (minlimit <= abs_b_2))) {
                    if ((maxlimit >= abs_r_3) && (minlimit <= abs_r_3) || (maxlimit >= abs_g_3) && (minlimit <= abs_b_3) || ((maxlimit >= abs_b_3) && (minlimit <= abs_b_3))) {
                        if ((maxlimit >= abs_r1_2) && (minlimit <= abs_r1_2) || (maxlimit >= abs_g1_2) && (minlimit <= abs_b1_2) || ((maxlimit >= abs_b1_2) && (minlimit <= abs_b1_2))) {
                            if ((maxlimit >= abs_r2_3) && (minlimit <= abs_r2_3) || (maxlimit >= abs_g2_3) && (minlimit <= abs_b2_3) || ((maxlimit >= abs_b2_3) && (minlimit <= abs_b2_3))) {
                                if ((maxlimit >= abs_r3_1) && (minlimit <= abs_r3_1) || (maxlimit >= abs_g3_1) && (minlimit <= abs_b3_1) || ((maxlimit >= abs_b3_1) && (minlimit <= abs_b3_1))) {
                                    break;
                                }
                            }
                        }
                    }
                }

            }
        }

        //cleanCheckselect
        check_select1.setImageDrawable(null);
        check_select2.setImageDrawable(null);
        check_select3.setImageDrawable(null);
        check_select4.setImageDrawable(null);

        // setanswer
        switch (check_answer) {
            case 1:
                answer1.setBackgroundColor(Color.rgb(r, g, b));
                answer2.setBackgroundColor(Color.rgb(r_a1, g_a1, b_a1));
                answer3.setBackgroundColor(Color.rgb(r_a2, g_a2, b_a2));
                answer4.setBackgroundColor(Color.rgb(r_a3, g_a3, b_a3));
                break;
            case 2:
                answer1.setBackgroundColor(Color.rgb(r_a1, g_a1, b_a1));
                answer2.setBackgroundColor(Color.rgb(r, g, b));
                answer3.setBackgroundColor(Color.rgb(r_a2, g_a2, b_a2));
                answer4.setBackgroundColor(Color.rgb(r_a3, g_a3, b_a3));
                break;
            case 3:
                answer1.setBackgroundColor(Color.rgb(r_a1, g_a1, b_a1));
                answer2.setBackgroundColor(Color.rgb(r_a2, g_a2, b_a2));
                answer3.setBackgroundColor(Color.rgb(r, g, b));
                answer4.setBackgroundColor(Color.rgb(r_a3, g_a3, b_a3));
                break;
            case 4:
                answer1.setBackgroundColor(Color.rgb(r_a1, g_a1, b_a1));
                answer2.setBackgroundColor(Color.rgb(r_a2, g_a2, b_a2));
                answer3.setBackgroundColor(Color.rgb(r_a3, g_a3, b_a3));
                answer4.setBackgroundColor(Color.rgb(r, g, b));
                break;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_codeto_color, menu);
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

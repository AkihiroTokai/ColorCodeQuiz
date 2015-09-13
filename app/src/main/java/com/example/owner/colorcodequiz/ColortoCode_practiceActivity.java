package com.example.owner.colorcodequiz;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ColortoCode_practiceActivity extends AppCompatActivity {

    private TextView progress;
    private TextView red;
    private TextView green;
    private TextView blue;

    private TextView answer1;
    private TextView answer2;
    private TextView answer3;
    private TextView answer4;

    private ImageView question;
    private ImageView check_select1;
    private ImageView check_select2;
    private ImageView check_select3;
    private ImageView check_select4;

    private int gameCount;
    private int check_answer;
    private int noca;

    private boolean nextquestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colorto_code_practice);
        check_answer = 1;
        gameCount = 1;
        answer1 = (TextView) findViewById(R.id.answer1);
        answer2 = (TextView) findViewById(R.id.answer2);
        answer3 = (TextView) findViewById(R.id.answer3);
        answer4 = (TextView) findViewById(R.id.answer4);

        progress = (TextView) findViewById(R.id.progress);
        red = (TextView) findViewById(R.id.red);
        green = (TextView) findViewById(R.id.green);
        blue = (TextView) findViewById(R.id.blue);

        check_select1 = (ImageView) findViewById(R.id.check_select1);
        check_select2 = (ImageView) findViewById(R.id.check_select2);
        check_select3 = (ImageView) findViewById(R.id.check_select3);
        check_select4 = (ImageView) findViewById(R.id.check_select4);
        question = (ImageView) findViewById(R.id.questioncode);

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
        } else {
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
            checkprogress();
        } else {
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
        checkprogress();
        } else {
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
            checkprogress();
        } else {
            setanswer();
            nextquestion = false;
        }
    }

    public void setanswer() {
        //cleanCheck_select
        check_select1.setImageDrawable(null);
        check_select2.setImageDrawable(null);
        check_select3.setImageDrawable(null);
        check_select4.setImageDrawable(null);

        if (gameCount == 1) {
            //setQuestionImage
            Bitmap bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);

            Canvas canvas;
            canvas = new Canvas(bitmap);
            canvas.drawColor(Color.parseColor("#000000"));

            question.setImageBitmap(bitmap);
            //setChoices
            answer1.setText("#000000");
            answer2.setText("#ffff00");
            answer3.setText("#ff00ff");
            answer4.setText("#ffffff");
            check_answer = 1;
        }

        else if (gameCount == 2) {
            //setQuestionImage
            Bitmap bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);

            Canvas canvas;
            canvas = new Canvas(bitmap);
            canvas.drawColor(Color.parseColor("#ffffff"));

            question.setImageBitmap(bitmap);
            //setChoices
            answer1.setText("#000000");
            answer2.setText("#ffffff");
            answer3.setText("#ffff00");
            answer4.setText("#ff00ff");
            check_answer = 2;
        }

        else if (gameCount == 3) {
            //setQuestionImage
            Bitmap bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);

            Canvas canvas;
            canvas = new Canvas(bitmap);
            canvas.drawColor(Color.parseColor("#00ffff"));

            question.setImageBitmap(bitmap);
            //setChoices
            answer1.setText("#0088ff");
            answer2.setText("#00ffff");
            answer3.setText("#ffff00");
            answer4.setText("#ff00ff");
            check_answer = 2;
        }

        else if (gameCount == 4) {
            //setQuestionImage
            Bitmap bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);

            Canvas canvas;
            canvas = new Canvas(bitmap);
            canvas.drawColor(Color.parseColor("#ff00ff"));

            question.setImageBitmap(bitmap);
            //setChoices
            answer1.setText("#ff88ff");
            answer2.setText("#00ffff");
            answer3.setText("#ffff00");
            answer4.setText("#ff00ff");
            check_answer = 4;
        }

        else if (gameCount == 5) {
            //setQuestionImage
            Bitmap bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);

            Canvas canvas;
            canvas = new Canvas(bitmap);
            canvas.drawColor(Color.parseColor("#ffff00"));

            question.setImageBitmap(bitmap);
            //setChoices
            answer1.setText("#ffff00");
            answer2.setText("#00ffff");
            answer3.setText("#ffff88");
            answer4.setText("#ff00ff");
            check_answer = 1;
        }

        else if (gameCount == 6) {
            //setQuestionImage
            Bitmap bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);

            Canvas canvas;
            canvas = new Canvas(bitmap);
            canvas.drawColor(Color.parseColor("#00ffff"));

            question.setImageBitmap(bitmap);
            //setChoices
            answer1.setText("#00ff00");
            answer2.setText("#880000");
            answer3.setText("#00ffff");
            answer4.setText("#ff00ff");
            check_answer = 3;
        }

        else if (gameCount == 7) {
            //setQuestionImage
            Bitmap bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);

            Canvas canvas;
            canvas = new Canvas(bitmap);
            canvas.drawColor(Color.parseColor("#00ffff"));

            question.setImageBitmap(bitmap);
            //setChoices
            answer1.setText("#ff0000");
            answer2.setText("#ff0088");
            answer3.setText("#ffff00");
            answer4.setText("#00ffff");
            check_answer = 4;
        }

        else if (gameCount == 8) {
            //setQuestionImage
            Bitmap bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);

            Canvas canvas;
            canvas = new Canvas(bitmap);
            canvas.drawColor(Color.parseColor("#00ff00"));

            question.setImageBitmap(bitmap);
            //setChoices
            answer1.setText("#ff0000");
            answer2.setText("#00ffff");
            answer3.setText("#ffff88");
            answer4.setText("#00ff00");
            check_answer = 4;
        }

        else if (gameCount == 9) {
            //setQuestionImage
            Bitmap bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);

            Canvas canvas;
            canvas = new Canvas(bitmap);
            canvas.drawColor(Color.parseColor("#880088"));

            question.setImageBitmap(bitmap);
            //setChoices
            answer1.setText("#008800");
            answer2.setText("#008888");
            answer3.setText("#000088");
            answer4.setText("#880088");

            check_answer = 4;
        }

        else if (gameCount == 10) {
            //setQuestionImage
            Bitmap bitmap = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);

            Canvas canvas;
            canvas = new Canvas(bitmap);
            canvas.drawColor(Color.parseColor("#008888"));

            question.setImageBitmap(bitmap);
            //setChoices
            answer1.setText("#008800");
            answer2.setText("#008888");
            answer3.setText("#000088");
            answer4.setText("#880000");

            check_answer = 2;
        }

    }

public void checkprogress() {
        gameCount = gameCount + 1;
        if (gameCount <= 10) {
            progress.setText("Progress:" + gameCount + "/10");
        }
        nextquestion = true;
        if (gameCount >= 10) {
            new AlertDialog.Builder(ColortoCode_practiceActivity.this)
                    .setTitle("Menuに戻ります。")
                    .setMessage("10問中"+noca+"問正解しました。")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // OK button pressed
                            Intent intent = new Intent(ColortoCode_practiceActivity.this, MenuActivity.class);
                            startActivity(intent);
                        }
                    }).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.colorto_code_practice, menu);
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

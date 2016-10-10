/**
 * Created by schif_000 on 5/10/2016.
 */

package com.erica.got_quiz;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.List;


public class QuizActivity extends Activity {

    public static final String filename = "LEVEL_DATA";
    SharedPreferences levelData;
    List<Question> questionsList;
    int score, round, ID, thisLevel, passedLevels;
    Question currentQuestion;
    TextView txtQuestion, scored, rounds;
    Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        levelData = getSharedPreferences(filename, 0);
        thisLevel = levelData.getInt("currentLevel", 0);
        passedLevels = levelData.getInt("unlockedLevels", 0);

        if(thisLevel == 1){
            ID = 0;
        }
        if(thisLevel == 2){
            ID = 18;
        }
        if(thisLevel == 3){
            ID = 38;
        }
        if(thisLevel == 4){
            ID = 57;
        }
        if(thisLevel == 5){
            ID = 76;
        }
        if(thisLevel == 6){
            ID = 95;
        }
        if(thisLevel == 7){
            ID = 114;
        }

        TextView textLevel = (TextView) findViewById(R.id.textLevel);
        textLevel.setText("Level: " + thisLevel); //if used without text use: textLevel.setText(String.valueOf(thisLevel));

        TextView passed = (TextView) findViewById(R.id.textPast);
        passed.setText("Passed Levels: " + passedLevels);

        //Initialize the database
        final DbHelper dbHelper=new DbHelper(this);
        questionsList= dbHelper.getAllQuestions();
        currentQuestion=questionsList.get(ID);

        txtQuestion = (TextView) findViewById(R.id.questionText);

        btn1 = (Button) findViewById(R.id.ans1);
        btn2 = (Button) findViewById(R.id.ans2);
        btn3 = (Button) findViewById(R.id.ans3);
        btn4 = (Button) findViewById(R.id.ans4);

        scored = (TextView) findViewById(R.id.score); //the score
        rounds = (TextView) findViewById(R.id.round); //the number of rounds

        //Set question
        setQuestionView();

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                getAnswer(btn1.getText().toString());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                getAnswer(btn2.getText().toString());
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                getAnswer(btn3.getText().toString());
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                getAnswer(btn4.getText().toString());
            }
        });

        resetButtonColour();

    }


    private void getAnswer(String Answer) {
        if(currentQuestion.getAnswer().equals(Answer)){
            setGreen();
            score++;
            scored.setText(String.valueOf(score));
        } else {
            setRed();
        }

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(round<7){
                    currentQuestion=questionsList.get(ID);
                    resetButtonColour();
                    setQuestionView();
                }else{
                    Intent intent = new Intent(QuizActivity.this, ResultActivity.class);
                    Bundle b = new Bundle();
                    b.putInt("score", score); //Your score
                    intent.putExtras(b); //Put your score to your next Intent
                    startActivity(intent);
                    finish();
                }
            }
        }, 500);
    }

    public void resetButtonColour() {
        btn1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        btn1.setTextColor(getResources().getColor(R.color.darkgrey));
        btn1.setEnabled(true);
        btn2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        btn2.setTextColor(getResources().getColor(R.color.darkgrey));
        btn2.setEnabled(true);
        btn3.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        btn3.setTextColor(getResources().getColor(R.color.darkgrey));
        btn3.setEnabled(true);
        btn4.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        btn4.setTextColor(getResources().getColor(R.color.darkgrey));
        btn4.setEnabled(true);
    }

    private void setGreen() {
        if(btn1.isPressed()){
            btn1.setBackgroundColor(getResources().getColor(R.color.green));
            btn1.setTextColor(getResources().getColor(R.color.white));
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
        }
        if(btn2.isPressed()) {
            btn2.setBackgroundColor(getResources().getColor(R.color.green));
            btn2.setTextColor(getResources().getColor(R.color.white));
            btn1.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
        }
        if(btn3.isPressed()){
            btn3.setBackgroundColor(getResources().getColor(R.color.green));
            btn3.setTextColor(getResources().getColor(R.color.white));
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn4.setEnabled(false);
        }
        if(btn4.isPressed()) {
            btn4.setBackgroundColor(getResources().getColor(R.color.green));
            btn4.setTextColor(getResources().getColor(R.color.white));
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
        }
    };

    private void setRed() {
        if(btn1.isPressed()){
            btn1.setBackgroundColor(getResources().getColor(R.color.red));
            btn1.setTextColor(getResources().getColor(R.color.white));
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
        }
        if(btn2.isPressed()) {
            btn2.setBackgroundColor(getResources().getColor(R.color.red));
            btn2.setTextColor(getResources().getColor(R.color.white));
            btn1.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
        }
        if(btn3.isPressed()){
            btn3.setBackgroundColor(getResources().getColor(R.color.red));
            btn3.setTextColor(getResources().getColor(R.color.white));
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn4.setEnabled(false);
        }
        if(btn4.isPressed()) {
            btn4.setBackgroundColor(getResources().getColor(R.color.red));
            btn4.setTextColor(getResources().getColor(R.color.white));
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
        }
    }


    private void setQuestionView() {
        txtQuestion.setText(currentQuestion.getQuestion());
        btn1.setText(currentQuestion.getOption1());
        btn2.setText(currentQuestion.getOption2());
        btn3.setText(currentQuestion.getOption3());
        btn4.setText(currentQuestion.getOption4());

        round++;
        rounds.setText(String.valueOf(round));

        if(thisLevel == 1){
            if (round == 1){
                ID = (int)(Math.random()* 3)+1;
            }
            if (round == 2){
                ID = (int)(Math.random()* 3)+3;
            }
            if (round == 3){
                ID = (int)(Math.random()* 3)+6;
            }
            if (round == 4){
                ID = (int)(Math.random()* 3)+9;
            }
            if (round == 5){
                ID = (int)(Math.random()* 3)+12;
            }
            if (round == 6){
                ID = (int)(Math.random()* 3)+15;
            }
        }

        if(thisLevel == 2){
            if (round == 1){
                ID = (int)(Math.random()* 3)+19;
            }
            if (round == 2){
                ID = (int)(Math.random()* 3)+22;
            }
            if (round == 3){
                ID = (int)(Math.random()* 3)+25;
            }
            if (round == 4){
                ID = (int)(Math.random()* 3)+28;
            }
            if (round == 5){
                ID = (int)(Math.random()* 3)+31;
            }
            if (round == 6){
                ID = (int)(Math.random()* 3)+34;
            }
        }

        if(thisLevel == 3){
            if (round == 1){
                ID = (int)(Math.random()* 3)+39;
            }
            if (round == 2){
                ID = (int)(Math.random()* 3)+42;
            }
            if (round == 3){
                ID = (int)(Math.random()* 3)+45;
            }
            if (round == 4){
                ID = (int)(Math.random()* 3)+48;
            }
            if (round == 5){
                ID = (int)(Math.random()* 3)+51;
            }
            if (round == 6){
                ID = (int)(Math.random()* 3)+54;
            }
        }

        if(thisLevel == 4){
            if (round == 1){
                ID = (int)(Math.random()* 3)+58;
            }
            if (round == 2){
                ID = (int)(Math.random()* 3)+61;
            }
            if (round == 3){
                ID = (int)(Math.random()* 3)+64;
            }
            if (round == 4){
                ID = (int)(Math.random()* 3)+67;
            }
            if (round == 5){
                ID = (int)(Math.random()* 3)+70;
            }
            if (round == 6){
                ID = (int)(Math.random()* 3)+73;
            }
        }

        if(thisLevel == 5){
            if (round == 1){
                ID = (int)(Math.random()* 3)+77;
            }
            if (round == 2){
                ID = (int)(Math.random()* 3)+80;
            }
            if (round == 3){
                ID = (int)(Math.random()* 3)+83;
            }
            if (round == 4){
                ID = (int)(Math.random()* 3)+86;
            }
            if (round == 5){
                ID = (int)(Math.random()* 3)+89;
            }
            if (round == 6){
                ID = (int)(Math.random()* 3)+92;
            }
        }

        if(thisLevel == 6){
            if (round == 1){
                ID = (int)(Math.random()* 3)+96;
            }
            if (round == 2){
                ID = (int)(Math.random()* 3)+99;
            }
            if (round == 3){
                ID = (int)(Math.random()* 3)+102;
            }
            if (round == 4){
                ID = (int)(Math.random()* 3)+105;
            }
            if (round == 5){
                ID = (int)(Math.random()* 3)+108;
            }
            if (round == 6){
                ID = (int)(Math.random()* 3)+111;
            }
        }

        if(thisLevel == 7){
            if (round == 1){
                ID = (int)(Math.random()* 3)+113;
            }
            if (round == 2){
                ID = (int)(Math.random()* 3)+116;
            }
            if (round == 3){
                ID = (int)(Math.random()* 3)+119;
            }
            if (round == 4){
                ID = (int)(Math.random()* 3)+123;
            }
            if (round == 5){
                ID = (int)(Math.random()* 3)+126;
            }
            if (round == 6){
                ID = (int)(Math.random()* 3)+129;
            }
        }
    }
}

package com.erica.got_quiz;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageButton;

/**
 * Created by schif_000 on 5/10/2016.
 */
public class LevelActivity extends Activity {

    public static final String filename = "LEVEL_DATA";
    SharedPreferences levelData;
    // int level;
    Button levelOne,levelTwo, levelThree, levelFour, levelFive, levelSix, levelSeven;
    int thisLevel, passedLevels;
    ImageButton clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);

        levelData = getSharedPreferences(filename, 0);
        thisLevel = levelData.getInt("currentLevel", 0);
        passedLevels = levelData.getInt("unlockedLevels", 0);




        levelOne = (Button) findViewById(R.id.L1Button);
        levelOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LevelActivity.this, QuizActivity.class);
                Bundle intent2 = new Bundle();
                //intent2.putInt("level", level); //Your score
                intent.putExtras(intent2); //Put your score to your next Intent
                startActivity(intent);
                finish();
                SharedPreferences.Editor editor = levelData.edit();
                editor.putInt("currentLevel", 1);

                editor.commit();
            }
        });

        levelTwo = (Button) findViewById(R.id.L2Button);
        levelTwo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LevelActivity.this, QuizActivity.class);
                Bundle intent2 = new Bundle();
                //intent2.putInt("level", level); //Your score
                intent.putExtras(intent2); //Put your score to your next Intent
                startActivity(intent);
                finish();

                SharedPreferences.Editor editor = levelData.edit();
                editor.putInt("currentLevel", 2);
                editor.putInt("unlocked", passedLevels);
                editor.commit();
            }
        });

        levelThree = (Button) findViewById(R.id.L3Button);
        levelThree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LevelActivity.this, QuizActivity.class);
                Bundle intent2 = new Bundle();
                //intent2.putInt("level", level); //Your score
                intent.putExtras(intent2); //Put your score to your next Intent
                startActivity(intent);
                finish();

                SharedPreferences.Editor editor = levelData.edit();
                editor.putInt("currentLevel", 3);
                editor.putInt("unlocked", passedLevels);
                editor.commit();
            }
        });

        levelFour = (Button) findViewById(R.id.L4Button);
        levelFour.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LevelActivity.this, QuizActivity.class);
                Bundle intent2 = new Bundle();
                //intent2.putInt("level", level); //Your score
                intent.putExtras(intent2); //Put your score to your next Intent
                startActivity(intent);
                finish();

                SharedPreferences.Editor editor = levelData.edit();
                editor.putInt("currentLevel", 4);
                editor.putInt("unlocked", passedLevels);
                editor.commit();
            }
        });

        levelFive = (Button) findViewById(R.id.L5Button);
        levelFive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LevelActivity.this, QuizActivity.class);
                Bundle intent2 = new Bundle();
                //intent2.putInt("level", level); //Your score
                intent.putExtras(intent2); //Put your score to your next Intent
                startActivity(intent);
                finish();

                SharedPreferences.Editor editor = levelData.edit();
                editor.putInt("currentLevel", 5);
                editor.putInt("unlocked", passedLevels);
                editor.commit();
            }
        });

        levelSix = (Button) findViewById(R.id.L6Button);
        levelSix.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LevelActivity.this, QuizActivity.class);
                Bundle intent2 = new Bundle();
                //intent2.putInt("level", level); //Your score
                intent.putExtras(intent2); //Put your score to your next Intent
                startActivity(intent);
                finish();

                SharedPreferences.Editor editor = levelData.edit();
                editor.putInt("currentLevel", 6);
                editor.putInt("unlocked", passedLevels);
                editor.commit();
            }
        });

        levelSeven = (Button) findViewById(R.id.L7Button);
        levelSeven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LevelActivity.this, QuizActivity.class);
                Bundle intent2 = new Bundle();
                intent.putExtras(intent2); //Put your score to your next Intent
                startActivity(intent);
                finish();

                SharedPreferences.Editor editor = levelData.edit();
                editor.putInt("currentLevel", 7);
                editor.putInt("unlocked", passedLevels);
                editor.commit();
            }
        });

        clear = (ImageButton) findViewById(R.id.clearButton);
        clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LevelActivity.this, MainActivity.class);
                startActivity(intent);
                finish();

                SharedPreferences.Editor editor = levelData.edit();
                editor.clear();
                editor.commit();
            }
        });

        if(passedLevels == 0){
            levelTwo.setEnabled(false);
            levelTwo.setBackground(getResources().getDrawable(R.drawable.lockbutton));
            levelTwo.setText("");
            levelThree.setEnabled(false);
            levelThree.setBackground(getResources().getDrawable(R.drawable.lockbutton));
            levelThree.setText("");
            levelFour.setEnabled(false);
            levelFour.setBackground(getResources().getDrawable(R.drawable.lockbutton));
            levelFour.setText("");
            levelFive.setEnabled(false);
            levelFive.setBackground(getResources().getDrawable(R.drawable.lockbutton));
            levelFive.setText("");
            levelSix.setEnabled(false);
            levelSix.setBackground(getResources().getDrawable(R.drawable.lockbutton));
            levelSix.setText("");
            levelSeven.setEnabled(false);
            levelSeven.setBackground(getResources().getDrawable(R.drawable.lockbutton));
            levelSeven.setText("");
        }
        if(passedLevels == 1){
            levelThree.setEnabled(false);
            levelThree.setBackground(getResources().getDrawable(R.drawable.lockbutton));
            levelThree.setText("");
            levelFour.setEnabled(false);
            levelFour.setBackground(getResources().getDrawable(R.drawable.lockbutton));
            levelFour.setText("");
            levelFive.setEnabled(false);
            levelFive.setBackground(getResources().getDrawable(R.drawable.lockbutton));
            levelFive.setText("");
            levelSix.setEnabled(false);
            levelSix.setBackground(getResources().getDrawable(R.drawable.lockbutton));
            levelSix.setText("");
            levelSeven.setEnabled(false);
            levelSeven.setBackground(getResources().getDrawable(R.drawable.lockbutton));
            levelSeven.setText("");
        }
        if(passedLevels == 2){
            levelFour.setEnabled(false);
            levelFour.setBackground(getResources().getDrawable(R.drawable.lockbutton));
            levelFour.setText("");
            levelFive.setEnabled(false);
            levelFive.setBackground(getResources().getDrawable(R.drawable.lockbutton));
            levelFive.setText("");
            levelSix.setEnabled(false);
            levelSix.setBackground(getResources().getDrawable(R.drawable.lockbutton));
            levelSix.setText("");
            levelSeven.setEnabled(false);
            levelSeven.setBackground(getResources().getDrawable(R.drawable.lockbutton));
            levelSeven.setText("");
        }
        if(passedLevels == 3){
            levelFive.setEnabled(false);
            levelFive.setBackground(getResources().getDrawable(R.drawable.lockbutton));
            levelFive.setText("");
            levelSix.setEnabled(false);
            levelSix.setBackground(getResources().getDrawable(R.drawable.lockbutton));
            levelSix.setText("");
            levelSeven.setEnabled(false);
            levelSeven.setBackground(getResources().getDrawable(R.drawable.lockbutton));
            levelSeven.setText("");
        }
        if(passedLevels == 4){
            levelSix.setEnabled(false);
            levelSix.setBackground(getResources().getDrawable(R.drawable.lockbutton));
            levelSix.setText("");
            levelSeven.setEnabled(false);
            levelSeven.setBackground(getResources().getDrawable(R.drawable.lockbutton));
            levelSeven.setText("");
        }
        if(passedLevels == 5){
            levelSeven.setEnabled(false);
            levelSeven.setBackground(getResources().getDrawable(R.drawable.lockbutton));
            levelSeven.setText("");
        }
    }


}

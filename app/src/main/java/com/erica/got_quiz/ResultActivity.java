package com.erica.got_quiz;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by schif_000 on 5/10/2016.
 */
public class ResultActivity extends Activity {

    public static final String filename = "LEVEL_DATA";
    SharedPreferences levelData;

    Button nextLevel;
    Button restart;
    // Button exitButton;
    //Button homeButton;
    int level;
    int thisLevel;
    int passedLevels;
    TextView endGame;

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView textResult = (TextView) findViewById(R.id.textResult);

        levelData = getSharedPreferences(filename, 0);
        thisLevel = levelData.getInt("currentLevel", 0);
        passedLevels = levelData.getInt("unlockedLevels", 0);


        Bundle b = getIntent().getExtras();
        int score = b.getInt("score");
        level = b.getInt("level");
        textResult.setText("Your score is " + score + "/7");
        level++;

        if (score == 7 && passedLevels < thisLevel && passedLevels <= 7) {
            passedLevels++;
            SharedPreferences.Editor editor = levelData.edit();
            // editor.putInt("currentLevel", thisLevel);
            editor.putInt("unlockedLevels", passedLevels);
            editor.commit();
        }

        if (score == 7) {
            nextLevel = (Button) findViewById(R.id.btn2);
            nextLevel.setVisibility(View.VISIBLE);
            restart = (Button) findViewById(R.id.btn);

            if (thisLevel <= 7) {
                thisLevel++;
            }

            SharedPreferences.Editor editor = levelData.edit();
            editor.putInt("currentLevel", thisLevel);
            // editor.putInt("unlockedLevels", passedLevels);
            editor.commit();
        }


        if (thisLevel == 8) {
            nextLevel.setVisibility(View.GONE);
            endGame = (TextView) findViewById(R.id.endGameText);
            endGame.setVisibility(View.VISIBLE);
        }

    }

    public void exitApp(View view) {
        finish();
        System.exit(0);
    }

    public void returnHome(View view) {
        Intent i = new Intent(this, LevelActivity.class);
        startActivity(i);
    }


    public void nextLevel(View view) {

        Intent intent2 = new Intent(this, QuizActivity.class);
        Bundle b = new Bundle();
        // b.putInt("level", (level)); //Your score
        intent2.putExtras(b); //Put your score to your next Intent
        startActivity(intent2);
        finish();

    }

    public void restart(View view) {
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }

}
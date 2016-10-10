/**
 * Created by schif_000 on 5/10/2016.
 */

package com.erica.got_quiz;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;

public class ResultActivity extends Activity {

    public static final String filename = "LEVEL_DATA";
    SharedPreferences levelData;
    Button nextLevel, restart;
    int level, thisLevel, passedLevels;
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

        setSigil();

        if (score == 7 && passedLevels < thisLevel && passedLevels <= 7) {
            passedLevels++;
            SharedPreferences.Editor editor = levelData.edit();
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
            editor.commit();
        }

        if (thisLevel == 8) {
            nextLevel.setVisibility(View.GONE);
            endGame = (TextView) findViewById(R.id.endGameText);
            endGame.setVisibility(View.VISIBLE);
        }

    }

    public void setSigil() {

        ImageView sigil = (ImageView) findViewById(R.id.sigil);

        switch(thisLevel){
            case 1:
                thisLevel = 1;
                sigil.setImageResource(R.drawable.stark);
                break;
            case 2:
                thisLevel = 2;
                sigil.setImageResource(R.drawable.lannister);
                break;
            case 3:
                thisLevel = 3;
                sigil.setImageResource(R.drawable.baratheon);
                break;
            case 4:
                thisLevel = 4;
                sigil.setImageResource(R.drawable.arryn);
                break;
            case 5:
                thisLevel = 5;
                sigil.setImageResource(R.drawable.greyjoy);
                break;
            case 6:
                thisLevel = 6;
                sigil.setImageResource(R.drawable.targaryen);
                break;
            case 7:
                thisLevel = 7;
                sigil.setVisibility(View.GONE);
        }


    }

    public void returnHome(View view) {
        Intent i = new Intent(this, LevelActivity.class);
        startActivity(i);
    }

    public void nextLevel(View view) {
        Intent intent2 = new Intent(this, QuizActivity.class);
        Bundle b = new Bundle();
        intent2.putExtras(b);
        startActivity(intent2);
        finish();
    }

    public void restart(View view) {
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }



}
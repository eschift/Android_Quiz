package com.erica.got_quiz;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button start;
    int thisLevel;
    int passedLevels;
    public static final String filename = "LEVEL_DATA";
    SharedPreferences levelData;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        levelData = getSharedPreferences(filename, 0);
        thisLevel = levelData.getInt("currentLevel", 0);
        passedLevels = levelData.getInt("unlockedLevels", 0);

        start = (Button) findViewById(R.id.start);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LevelActivity.class);
                Bundle intent2 = new Bundle();
                //intent2.putInt("level", level); //Your score
                intent.putExtras(intent2); //Put your score to your next Intent
                startActivity(intent);
                finish();

                SharedPreferences.Editor editor = levelData.edit();
                editor.putInt("currentLevel", 1);
                editor.putInt("unlockedLevels", 0); // may need o set to passedLevels to persist between sessions
                editor.commit();
            }
        });
    }

}


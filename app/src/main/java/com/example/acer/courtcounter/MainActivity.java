package com.example.acer.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int displayForTeamA;
    int displayForTeamB;
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //get score team A
    public void TeamA3point (View view){
        scoreTeamA = scoreTeamA +3;
        displayForTeamA(scoreTeamA);
    }

    public void TeamA2point (View view){
        scoreTeamA = scoreTeamA +2;
        displayForTeamA(scoreTeamA);
    }

    public void TeamA1point (View view){
        scoreTeamA = scoreTeamA +1;
        displayForTeamA(scoreTeamA);
    }

    //get score team B


    //tampilan Score Team A
    public void teamB3point (View view){
        scoreTeamB = scoreTeamB +3;
        displayForTeamB(scoreTeamB);
    }

    public void teamB2point (View view){
        scoreTeamB = scoreTeamB +2;
        displayForTeamB(scoreTeamB);
    }

    public void teamB1point (View view){
        scoreTeamB = scoreTeamB +1;
        displayForTeamB(scoreTeamB);
    }
 //reset
    public void resetScore (View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    //tampilkan Score Team A
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.scoreTeamA);
        scoreView.setText(String.valueOf(score));
    }
    //tampilkan Score Team B
    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.scoreTeamB);
        scoreView.setText(String.valueOf(score));
    }

}

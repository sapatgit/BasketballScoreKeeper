package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //sets default score
    int scroreTeamA = 0;
    //sets default score
    int scroreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scroreTeamA);
        displayForTeamB(scroreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Updates the given score for Team A by 3.
     */
    public void threePtsForTeamA(View view) {
        scroreTeamA += 3;
        displayForTeamA(scroreTeamA);
    }

    /**
     * Updates the given score for Team A by 2.
     */
    public void twoPtsForTeamA(View view) {
        scroreTeamA += 2;
        displayForTeamA(scroreTeamA);
    }

    /**
     * Updates the given score for Team A by 3.
     */
    public void onePtForTeamA(View view) {
        scroreTeamA += 1;
        displayForTeamA(scroreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Updates the given score for Team A by 3.
     */
    public void threePtsForTeamB(View view) {
        scroreTeamB += 3;
        displayForTeamB(scroreTeamB);
    }

    /**
     * Updates the given score for Team A by 2.
     */
    public void twoPtsForTeamB(View view) {
        scroreTeamB += 2;
        displayForTeamB(scroreTeamB);
    }

    /**
     * Updates the given score for Team A by 3.
     */
    public void onePtForTeamB(View view) {
        scroreTeamB += 1;
        displayForTeamB(scroreTeamB);
    }

    public void resetScore(View view) {
        scroreTeamA = 0;
        displayForTeamA(scroreTeamA);
        scroreTeamB = 0;
        displayForTeamB(scroreTeamB);
    }
}

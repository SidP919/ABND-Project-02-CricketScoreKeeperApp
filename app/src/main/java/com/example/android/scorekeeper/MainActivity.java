package com.example.android.scorekeeper;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;
    int teamAWickets = 0;
    int teamBWickets = 0;
    int teamAOversInt = 0;
    int teamBOversInt = 0;
    int teamAOversDec = 0;
    int teamBOversDec = 0;

    LinearLayout msg;
    LinearLayout mainLl;
    LinearLayout endLl;

    TextView scoreViewA;
    TextView wicketViewA;
    TextView intViewA;
    TextView decViewA;
    TextView scoreViewB;
    TextView wicketViewB;
    TextView intViewB;
    TextView decViewB;
    TextView result;

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msg = findViewById(R.id.msg_Ll);
        mainLl = findViewById(R.id.main_ll);
        endLl = findViewById(R.id.end_ll);

        scoreViewA = (TextView) findViewById(R.id.team_a_score);
        wicketViewA = (TextView) findViewById(R.id.team_a_wickets);
        intViewA = (TextView) findViewById(R.id.team_a_overs_int);
        decViewA = (TextView) findViewById(R.id.team_a_overs_dec);
        scoreViewB = (TextView) findViewById(R.id.team_b_score);
        wicketViewB = (TextView) findViewById(R.id.team_b_wickets);
        intViewB = (TextView) findViewById(R.id.team_b_overs_int);
        decViewB = (TextView) findViewById(R.id.team_b_overs_dec);
        result = findViewById(R.id.resultTV);
        b = findViewById(R.id.reset_Button);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                msg.setVisibility(View.INVISIBLE);
                mainLl.setVisibility(View.VISIBLE);
                endLl.setVisibility(View.VISIBLE);
            }
        }, 3000);
    }


//Buttons' functions for Team A:-

    public void oneA(View view) {
        if (teamAWickets < 10) {
            teamAScore = teamAScore + 1;
            displayForTeamAScore(teamAScore);
            if (teamAOversDec < 5) {
                teamAOversDec = teamAOversDec + 1;
            } else {
                teamAOversInt = teamAOversInt + 1;
                teamAOversDec = 0;
            }
            displayForTeamAOvers(teamAOversInt, teamAOversDec);
        } else
            Toast.makeText(this, getResources().getText(R.string.after10W_ArunsClicked).toString(), Toast.LENGTH_SHORT).show();

    }

    public void twoA(View view) {
        if (teamAWickets < 10) {
            teamAScore = teamAScore + 2;
            displayForTeamAScore(teamAScore);
            if (teamAOversDec < 5) {
                teamAOversDec = teamAOversDec + 1;
            } else {
                teamAOversInt = teamAOversInt + 1;
                teamAOversDec = 0;
            }
            displayForTeamAOvers(teamAOversInt, teamAOversDec);
        } else
            Toast.makeText(this, getResources().getText(R.string.after10W_ArunsClicked).toString(), Toast.LENGTH_LONG).show();
    }

    public void threeA(View view) {
        if (teamAWickets < 10) {
            teamAScore = teamAScore + 3;
            displayForTeamAScore(teamAScore);
            if (teamAOversDec < 5) {
                teamAOversDec = teamAOversDec + 1;
            } else {
                teamAOversInt = teamAOversInt + 1;
                teamAOversDec = 0;
            }
            displayForTeamAOvers(teamAOversInt, teamAOversDec);
        } else
            Toast.makeText(this, getResources().getText(R.string.after10W_ArunsClicked).toString(), Toast.LENGTH_SHORT).show();
    }

    public void fourA(View view) {
        if (teamAWickets < 10) {
            teamAScore = teamAScore + 4;
            displayForTeamAScore(teamAScore);
            if (teamAOversDec < 5) {
                teamAOversDec = teamAOversDec + 1;
            } else {
                teamAOversInt = teamAOversInt + 1;
                teamAOversDec = 0;
            }
            displayForTeamAOvers(teamAOversInt, teamAOversDec);
        } else
            Toast.makeText(this, getResources().getText(R.string.after10W_ArunsClicked).toString(), Toast.LENGTH_SHORT).show();
    }

    public void sixA(View view) {
        if (teamAWickets < 10) {
            teamAScore = teamAScore + 6;
            displayForTeamAScore(teamAScore);
            if (teamAOversDec < 5) {
                teamAOversDec = teamAOversDec + 1;
            } else {
                teamAOversInt = teamAOversInt + 1;
                teamAOversDec = 0;
            }
            displayForTeamAOvers(teamAOversInt, teamAOversDec);
        } else
            Toast.makeText(this, getResources().getText(R.string.after10W_ArunsClicked).toString(), Toast.LENGTH_SHORT).show();

    }

    public void wicketsA(View view) {
        if (teamAWickets < 10) {
            teamAWickets = teamAWickets + 1;
            displayForTeamAWickets(teamAWickets);
            if (teamAOversDec < 5) {
                teamAOversDec = teamAOversDec + 1;
            } else {
                teamAOversInt = teamAOversInt + 1;
                teamAOversDec = 0;
            }
            displayForTeamAOvers(teamAOversInt, teamAOversDec);
        } else
            Toast.makeText(this, getResources().getText(R.string.after10W_wicketClicked).toString(), Toast.LENGTH_SHORT).show();
    }

    public void extrasA(View view) {
        if (teamAOversDec > 0) {
            teamAOversDec = teamAOversDec - 1;
        } else if (teamAOversInt > 0) {
            teamAOversInt = teamAOversInt - 1;
            teamAOversDec = 5;
        }
        displayForTeamAOvers(teamAOversInt, teamAOversDec);
    }

    public void dotA(View view) {
        if (teamAOversDec < 5) {
            teamAOversDec = teamAOversDec + 1;
        } else {
            teamAOversInt = teamAOversInt + 1;
            teamAOversDec = 0;
        }
        displayForTeamAOvers(teamAOversInt, teamAOversDec);
    }

//Buttons's functions For Team B:-

    public void oneB(View view) {
        if (teamBWickets < 10) {
            teamBScore = teamBScore + 1;
            displayForTeamBScore(teamBScore);
            if (teamBOversDec < 5) {
                teamBOversDec = teamBOversDec + 1;
            } else {
                teamBOversInt = teamBOversInt + 1;
                teamBOversDec = 0;
            }
            displayForTeamBOvers(teamBOversInt, teamBOversDec);
        } else
            Toast.makeText(this, getResources().getText(R.string.after10W_BrunsClicked).toString(), Toast.LENGTH_SHORT).show();

    }

    public void twoB(View view) {
        if (teamBWickets < 10) {
            teamBScore = teamBScore + 2;
            displayForTeamBScore(teamBScore);
            if (teamBOversDec < 5) {
                teamBOversDec = teamBOversDec + 1;
            } else {
                teamBOversInt = teamBOversInt + 1;
                teamBOversDec = 0;
            }
            displayForTeamBOvers(teamBOversInt, teamBOversDec);
        } else
            Toast.makeText(this, getResources().getText(R.string.after10W_BrunsClicked).toString(), Toast.LENGTH_SHORT).show();

    }

    public void threeB(View view) {
        if (teamBWickets < 10) {
            teamBScore = teamBScore + 3;
            displayForTeamBScore(teamBScore);
            if (teamBOversDec < 5) {
                teamBOversDec = teamBOversDec + 1;
            } else {
                teamBOversInt = teamBOversInt + 1;
                teamBOversDec = 0;
            }
            displayForTeamBOvers(teamBOversInt, teamBOversDec);
        } else
            Toast.makeText(this, getResources().getText(R.string.after10W_BrunsClicked).toString(), Toast.LENGTH_SHORT).show();

    }

    public void fourB(View view) {
        if (teamBWickets < 10) {
            teamBScore = teamBScore + 4;
            displayForTeamBScore(teamBScore);
            if (teamBOversDec < 5) {
                teamBOversDec = teamBOversDec + 1;
            } else {
                teamBOversInt = teamBOversInt + 1;
                teamBOversDec = 0;
            }
            displayForTeamBOvers(teamBOversInt, teamBOversDec);
        } else
            Toast.makeText(this, getResources().getText(R.string.after10W_BrunsClicked).toString(), Toast.LENGTH_SHORT).show();

    }

    public void sixB(View view) {
        if (teamBWickets < 10) {
            teamBScore = teamBScore + 6;
            displayForTeamBScore(teamBScore);
            if (teamBOversDec < 5) {
                teamBOversDec = teamBOversDec + 1;
            } else {
                teamBOversInt = teamBOversInt + 1;
                teamBOversDec = 0;
            }
            displayForTeamBOvers(teamBOversInt, teamBOversDec);
        } else
            Toast.makeText(this, getResources().getText(R.string.after10W_BrunsClicked).toString(), Toast.LENGTH_LONG).show();

    }

    public void wicketsB(View view) {
        if (teamBWickets < 10) {
            teamBWickets = teamBWickets + 1;
            displayForTeamBWickets(teamBWickets);
            if (teamBOversDec < 5) {
                teamBOversDec = teamBOversDec + 1;
            } else {
                teamBOversInt = teamBOversInt + 1;
                teamBOversDec = 0;
            }
            displayForTeamBOvers(teamBOversInt, teamBOversDec);
        } else
            Toast.makeText(this, getResources().getText(R.string.after10W_wicketClicked).toString(), Toast.LENGTH_LONG).show();
    }

    public void extrasB(View view) {
        if (teamBOversDec > 0) {
            teamBOversDec = teamBOversDec - 1;
        } else if (teamBOversInt > 0) {
            teamBOversInt = teamBOversInt - 1;
            teamBOversDec = 5;
        }
        displayForTeamBOvers(teamBOversInt, teamBOversDec);
    }

    public void dotB(View view) {
        if (teamBOversDec < 5) {
            teamBOversDec = teamBOversDec + 1;
        } else {
            teamBOversInt = teamBOversInt + 1;
            teamBOversDec = 0;
        }
        displayForTeamBOvers(teamBOversInt, teamBOversDec);
    }

    //Display functions:-
    public void displayForTeamAScore(int score) {
        decreaseScoreTextSize(score, scoreViewA);
        scoreViewA.setText(String.valueOf(score));
    }

    public void displayForTeamAWickets(int wickets) {
        wicketViewA.setText(String.valueOf(wickets));
    }

    public void displayForTeamAOvers(int integer, int decimal) {
        intViewA.setText(String.valueOf(integer));
        decViewA.setText(String.valueOf(decimal));
    }

    public void displayForTeamBScore(int score) {
        decreaseScoreTextSize(score, scoreViewB);
        scoreViewB.setText(String.valueOf(score));
    }

    public void displayForTeamBWickets(int wickets) {
        wicketViewB.setText(String.valueOf(wickets));
    }

    public void displayForTeamBOvers(int integer, int decimal) {
        intViewB.setText(String.valueOf(integer));
        decViewB.setText(String.valueOf(decimal));
    }

    //Function for RESET Button:-
    public void reset(View view) {
        teamAScore = 0;
        teamBScore = 0;
        teamAWickets = 0;
        teamBWickets = 0;
        teamAOversInt = 0;
        teamBOversInt = 0;
        teamAOversDec = 0;
        teamBOversDec = 0;
        displayForTeamAScore(0);
        displayForTeamBScore(0);
        displayForTeamAOvers(0, 0);
        displayForTeamBOvers(0, 0);
        displayForTeamAWickets(0);
        displayForTeamBWickets(0);

        scoreViewA.setTextSize(24);
        scoreViewB.setTextSize(24);
    }

    //Function for FINISH Button:-
    public void finish(View v) {
        mainLl.setVisibility(View.INVISIBLE);
        endLl.setVisibility(View.INVISIBLE);
        result.setVisibility(View.VISIBLE);
        if (teamAScore < teamBScore) {
            result.setBackgroundColor(Color.RED);
            result.setTextColor(Color.BLUE);
            result.setText(getResources().getText(R.string.teamBwon).toString());
        } else if (teamAScore > teamBScore) {
            result.setBackgroundColor(Color.BLUE);
            result.setTextColor(Color.RED);
            result.setText(getResources().getText(R.string.teamAwon).toString());
        } else if (teamBScore == teamAScore) {
            result.setText(getResources().getText(R.string.drawMatch).toString());
            result.setBackgroundColor(Color.WHITE);
            result.setTextColor(Color.GREEN);
        }

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                result.setVisibility(View.INVISIBLE);
                mainLl.setVisibility(View.VISIBLE);
                endLl.setVisibility(View.VISIBLE);
                reset(b);
            }
        }, 2500);
    }

    //Function for decreasing TextSize of ScoreView if RUNS exceed 1000 figure:-
    public void decreaseScoreTextSize(int teamScore, TextView v) {
        if (teamScore > 999)
            v.setTextSize(16);
    }
}

package com.example.android.quizapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button [][] buttons;
    private boolean[][] answers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttons=new Button[5][3];
        answers=new boolean[5][3];

        buttons[0][0]=(Button) findViewById(R.id.Q1_A);
        buttons[0][1]=(Button) findViewById(R.id.Q1_B);
        buttons[0][2]=(Button) findViewById(R.id.Q1_C);
        buttons[1][0]=(Button) findViewById(R.id.Q2_A);
        buttons[1][1]=(Button) findViewById(R.id.Q2_B);
        buttons[1][2]=(Button) findViewById(R.id.Q2_C);
        buttons[2][0]=(Button) findViewById(R.id.Q3_A);
        buttons[2][1]=(Button) findViewById(R.id.Q3_B);
        buttons[2][2]=(Button) findViewById(R.id.Q3_C);
        buttons[3][0]=(Button) findViewById(R.id.Q4_A);
        buttons[3][1]=(Button) findViewById(R.id.Q4_B);
        buttons[3][2]=(Button) findViewById(R.id.Q4_C);
        buttons[4][0]=(Button) findViewById(R.id.Q5_A);
        buttons[4][1]=(Button) findViewById(R.id.Q5_B);
        buttons[4][2]=(Button) findViewById(R.id.Q5_C);

        answers[0][0]=true;
        answers[1][1]=true;
        answers[2][2]=true;
        answers[3][0]=true;
        answers[4][2]=true;

    }

    public void result(View view){
        Button b=(Button) view;
        int id=view.getId();
        for(int i=0;i<5;i++)
            for(int j=0;j<3;j++)
            {
                if (id==buttons[i][j].getId()){
                    if(answers[i][j])
                    {
                        buttons[i][j].setBackgroundColor(Color.GREEN);
                    }
                    else{
                        buttons[i][j].setBackgroundColor(Color.RED);
                    }
                    break;
                }
            }


    }
}

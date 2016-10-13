package com.example.android.androidquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void submitOrder(View view) {

        //Set variables for the answers to Question #1

        TextView answerText = (TextView) findViewById(R.id.answer_editText);
        String question1Answer = answerText.getText().toString().toUpperCase();

        //Set variables and booleans for the answers to Question #2

        RadioButton question2Answer1 = (RadioButton) findViewById(R.id.question2_answer1);
        RadioButton question2Answer2 = (RadioButton) findViewById(R.id.question2_answer2);
        RadioButton question2Answer3 = (RadioButton) findViewById(R.id.question2_answer3);

        boolean q2A1IsSelected = question2Answer1.isChecked();
        boolean q2A2IsSelected = question2Answer2.isChecked();
        boolean q2A3IsSelected = question2Answer3.isChecked();

        //Set variables and booleans for the answers to Question #3

        RadioButton question3True = (RadioButton) findViewById(R.id.question3_true);
        RadioButton question3False = (RadioButton) findViewById(R.id.question3_false);

        boolean q3TrueIsSelected = question3True.isChecked();
        boolean q3FalseIsSelected = question3False.isChecked();

        //Set variables and booleans for the answers to Question #4

        CheckBox question4Answer1 = (CheckBox) findViewById(R.id.question4_answer1);
        CheckBox question4Answer2 = (CheckBox) findViewById(R.id.question4_answer2);
        CheckBox question4Answer3 = (CheckBox) findViewById(R.id.question4_answer3);
        CheckBox question4Answer4 = (CheckBox) findViewById(R.id.question4_answer4);

        boolean q4A1IsChecked = question4Answer1.isChecked();
        boolean q4A2IsChecked = question4Answer2.isChecked();
        boolean q4A3IsChecked = question4Answer3.isChecked();
        boolean q4A4IsChecked = question4Answer4.isChecked();

    }
}

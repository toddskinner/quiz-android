package com.example.android.androidquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    String question1Answer = "";

    //Remember to set answer to Q1 here
    String answerToQ1 = "Todd";

    //booleans for Q2
    boolean q2A1IsSelected;
    boolean q2A2IsSelected;
    boolean q2A3IsSelected;

    //booleans for Q3
    boolean q3TrueIsSelected;
    boolean q3FalseIsSelected;

    //booleans for Q4
    boolean q4A1IsChecked;
    boolean q4A2IsChecked;
    boolean q4A3IsChecked;
    boolean q4A4IsChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //found code below on StackOverflow
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    public void submitOrder(View view) {

        //Set variables for the answers to Question #1

        TextView answerText = (TextView) findViewById(R.id.answer_editText);
        String question1Answer = answerText.getText().toString();

        //Set variables and booleans for the answers to Question #2

        RadioButton question2Answer1 = (RadioButton) findViewById(R.id.question2_answer1);
        RadioButton question2Answer2 = (RadioButton) findViewById(R.id.question2_answer2);
        RadioButton question2Answer3 = (RadioButton) findViewById(R.id.question2_answer3);

        q2A1IsSelected = question2Answer1.isChecked();
        q2A2IsSelected = question2Answer2.isChecked();
        q2A3IsSelected = question2Answer3.isChecked();

        //Set variables and booleans for the answers to Question #3

        RadioButton question3True = (RadioButton) findViewById(R.id.question3_true);
        RadioButton question3False = (RadioButton) findViewById(R.id.question3_false);

        q3TrueIsSelected = question3True.isChecked();
        q3FalseIsSelected = question3False.isChecked();

        //Set variables and booleans for the answers to Question #4

        CheckBox question4Answer1 = (CheckBox) findViewById(R.id.question4_answer1);
        CheckBox question4Answer2 = (CheckBox) findViewById(R.id.question4_answer2);
        CheckBox question4Answer3 = (CheckBox) findViewById(R.id.question4_answer3);
        CheckBox question4Answer4 = (CheckBox) findViewById(R.id.question4_answer4);

        q4A1IsChecked = question4Answer1.isChecked();
        q4A2IsChecked = question4Answer2.isChecked();
        q4A3IsChecked = question4Answer3.isChecked();
        q4A4IsChecked = question4Answer4.isChecked();

        checkAnswers();
    }

    public void checkAnswers()
    {

        if(question1Answer.equals(answerToQ1));   //why does Android Studio say the "if statement has an empty body"?
        {
            score = score + 1;
        }
        if(q2A3IsSelected)
        {
            score = score + 1;
        }
        if(q3FalseIsSelected)
        {
            score = score + 1;
        }
        if(q4A2IsChecked && q4A3IsChecked && !q4A1IsChecked && !q4A4IsChecked)
        {
            score = score + 1;
        }
        String toastMessage = "" + score + " out of 4 answers correct";
        Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show();
        score = 0;
    }

    public void resetAnswers(View view)
    {
        score = 0;

        //Question 1
        TextView answerText = (TextView) findViewById(R.id.answer_editText);
        answerText.setText("");
        question1Answer = "";

        //Question 2

        RadioGroup question2 = (RadioGroup) findViewById(R.id.question2);
        question2.clearCheck();

        q2A1IsSelected = false;
        q2A2IsSelected = false;
        q2A3IsSelected = false;

        //Question 3

        RadioGroup question3 = (RadioGroup) findViewById(R.id.question3);
        question3.clearCheck();

        q3TrueIsSelected = false;
        q3FalseIsSelected = false;

        //Question 4

        CheckBox question4Answer1 = (CheckBox) findViewById(R.id.question4_answer1);
        CheckBox question4Answer2 = (CheckBox) findViewById(R.id.question4_answer2);
        CheckBox question4Answer3 = (CheckBox) findViewById(R.id.question4_answer3);
        CheckBox question4Answer4 = (CheckBox) findViewById(R.id.question4_answer4);

        question4Answer1.setChecked(false);
        question4Answer1.setClickable(true);

        question4Answer2.setChecked(false);
        question4Answer2.setClickable(true);

        question4Answer3.setChecked(false);
        question4Answer3.setClickable(true);

        question4Answer4.setChecked(false);
        question4Answer4.setClickable(true);

        q4A1IsChecked = false;
        q4A2IsChecked = false;
        q4A3IsChecked = false;
        q4A4IsChecked = false;

    }
}

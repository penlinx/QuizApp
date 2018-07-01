package com.example.benjamin.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button submit;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = (Button) findViewById(R.id.submit_button);
        submit.setOnClickListener(submitButtonOnClickListener);
    }

    private String getQuestionOneUserInput() {
        EditText userInputValue = (EditText) findViewById(R.id.qn_1_answer_text_field);
        String value = userInputValue.getText().toString();
        return value;
    }

    private void checkQuestionOne(){
        String name = getQuestionOneUserInput();
        if (name.trim().equals("26")){
            score += 1;
        }
    }


    private void checkQuestionTwo(){
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.qn_2_radio_2);
        boolean isQuestionTwoCorrect = radioButton2.isChecked();
        if (isQuestionTwoCorrect){
            score += 1;
        }
    }


    private void checkQuestionThree(){
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.qn_3_radio_4);
        boolean isQuestionThreeCorrect = radioButton3.isChecked();
        if (isQuestionThreeCorrect){
            score += 1;
        }
    }


    private void checkQuestionFour(){
        RadioButton radioButton4 = (RadioButton) findViewById(R.id.qn_4_radio_3);
        boolean isQuestionFourCorrect = radioButton4.isChecked();
        if (isQuestionFourCorrect){
            score += 1;
        }
    }

    private void checkQuestionFive(){
        RadioButton radioButton5 = (RadioButton) findViewById(R.id.qn_5_radio_3);
        boolean isQuestionFiveCorrect = radioButton5.isChecked();
        if (isQuestionFiveCorrect){
            score += 1;
        }
    }
    
    
    private void checkAllQuestions(){
        checkQuestionOne();
        checkQuestionTwo();
        checkQuestionThree();
        checkQuestionFour();
        checkQuestionFive();
    }

    private void resetScore(){
        score = 0;
    }

    final View.OnClickListener submitButtonOnClickListener = new View.OnClickListener() {
        public void onClick(final View v){
            checkAllQuestions();
            Toast.makeText(MainActivity.this, "Score: " + score + "/5",
                    Toast.LENGTH_LONG).show();
            resetScore();
        }
    };
}

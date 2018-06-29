package com.example.android.quizapp;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    String failedQ1 = "", failedQ2 = "", failedQ3 = "", failedQ4 = "", failedQ5 = "", failedQ6 = "", failedQ7 = "", failedQ8 = "", failedQ9 = "";
    int correctAnswQ1 = 0, correctAnswQ2 = 0, correctAnswQ3 = 0, correctAnswQ4 = 0, correctAnswQ5 = 0, correctAnswQ6 = 0, correctAnswQ7 = 0, correctAnswQ8 = 0, correctAnswQ9 = 0, wronganswQ1 = 0, wronganswQ2 = 0, wronganswQ3 = 0, wronganswQ4 = 0, wronganswQ5 = 0, wronganswQ6 = 0, wronganswQ7 = 0, wronganswQ8 = 0, wronganswQ9 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public Boolean RadioButtonMethod(int resource1, int resource2) {
        RadioGroup radioGroup1 = (RadioGroup) findViewById(resource1);
        int CheckedRadioButton = radioGroup1.getCheckedRadioButtonId();
        RadioButton CheckedRadioButtonId = findViewById(CheckedRadioButton);
        RadioButton correctAnsw = findViewById(resource2);
        if (CheckedRadioButtonId == correctAnsw) {
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean CheckboxMethod(int Checkboxid) {
        CheckBox checkboxId = (CheckBox) findViewById(Checkboxid);
        Boolean checked = checkboxId.isChecked();
        return checked;
    }

    public String EditTextMethod(int inputid) {
        EditText inputText = (EditText) findViewById(inputid);
        String input = inputText.getText().toString();
        return input;
    }


    public void questio1(View view) {
        if (RadioButtonMethod(R.id.radioGroup1, R.id.questiion1B)) {
            correctAnswQ1 = 1;
            wronganswQ1 = 0;
            failedQ1 = "";
        } else {
            wronganswQ1 = 1;
            failedQ1 = "Q1";
            correctAnswQ1 = 0;

        }
    }

    public void questio2(View view) {
        if (RadioButtonMethod(R.id.radioGroup2, R.id.questiion2A)) {
            correctAnswQ2 = 1;
            wronganswQ2 = 0;
            failedQ2 = "";
        } else {
            wronganswQ2 = 1;
            correctAnswQ2 = 0;
            failedQ2 = "Q2";
        }
    }

    public void questio3(View view) {
        if (RadioButtonMethod(R.id.radioGroup3, R.id.questiion3C)) {
            correctAnswQ3 = 1;
            wronganswQ3 = 0;
            failedQ3 = "";
        } else {
            wronganswQ3 = 1;
            correctAnswQ3 = 0;
            failedQ3 = "Q3";
        }
    }


    public void qustion4() {
        if (CheckboxMethod(R.id.checkboxQ4A) && CheckboxMethod(R.id.checkboxQ4B) && !CheckboxMethod(R.id.checkboxQ4C) && CheckboxMethod(R.id.checkboxQ4D)) {

            correctAnswQ4 = 1;
            wronganswQ4 = 0;
            failedQ4 = "";
        } else if (!CheckboxMethod(R.id.checkboxQ4A) && !CheckboxMethod(R.id.checkboxQ4B) && !CheckboxMethod(R.id.checkboxQ4C) && !CheckboxMethod(R.id.checkboxQ4D)) {

            correctAnswQ4 = 0;
            wronganswQ4 = 0;
            failedQ4 = "";
        } else {

            wronganswQ4 = 1;
            correctAnswQ4 = 0;
            failedQ4 = "Q4";
        }
    }

    public void qustion5() {
        if (CheckboxMethod(R.id.checkboxQ5A) && CheckboxMethod(R.id.checkboxQ5B) && CheckboxMethod(R.id.checkboxQ5C) && !CheckboxMethod(R.id.checkboxQ5D)) {

            correctAnswQ5 = 1;
            wronganswQ5 = 0;
            failedQ5 = "";
        } else if (!CheckboxMethod(R.id.checkboxQ5A) && !CheckboxMethod(R.id.checkboxQ5B) && !CheckboxMethod(R.id.checkboxQ5C) && !CheckboxMethod(R.id.checkboxQ5D)) {

            correctAnswQ5 = 0;
            wronganswQ5 = 0;
            failedQ5 = "";
        } else {

            wronganswQ4 = 1;
            correctAnswQ4 = 0;
            failedQ4 = "Q5";
        }
    }

    public void qustion6() {
        if (!CheckboxMethod(R.id.checkboxQ6A) && CheckboxMethod(R.id.checkboxQ6B) && CheckboxMethod(R.id.checkboxQ6C) && CheckboxMethod(R.id.checkboxQ6D)) {

            correctAnswQ6 = 1;
            wronganswQ6 = 0;
            failedQ6 = "";
        } else if (!CheckboxMethod(R.id.checkboxQ6A) && !CheckboxMethod(R.id.checkboxQ6B) && !CheckboxMethod(R.id.checkboxQ6C) && !CheckboxMethod(R.id.checkboxQ6D)) {

            correctAnswQ6 = 0;
            wronganswQ6 = 0;
            failedQ6 = "";
        } else {

            wronganswQ6 = 1;
            correctAnswQ6 = 0;
            failedQ6 = "Q4";
        }
    }

    public void quetion7() {
        String answ = "TextView";
        if (EditTextMethod(R.id.input_fieldQ7).equals(answ)) {
            correctAnswQ7 = 1;
            wronganswQ7 = 0;
            failedQ7 = "";

        } else if (EditTextMethod(R.id.input_fieldQ7).equals("")) {
            correctAnswQ7 = 0;
            wronganswQ7 = 0;
            failedQ7 = "";
        } else {
            wronganswQ7 = 1;
            correctAnswQ7 = 0;
            failedQ7 = "Q7";
        }
    }

    public void quetion8() {
        String answ = "Editable";
        if (EditTextMethod(R.id.input_fieldQ8).equals(answ)) {
            correctAnswQ8 = 1;
            wronganswQ8 = 0;
            failedQ8 = "";
        } else if (EditTextMethod(R.id.input_fieldQ8).equals("")) {
            correctAnswQ8 = 0;
            wronganswQ8 = 0;
            failedQ8 = "";
        } else {
            wronganswQ8 = 1;
            correctAnswQ8 = 0;
            failedQ8 = "Q8";
        }
    }

    public void quetion9() {
        String answ = "findViewById";
        if (EditTextMethod(R.id.input_fieldQ9).equals(answ)) {
            correctAnswQ9 = 1;
            wronganswQ9 = 0;
            failedQ9 = "";

        } else if (EditTextMethod(R.id.input_fieldQ9).equals("")) {
            correctAnswQ9 = 0;
            wronganswQ9 = 0;
            failedQ9 = "";

        } else {
            wronganswQ9 = 1;
            correctAnswQ9 = 0;
            failedQ9 = "Q9";
        }
    }


    private void display(int number, int number2, String string) {
        TextView Grade = (TextView) findViewById(
                R.id.display);
        String Grading;
        if (number == 9) {
            Grading = "Perfect! You scored 9 out of 9";
        }
        else if (number == 0 && number2 == 0){
            Grading = "You didn't Attempt any Question";
        }
        else {
            Grading = "Try again. You scored " + number + " out of 9 " + "\nYour fail " + number2 + " : " + string;
        }
        Grade.setText(Grading);
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, Grading, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    public void RadioButtonResetMethod(View view) {

        RadioGroup radioGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
        radioGroup1.clearCheck();
        RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.radioGroup2);
        radioGroup2.clearCheck();
        RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.radioGroup3);
        radioGroup3.clearCheck();
        correctAnswQ1 = 0; correctAnswQ2 = 0; correctAnswQ3 = 0;
        wronganswQ1 = 0; wronganswQ2 = 0; wronganswQ3 =0;
        failedQ1 = ""; failedQ2 = ""; failedQ3 = "";
    }

    public void CheckboxResetMethod(int Checkboxid) {
        CheckBox checkboxId = (CheckBox) findViewById(Checkboxid);
        checkboxId.setChecked(false);
    }

    public void EditTextResetMethod(int inputid) {
        EditText inputText = (EditText) findViewById(inputid);
        inputText.getText().clear();

    }

    public void RadioButtonSetErrorColor(int wrongid1, int wrongid2){
        RadioButton wronga = findViewById(wrongid1);
        RadioButton wrongb = findViewById(wrongid2);

        if (wronga.isChecked()){
            wronga.setTextColor(Color.RED);
            wrongb.setTextColor(Color.BLACK);
        }
        else if ( wrongb.isChecked()){
            wrongb.setTextColor(Color.RED);
            wronga.setTextColor(Color.BLACK);
        }
        else{
            wronga.setTextColor(Color.BLACK);
            wrongb.setTextColor(Color.BLACK);
        }
    }

    public void RadioButtonResetErrorColor(int wrongid1, int wrongid2){
        RadioButton wronga = findViewById(wrongid1);
        RadioButton wrongb = findViewById(wrongid2);
        wronga.setTextColor(Color.BLACK);
        wrongb.setTextColor(Color.BLACK);

    }

    public void checkBoxSetErrorColor(int wrongcheckboxid){
        CheckBox checkboxId = (CheckBox) findViewById(wrongcheckboxid);
        Boolean checked = checkboxId.isChecked();
        if (checked){
            checkboxId.setTextColor(Color.RED);
        }
        else{
            checkboxId.setTextColor(Color.BLACK);
        }

    }

    public void checkBoxResetErrorColor(int wrongcheckboxid){
        CheckBox checkboxId = (CheckBox) findViewById(wrongcheckboxid);
            checkboxId.setTextColor(Color.BLACK);
    }

    public void EditTextSetErrorColor(int inputid, String answ) {
        EditText inputText = (EditText) findViewById(inputid);
        String input = inputText.getText().toString();
        if (!EditTextMethod(R.id.input_fieldQ8).equals(answ)) {
            inputText.setHighlightColor(Color.RED);
        }
        else{
            inputText.setTextColor(Color.BLACK);
        }
    }

    public void EditTextResetErrorColor(int inputid) {
        EditText inputText = (EditText) findViewById(inputid);
            inputText.setTextColor(Color.BLACK);
    }


    public void grading(View view) {
        qustion4(); qustion5(); qustion6(); quetion7(); quetion8(); quetion9();
        RadioButtonSetErrorColor(R.id.questiion1A, R.id.questiion1C); RadioButtonSetErrorColor(R.id.questiion2B, R.id.questiion2C); RadioButtonSetErrorColor(R.id.questiion3A, R.id.questiion3B);
        checkBoxSetErrorColor(R.id.checkboxQ4C); checkBoxSetErrorColor(R.id.checkboxQ5D); checkBoxSetErrorColor(R.id.checkboxQ6A);
        EditTextSetErrorColor(R.id.input_fieldQ7, "TextView");  EditTextSetErrorColor(R.id.input_fieldQ8, "Editable"); EditTextSetErrorColor(R.id.input_fieldQ8, "findViewById");
        int correctAnsw = correctAnswQ1 + correctAnswQ2 + correctAnswQ3 + correctAnswQ4 + correctAnswQ5 + correctAnswQ6 + correctAnswQ7 + correctAnswQ8 + correctAnswQ9;
        int wrongansw = wronganswQ1 + wronganswQ2 + wronganswQ3 + wronganswQ4 + wronganswQ5 + wronganswQ6 + wronganswQ7 + wronganswQ8 + wronganswQ9;
        String failedQ = failedQ1 + " " + failedQ2 + " " + failedQ3 + " " + failedQ4 + " " + failedQ5 + " " + failedQ6 + " " + failedQ7 + " " + failedQ8 + " " + failedQ9;

        display(correctAnsw, wrongansw, failedQ);
    }


    public void Reset(View view) {
        RadioButtonResetErrorColor(R.id.questiion1A, R.id.questiion1C); RadioButtonResetErrorColor(R.id.questiion2B, R.id.questiion2C); RadioButtonResetErrorColor(R.id.questiion3A, R.id.questiion3B);
        checkBoxResetErrorColor(R.id.checkboxQ4C); checkBoxResetErrorColor(R.id.checkboxQ5D); checkBoxResetErrorColor(R.id.checkboxQ6A);
        EditTextResetErrorColor(R.id.input_fieldQ7);  EditTextResetErrorColor(R.id.input_fieldQ8); EditTextResetErrorColor(R.id.input_fieldQ8);
        RadioButtonResetMethod(view);
        CheckboxResetMethod(R.id.checkboxQ4A); CheckboxResetMethod(R.id.checkboxQ4B); CheckboxResetMethod(R.id.checkboxQ4C); CheckboxResetMethod(R.id.checkboxQ4D);
        CheckboxResetMethod(R.id.checkboxQ5A); CheckboxResetMethod(R.id.checkboxQ5B); CheckboxResetMethod(R.id.checkboxQ5C); CheckboxResetMethod(R.id.checkboxQ5D);
        CheckboxResetMethod(R.id.checkboxQ6A); CheckboxResetMethod(R.id.checkboxQ6B); CheckboxResetMethod(R.id.checkboxQ6C); CheckboxResetMethod(R.id.checkboxQ6D);
        EditTextResetMethod(R.id.input_fieldQ7); EditTextResetMethod(R.id.input_fieldQ8); EditTextResetMethod(R.id.input_fieldQ9);

        TextView reset = (TextView) findViewById(
                R.id.display);
        String resetTex = "Quiz reset";
        reset.setText("Press Grade Button to view your score. Caution: reset Button will clear all your answers");
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resetTex, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

}
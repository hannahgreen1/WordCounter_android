package com.example.hannahgreen.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    EditText questionEditText;
    TextView answertext;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        questionEditText = findViewById(R.id.enterText);
        answertext = findViewById(R.id.answertext);
        calculate = findViewById(R.id.calculate);
    }

    public void onCalculateAnswer(View button){
        WordCounter wordCounter = new WordCounter();
        int answerText = wordCounter.getWordCount(questionEditText.getText().toString());
       this.answertext.setText(Integer.toString(answerText));
    }

}

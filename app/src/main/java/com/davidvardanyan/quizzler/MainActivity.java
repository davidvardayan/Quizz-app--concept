package com.davidvardanyan.quizzler;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

  Button mTrueButton;
  Button mFalseButton;
  TextView mQuestionTextView;
  int mIndex;
   int mQuestion;


  private TrueFalse[] mQuestionBank = new TrueFalse[]{

          new TrueFalse(R.string.question_1,true),
          new TrueFalse(R.string.question_2,true),
          new TrueFalse(R.string.question_3,true),
          new TrueFalse(R.string.question_4,true),
          new TrueFalse(R.string.question_5,true),
          new TrueFalse(R.string.question_6,false),
          new TrueFalse(R.string.question_7,true),
          new TrueFalse(R.string.question_8,false),
          new TrueFalse(R.string.question_9,true),
          new TrueFalse(R.string.question_10,true),
          new TrueFalse(R.string.question_11,false),
          new TrueFalse(R.string.question_12,false),
          new TrueFalse(R.string.question_13,true),




  };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     mTrueButton = findViewById(R.id.true_button);
     mFalseButton = findViewById(R.id.false_button);
     mQuestionTextView = findViewById(R.id.question_text_view);

        mQuestion = mQuestionBank[mIndex].getQuestionID();
        mQuestionTextView.setText(mQuestion);


     mTrueButton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Log.d("Quizzler","True button was pressed");
             Toast.makeText(getApplicationContext(), "True pressed", Toast.LENGTH_SHORT).show();
         }
     });

     mFalseButton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
                Log.d("Quizzler","False button was pressed");
             Toast.makeText(getApplicationContext(), "False pressed", Toast.LENGTH_SHORT).show();
         }
     });

    }
}

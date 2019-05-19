package com.davidvardanyan.quizzler;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

  Button mTrueButton;
  Button mFalseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     mTrueButton = findViewById(R.id.true_button);
     mFalseButton = findViewById(R.id.false_button);


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

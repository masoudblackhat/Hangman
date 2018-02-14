package com.example.masoud.hagman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txtWordView;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
      txtWordView =(TextView)findViewById(R.id.txtWordView);

    int a=0;
    int c=2;

    int g=0;


    int y=52;


  }
  public void onClick(View view){
    String letter=view.getTag().toString();

      txtWordView.setText(letter);




  }
}

package com.example.masoud.hagman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    int a=0;
    int c=2;
  }
  public void onClick(View view){
    String letter=view.getTag().toString();

  }
}

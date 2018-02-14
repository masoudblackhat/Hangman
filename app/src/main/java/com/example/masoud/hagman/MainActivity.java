package com.example.masoud.hagman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txtWordView;
  String word=word();
  public String word(){
    return "Hello world";
  }
String wordDashed="";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    txtWordView =(TextView)findViewById(R.id.txtWordView);
    for (int i = 0; i <word.length() ; i++) {
      if (word.charAt(i)!=' '){
        wordDashed +="-";
      }else {
        wordDashed +=" ";
      }

    }

    txtWordView.setText(wordDashed);



  }
  public void onClick(View view){
    String letter=view.getTag().toString();
    String lword=word.toLowerCase();
    char letterchar = letter.charAt(0);

    if (lword.contains(letter)){
      for (int i = 0; i <lword.length() ; i++) {
        if (lword.charAt(i)==letterchar){
          char[] chars = wordDashed.toCharArray();
                chars[i]=letterchar;
          wordDashed=new String(chars);
          txtWordView.setText(wordDashed);
        }else {

        }
      }
    }
      view.setVisibility(View.INVISIBLE);
    }


}


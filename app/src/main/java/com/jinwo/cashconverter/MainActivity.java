package com.jinwo.cashconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText usdText = (EditText) findViewById(R.id.usdText);
        EditText cadText = (EditText) findViewById(R.id.cadText);

        double CADCash = Integer.parseInt(usdText.getText().toString()) * 1.30;

        cadText.setText(String.valueOf(CADCash));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

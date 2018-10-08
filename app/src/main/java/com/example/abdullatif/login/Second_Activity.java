package com.example.abdullatif.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Second_Activity extends AppCompatActivity {
    private EditText E1 ,E2 ,E3;
    Button Submit_BTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);

        E1= (EditText)findViewById(R.id.Txt_1);
        E2= (EditText)findViewById(R.id.Txt_2);
        E3= (EditText)findViewById(R.id.Txt_3);
        Submit_BTN=(Button)findViewById(R.id.Submit_btn);

    }
}

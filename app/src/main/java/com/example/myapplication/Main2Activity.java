package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    Button saveButton;
    private EditText first;
    private EditText second;
    private EditText third;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.saveButton:
                first = findViewById(R.id.editText1);
                second = findViewById(R.id.editText2);
                third = findViewById(R.id.editText3);
                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra("first", first.getText().toString());
                intent.putExtra("second", first.getText().toString());
                intent.putExtra("third", first.getText().toString());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                break;
        }

    }
}

package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button load;
    TextView first;
    TextView second;
    TextView third;
    String field;
    String[] strings ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        load = findViewById(R.id.load);
        load.setOnClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        field = getIntent().getStringExtra("first") + "|" +
                getIntent().getStringExtra("second") + "|" +
                getIntent().getStringExtra("third");
        int i=0;
        i++;
        strings[i] = field;
        ListView list = findViewById(R.id.List);
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,strings);
        list.setAdapter(adapter);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.load:
                Intent intent = new Intent(this,Main2Activity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                break;
        }

    }
}

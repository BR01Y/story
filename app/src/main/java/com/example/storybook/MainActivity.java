package com.example.storybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
public class MainActivity extends AppCompatActivity {
    LinearLayout moralLayout,loveLayout,sifiLayout,successLayout,advenLayout,horrorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moralLayout=findViewById(R.id.moral);
        loveLayout=findViewById(R.id.love);
        sifiLayout=findViewById(R.id.sifi);
        successLayout=findViewById(R.id.success);
        advenLayout=findViewById(R.id.adventure);
        horrorLayout=findViewById(R.id.horror);
        moralLayout.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,listViewActivity2.class);
            String pass;
            pass="moral";
            intent.putExtra("pass",pass);
            startActivity(intent);
        });
        loveLayout.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,listViewActivity2.class);
            String pass;
            pass="life lessons";
            intent.putExtra("pass",pass);
            startActivity(intent);
        });
        sifiLayout.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,listViewActivity2.class);
            String pass;
            pass="sifi";
            intent.putExtra("pass",pass);
            startActivity(intent);
        });
        advenLayout.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,listViewActivity2.class);
            String pass;
            pass="adventure";
            intent.putExtra("pass",pass);
            startActivity(intent);
        });
        successLayout.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,listViewActivity2.class);
            String pass;
            pass="success";
            intent.putExtra("pass",pass);
            startActivity(intent);
        });
        horrorLayout.setOnClickListener(view -> {
            Intent intent=new Intent(MainActivity.this,listViewActivity2.class);
            String pass;
            pass="horror";
            intent.putExtra("pass",pass);
            startActivity(intent);
        });
    }
}
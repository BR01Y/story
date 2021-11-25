package com.example.storybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class listViewActivity2 extends AppCompatActivity {
    ListView listView;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);
        listView=findViewById(R.id.lis);
        title=findViewById(R.id.head);
        String got=getIntent().getStringExtra("pass");
        title.setText(got+" stories");
        String[] titles=getResources().getStringArray(R.array.simple);
        String[] fullStory=getResources().getStringArray(R.array.ss);
        if (got.equals("moral")){
            titles=getResources().getStringArray(R.array.mTitles);
            fullStory=getResources().getStringArray(R.array.mfs);
        }
        else if (got.equals("life lessons")){
            titles=getResources().getStringArray(R.array.loveT);
            fullStory=getResources().getStringArray(R.array.loveFs);
        }
        else if (got.equals("sifi")){
            titles=getResources().getStringArray(R.array.sifiT);
            fullStory=getResources().getStringArray(R.array.sifiFs);
        }
        else if (got.equals("adventure")){
            titles=getResources().getStringArray(R.array.adventureT);
            fullStory=getResources().getStringArray(R.array.adventureFs);
        }
        else if (got.equals("success")){
            titles=getResources().getStringArray(R.array.successT);
            fullStory=getResources().getStringArray(R.array.successFs);
        }
        else if (got.equals("horror")){
            titles=getResources().getStringArray(R.array.horrorT);
            fullStory=getResources().getStringArray(R.array.horrorFs);
        }
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,titles);
        listView.setAdapter(adapter);
        String[] finalTitles = titles;
        String[] finalFullStory = fullStory;
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String openTitle= finalTitles[i];
                String openStory= finalFullStory[i];
                String num=String.valueOf(i);
                Intent intent=new Intent(listViewActivity2.this,strorySActivity2.class);
                intent.putExtra("openT",openTitle);
                intent.putExtra("openS",openStory);
                intent.putExtra("num",num);
                intent.putExtra("imageV", got);
                startActivity(intent);
            }
        });
    }
}
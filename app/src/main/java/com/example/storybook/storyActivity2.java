package com.example.storybook;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class strorySActivity2 extends AppCompatActivity {
    ImageView nI;
    TextView nT,titleT;
    ScrollView scrollView;
    Button nexB;
    public int index=0;
    int[] morals={R.drawable.magpie,R.drawable.believeinyourself,
            R.drawable.defeatingthebully,R.drawable.elephant,R.drawable.donkey,R.drawable.theman,
            R.drawable.turtle,R.drawable.deer,R.drawable.mouse,R.drawable.shepherd,R.drawable.cows,R.drawable.jimmispuppy};
    int[] lifeLessons={R.drawable.usel,R.drawable.ant,
            R.drawable.moon,R.drawable.cup,R.drawable.gate,
            R.drawable.other,R.drawable.time,
            R.drawable.wind};
    int[] quotas={R.drawable.like,R.drawable.like,R.drawable.like};
    int[] adventure={R.drawable.heart,R.drawable.like,R.drawable.like
    };
    int[] success={R.drawable.heart,R.drawable.like,R.drawable.like
    };
    int[] horror={R.drawable.facebook,R.drawable.like,R.drawable.like
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story2);
        nI=findViewById(R.id.fId);
        titleT=findViewById(R.id.sTitle);
        nT=findViewById(R.id.ftID);
        nexB=findViewById(R.id.nextB);
        scrollView=findViewById(R.id.scroll);
        int num=Integer.parseInt(getIntent().getStringExtra("num"));
        String sto=getIntent().getStringExtra("openS");
        String stT=getIntent().getStringExtra("openT");
        String imV=getIntent().getStringExtra("imageV");
        index=num;
        if (imV.equals("moral")){
            nI.setImageResource(morals[num]);
        }
        else if (imV.equals("life lessons")){
            nI.setImageResource(lifeLessons[num]);
        }
        else if (imV.equals("adventure")){
            nI.setImageResource(adventure[num]);
        }
        else if (imV.equals("sifi")){
            nI.setImageResource(quotas[num]);
        }
        else if (imV.equals("success")){
            nI.setImageResource(success[num]);
        }
        else if (imV.equals("horror")){
            nI.setImageResource(horror[num]);
        }
        titleT.setText(stT);
        nT.setText(sto);
        index++;
        nexB.setOnClickListener(view -> {
            if (imV.equals("moral")){
                if (index!=12){
                    String[]st=getResources().getStringArray(R.array.mTitles);
                    String []fs=getResources().getStringArray(R.array.mfs);
                    nI.setImageResource(morals[index]);
                    titleT.setText(st[index]);
                    nT.setText(fs[index]);
                    scrollView.setScrollY(0);
                    index++;
                }
                else{
                    Toast.makeText(this, "you reach the end", Toast.LENGTH_LONG).show();
                }

            }
            else if (imV.equals("life lessons")){
                if (index!=8){
                    String[]st=getResources().getStringArray(R.array.loveT);
                    String []fs=getResources().getStringArray(R.array.loveFs);
                    nI.setImageResource(lifeLessons[index]);
                    titleT.setText(st[index]);
                    nT.setText(fs[index]);
                    scrollView.setScrollY(0);
                    index++;
                }
                else{
                    Toast.makeText(this, "you reach the end", Toast.LENGTH_LONG).show();
                }
            }
            else if (imV.equals("sifi")){
                if (index!=3){
                    String[]st=getResources().getStringArray(R.array.sifiT);
                    String []fs=getResources().getStringArray(R.array.sifiFs);
                    nI.setImageResource(quotas[index]);
                    titleT.setText(st[index]);
                    nT.setText(fs[index]);
                    scrollView.setScrollY(0);
                    index++;
                }
                else{
                    Toast.makeText(this, "you reach the end", Toast.LENGTH_LONG).show();
                }

            }

        });

    }
}
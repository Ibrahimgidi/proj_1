package com.example.projectone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btdepthead,btstudent,btteacher,btstoremanger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**initalize button*/
        btdepthead=(Button) findViewById(R.id.btdepthead);
        btstoremanger=(Button) findViewById(R.id.btstoremanager);
        btstudent=(Button) findViewById(R.id.btstudent);
        btteacher=(Button) findViewById(R.id.btteacher);
        btdepthead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openActivity(1);
            }
        });
        btstoremanger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity(2);
            }
        });

        btteacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity(3);
            }
        });
        btstudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity(4);
            }
        });
    }
    public void  openActivity(int num){
        if(num==1){
        Intent intent=new Intent(this,dptActivity.class);
        startActivity(intent);
        }
        else if(num==2){
            Intent intent=new Intent(this,StoreActivity.class);
            startActivity(intent);
        }
        else if(num==3){
            Intent intent=new Intent(this,TeacherActivity.class);
            startActivity(intent);
        }
        else if(num==4){
            Intent intent=new Intent(this,StudentActivity.class);
            startActivity(intent);
        }

    }

}

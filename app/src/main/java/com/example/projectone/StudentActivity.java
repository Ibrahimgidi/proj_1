package com.example.projectone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StudentActivity extends AppCompatActivity {
    private EditText stetusername,stetpassword;
    private Button stbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        stetusername=(EditText) findViewById(R.id.stetusername);
        stetpassword=(EditText) findViewById(R.id.stetpassword);
        stbutton=(Button) findViewById(R.id.stbutton);
        stbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(stetusername.getText().toString(),stetpassword.getText().toString());
            }
        });
    }
    private void validate(String username, String userpassword){
        if((username.equals("student"))&&(userpassword.equals("3333"))){
            Intent intent=new Intent(this,sthomepage.class);
            startActivity(intent);

        }
        else{
            Toast.makeText(this, "Login faild try again", Toast.LENGTH_SHORT).show();
        }

    }
}

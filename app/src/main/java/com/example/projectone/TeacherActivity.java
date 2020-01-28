package com.example.projectone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TeacherActivity extends AppCompatActivity {
    private EditText tcetusername,tcetpassword;
    private Button tcbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
        tcetusername=(EditText) findViewById(R.id.etusername);
        tcetpassword=(EditText) findViewById(R.id.etuserpassword);
        tcbutton=(Button) findViewById(R.id.button3);
        tcbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(tcetusername.getText().toString(),tcetpassword.getText().toString());
            }
        });
    }
    private void validate(String username, String userpassword){
        if((username.equals("teacher"))&&(userpassword.equals("2222"))){
            Intent intent=new Intent(this,teacherhomepage.class);
            startActivity(intent);

        }
        else{
            Toast.makeText(this, "Login faild try again", Toast.LENGTH_SHORT).show();
        }

    }
}

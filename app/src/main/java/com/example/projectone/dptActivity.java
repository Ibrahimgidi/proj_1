package com.example.projectone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class dptActivity extends AppCompatActivity {

    private EditText etusername,etuserpassword;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dpt);
        etusername =(EditText) findViewById(R.id.etusername);
        etuserpassword =(EditText) findViewById(R.id.etuserpassword);
        button3= (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(etusername.getText().toString(),etuserpassword.getText().toString());
            }
        });
    }

    private void validate(String username, String userpassword){
        if((username.equals("dpthead"))&&(userpassword.equals("1111"))){
            Intent intent=new Intent(this,dpthomepage.class);
            startActivity(intent);

        }
        else{
            Toast.makeText(this, "Login faild try again", Toast.LENGTH_SHORT).show();
        }

    }
}

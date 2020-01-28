package com.example.projectone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StoreActivity extends AppCompatActivity {
    private EditText stoetusername,stoetpassword;
    private Button stobutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        stoetusername=(EditText) findViewById(R.id.etusername);
        stoetpassword=(EditText) findViewById(R.id.etuserpassword);
        stobutton=(Button) findViewById(R.id.button3);
        stobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(stoetusername.getText().toString(),stoetpassword.getText().toString());
            }
        });

    }
    private void validate(String username, String userpassword){
        if((username.equals("store"))&&(userpassword.equals("4444"))){
            Intent intent=new Intent(this,storehome.class);
            startActivity(intent);

        }
        else{
            Toast.makeText(this, "Login faild try again", Toast.LENGTH_SHORT).show();
        }

    }
}

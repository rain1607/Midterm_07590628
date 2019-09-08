package com.example.midterm07590628;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    private static final String EMAIL = "bbb";
    private static final String PASSWORD = "222";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button loginbuttom =findViewById(R.id.loginnnbutton);

        loginbuttom.setOnClickListener(new View.OnClickListener() {
            Toast t=Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT);

            @Override
            public void onClick(View view) {
                EditText eamieditText=findViewById(R.id.usernameeditText);
                EditText paswordeditText=findViewById(R.id.passwordeditText2);

                String inputuser=eamieditText.getText().toString();
                String inputpasword=paswordeditText.getText().toString();


                if(inputuser.equals("bbb")&&inputpasword.equals("222")) {
                    Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
                    startActivity(intent);
                }
                else if(inputuser.equals("aaa")&&inputpasword.equals("111")) {
                    Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
                    startActivity(intent);
                }
                else{
                    AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);
                    dialog.setTitle("Error");
                    dialog.show();

                }


            }


        });
    }
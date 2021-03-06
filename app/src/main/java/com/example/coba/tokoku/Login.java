package com.example.coba.tokoku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.text.TextUtils;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    Button btnlogin;
    EditText username, password;
    TextView text3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnlogin =(Button) findViewById(R.id.btnlogin);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        text3 = (TextView) findViewById(R.id.text3);

        btnlogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String uname = username.getText().toString();
                String pass = password.getText().toString();
                if(TextUtils.isEmpty(uname)){
                    username.setError("Username tidak boleh kosong");
                    return;
                } else if(TextUtils.isEmpty(pass)){
                    password.setError("Password tidak boleh kosong");
                    return;
                }
                Intent i =null;
                i = new
                        Intent(Login.this, Welcome.class);
                Bundle
                        b = new Bundle();
                b.putString("parse_uname", uname);
                b.putString("parse_pass", pass);
                ((Intent) i).putExtras(b);
                startActivity(i);
            }
        });

        text3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = null;
                i = new
                        Intent(Login.this, Register.class);
                Bundle
                        b = new Bundle();
                ((Intent) i).putExtras(b);
                startActivity(i);
            }
        });
    }
}

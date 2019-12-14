package com.example.coba.tokoku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    Button btnregister;
    EditText regusername, regpassword, regconfpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnregister = (Button) findViewById(R.id.btnregister);
        regusername = (EditText) findViewById(R.id.regusername);
        regpassword = (EditText) findViewById(R.id.regpassword);
        regconfpassword = (EditText) findViewById(R.id.regconfpassword);

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String reguname = regusername.getText().toString();
                String regpass = regpassword.getText().toString();
                String regconfpass = regconfpassword.getText().toString();
                if (TextUtils.isEmpty(reguname)) {
                    regusername.setError("Username harus terisi");
                    return;
                } else if (TextUtils.isEmpty(regpass)){
                    regpassword.setError("Password harus terisi");
                    return;
                } else if (TextUtils.isEmpty(regconfpass)){
                    regconfpassword.setError("Password harus terisi");
                    return;
                }
                Intent i = null;
                i = new
                        Intent(Register.this, Login.class);
                Bundle
                        b = new Bundle();
                b.putString("parse_reguname", reguname);
                b.putString("parse_regpass", regpass);
                b.putString("parse_regconfpass", regconfpass);
                ((Intent) i).putExtras(b);
                startActivity(i);
            }
        });
    }
}

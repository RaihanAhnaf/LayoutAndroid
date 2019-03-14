package com.example.coba.tokoku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
    TextView txtuname;
    String get_uname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        txtuname = (TextView) findViewById(R.id.txtuname);

        Bundle b = getIntent().getExtras();
        get_uname = b.getString("parse_uname");

        txtuname.setText(""+get_uname);
    }
}

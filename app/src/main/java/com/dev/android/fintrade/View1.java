package com.dev.android.fintrade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class View1 extends AppCompatActivity {

    LinearLayout rg_btn,lg_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view1);

        rg_btn=findViewById(R.id.register_btn);
        lg_btn=findViewById(R.id.login_btn);

        rg_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(View1.this,SignUp.class);
                startActivity(intent);

            }
        });
        lg_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(View1.this,SignIn.class);
                startActivity(intent);
            }
        });
    }
}
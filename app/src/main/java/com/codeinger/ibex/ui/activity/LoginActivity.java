package com.codeinger.ibex.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.codeinger.ibex.R;

public class LoginActivity extends AppCompatActivity {

    private Button next;
    private EditText edit1,edit2,edit3,edit4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        next = findViewById(R.id.next);

        edit1 = findViewById(R.id.number1);
        edit2 = findViewById(R.id.number2);
        edit3 = findViewById(R.id.number3);
        edit4 = findViewById(R.id.number4);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, VerificationActivity.class));
            }
        });


    }
}

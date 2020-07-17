package com.codeinger.ibex.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.codeinger.ibex.R;
import com.codeinger.ibex.ui.adapter.CardAdapter;
import com.codeinger.ibex.ui.adapter.DigitalPaymentAdapter;

import java.util.ArrayList;
import java.util.List;

public class CheckoutActivity extends AppCompatActivity {

    RecyclerView card,digital;
    private Toolbar toolbar;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CheckoutActivity.this,PaymentSuccessfulActivity.class));
            }
        });


        card = findViewById(R.id.card);
        digital = findViewById(R.id.digital);

        card.setLayoutManager(new LinearLayoutManager(this));
        digital.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));

        card.setAdapter(new CardAdapter(getService()));
        digital.setAdapter(new DigitalPaymentAdapter(getService1()));

    }

    private List<String> getService() {
        List<String> list = new ArrayList<>();
        list.add("");
        list.add("");
        list.add("");
        return list;
    }

    private List<String> getService1() {
        List<String> list = new ArrayList<>();
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        return list;
    }
}

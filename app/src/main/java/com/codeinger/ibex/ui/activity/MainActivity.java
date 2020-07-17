package com.codeinger.ibex.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;

import com.codeinger.ibex.R;
import com.codeinger.ibex.ui.fragment.CategoryFragment;
import com.codeinger.ibex.ui.fragment.HomeFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        replace(new HomeFragment(),"HomeFragment");
    }

    void replace(Fragment fragment, String backstack) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
       // ft.addToBackStack(backstack);
        ft.replace(R.id.frame, fragment,backstack);
        ft.commit();
    }

}

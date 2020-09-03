package com.example.vorony;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        LinearLayout ll = new LinearLayout(this);
        final TextView a = new TextView(this);
        Button hi = new Button(this);
        hi.setText("Say hello to my little friend!");
        Button pluser = new Button(this);
        pluser.setText("Count plus one");
        ll.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER;
        a.setLayoutParams(params);
        hi.setLayoutParams(params);
        pluser.setLayoutParams(params);
        ll.addView(a);
        ll.addView(hi);
        ll.addView(pluser);
    setContentView(ll);
        hi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText("*minigan sounds*");
            }
        });
        pluser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText("There is " + ++counter);
            }
        });

    }
}
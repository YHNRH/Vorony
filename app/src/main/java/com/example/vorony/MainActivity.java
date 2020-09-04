package com.example.vorony;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

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
        Button minuser = new Button(this);
        minuser.setText("Count minus one");

        final EditText ed = new EditText(this);
        ed.setHint("Bведите Ваше имя");

        Button insert = new Button(this);
        insert.setText("Поздороваться");

        Button sub = new Button(this);
        sub.setText("Нажми на меня");

        TimePicker mTimePicker = new TimePicker(this);

        Calendar now = Calendar.getInstance();

        mTimePicker.setCurrentHour(now.get(Calendar.HOUR_OF_DAY));
        mTimePicker.setCurrentMinute(now.get(Calendar.MINUTE));


        ll.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.gravity = Gravity.CENTER;
        a.setLayoutParams(params);
        hi.setLayoutParams(params);
        pluser.setLayoutParams(params);
        minuser.setLayoutParams(params);
        sub.setLayoutParams(params);
       ll.addView(a);
       ll.addView(hi);
       ll.addView(pluser);
       ll.addView(minuser);
       ll.addView(ed);
        ll.addView(insert);
      ll.addView(sub);

        ll.addView(mTimePicker);

        ScrollView sv = new ScrollView(this);
        sv.addView(ll);
        setContentView(sv);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast t = Toast.makeText(getApplicationContext(), "Sub", Toast.LENGTH_LONG);
                t.setGravity(Gravity.TOP,0,160);
                t.show();
            }
        });


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
        minuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText("There is " + --counter);
            }
        });

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText("Здравствуйте, " + ed.getText());
            }
        });



    }


}
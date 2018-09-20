package com.medipack.otp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

   Button signout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signout=findViewById(R.id.buttonSignOut);

        signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent Intent= new Intent(MainActivity.this,.class);
               // startActivity(Intent);

            }
        });
    }
}

package com.ahmedgraf.saadiqbal.tanhaikaysafarbook;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
    private static int timeq=3000;
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        t1 = (TextView)findViewById(R.id.text1_splash);
        t2 = (TextView)findViewById(R.id.text2_splash);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/mnw.ttf");
        t1.setTypeface(typeface);t2.setTypeface(typeface);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Splash.this,BookScreenMain.class);
                startActivity(intent);
                finish();
            }
        },timeq);
    }
}

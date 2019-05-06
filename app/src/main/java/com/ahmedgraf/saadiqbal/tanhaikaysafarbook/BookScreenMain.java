package com.ahmedgraf.saadiqbal.tanhaikaysafarbook;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BookScreenMain extends AppCompatActivity {

    Button b1;
    TextView t2,t1,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_screen_main);
        b1 = (Button)findViewById(R.id.btn_read_bookscreen);
        t2 = (TextView) findViewById(R.id.text_agcslink);
        t1 = (TextView)findViewById(R.id.text1_bookscreen);
        t3 = (TextView)findViewById(R.id.text1_authorname);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/mnw.ttf");
        t1.setTypeface(typeface);

        t2.setMovementMethod(LinkMovementMethod.getInstance());
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(BookScreenMain.this,FirstBookIndex.class);
                startActivity(n);
            }
        });
    }
}

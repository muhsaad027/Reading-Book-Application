package com.ahmedgraf.saadiqbal.tanhaikaysafarbook;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class ReaderBook extends AppCompatActivity implements View.OnClickListener {

    TextView bookchapte,heading,textt;
    ImageView back,nextchap,prevchap,home;
    Bundle b = new Bundle();
    String filename,headingchapter;
    private int size = 25;
    ImageView zoomin,zoomout;
    ArrayList<Item> itemsList;
    String indexpagecall,boook;
    EditText editText;
    int temp;
    int currentPosition ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reader_book);
        heading = (TextView) findViewById(R.id.textView);
        bookchapte = (TextView) findViewById(R.id.bookcahper);
        back = (ImageView)findViewById(R.id.backindex);
        textt = (TextView) findViewById(R.id.textViewheading);
        zoomin = (ImageView)findViewById(R.id.zoomin) ;
        zoomout = (ImageView)findViewById(R.id.zoomout) ;
        zoomout.setOnClickListener(this);
        zoomin.setOnClickListener(this);
        back.setOnClickListener(this);
        nextchap = (ImageView)findViewById(R.id.forwardtoforward);
        prevchap = (ImageView)findViewById(R.id.backtoback);
        home = (ImageView)findViewById(R.id.homescreen);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/mnw.ttf");
        bookchapte.setTypeface(typeface);
        textt.setTypeface(typeface);
        itemsList=new ArrayList<>();



        b = getIntent().getExtras();
        filename = b.getString("file");
        indexpagecall = b.getString("class");
        headingchapter = b.getString("headings");
        currentPosition = b.getInt("itemPosition");
        boook = b.getString("bookname");
        heading.setText(headingchapter);
        //////////////////////////////////////
        if(boook.equals("Dewan-e-Ghalib")) {
            itemsList.add(new Item("مصنف کے بارے میں","00-musnnif.txt",false));
            itemsList.add(new Item("پیش لفظ","00.txt",false));
            itemsList.add(new Item("تہ","01.txt",false));
            itemsList.add(new Item("شام","02.txt",false));
            itemsList.add(new Item("شجر","03.txt",false));
            itemsList.add(new Item("زمیں کی رات","04.txt",false));
            itemsList.add(new Item("حاملہ","05.txt",false));
            itemsList.add(new Item("سرد رات","06.txt",false));
            itemsList.add(new Item("شاید","07.txt",false));
            itemsList.add(new Item("آستانہ","08.txt",false));
            itemsList.add(new Item("تنزّل","09.txt",false));
            itemsList.add(new Item("جرم","10.txt",false));
            itemsList.add(new Item("جنگل","11.txt",false));
            itemsList.add(new Item("تلاش","12.txt",false));
            itemsList.add(new Item("گھات","13.txt",false));
            itemsList.add(new Item("زائیدہ","14.txt",false));
            itemsList.add(new Item("برف","15.txt",false));
            itemsList.add(new Item("پیغمبر","16.txt",false));
            itemsList.add(new Item("اے ہوا","17.txt",false));
            itemsList.add(new Item("مقصود علی دیوانہؔ","18.txt",false));
            itemsList.add(new Item("مسافر","19.txt",false));
            itemsList.add(new Item("دو دنیائیں","20.txt",false));
            itemsList.add(new Item("ماں","21.txt",false));
            itemsList.add(new Item("محراب","22.txt",false));
            itemsList.add(new Item("سلطان","23.txt",false));
            itemsList.add(new Item("افلاک زدہ","24.txt",false));
            itemsList.add(new Item("صبح","25.txt",false));
            itemsList.add(new Item("گناہ","26.txt",false));
            itemsList.add(new Item("تقلیب","27.txt",false));
            itemsList.add(new Item("سلطان","28.txt",false));
            itemsList.add(new Item("مقصود علی دیوانہؔ","29.txt",false));
            itemsList.add(new Item("بہنیں","30.txt",false));
            itemsList.add(new Item("پھول","31.txt",false));
            itemsList.add(new Item("نقاب","32.txt",false));
            itemsList.add(new Item("حُجّت","33.txt",false));
            itemsList.add(new Item("سراب","34.txt",false));
            itemsList.add(new Item("شہر","35.txt",false));
            itemsList.add(new Item("آنکھ","36.txt",false));
            itemsList.add(new Item("بوڑھا","37.txt",false));
            itemsList.add(new Item("تصویر","38.txt",false));
            itemsList.add(new Item("مقاومت","39.txt",false));
            itemsList.add(new Item("اے ہم سفرو!","40.txt",false));
            itemsList.add(new Item("بھوت","41.txt",false));
            itemsList.add(new Item("جاڑا","42.txt",false));
            itemsList.add(new Item("ڈاکہ","43.txt",false));
            itemsList.add(new Item("بارش","44.txt",false));
            itemsList.add(new Item("مقصود علی دیوانہؔ","45.txt",false));
            itemsList.add(new Item("جوگی","46.txt",false));
            itemsList.add(new Item("تذلیل","47.txt",false));
            itemsList.add(new Item("درگاہ","48.txt",false));
            itemsList.add(new Item("تیس مار خاں","49.txt",false));
            itemsList.add(new Item("دعوتِ مغلیہ","50.txt",false));
            itemsList.add(new Item("کیوں؟","51.txt",false));
            itemsList.add(new Item("دل","52.txt",false));
            itemsList.add(new Item("چاندی کا پنجہ","53.txt",false));
            itemsList.add(new Item("بوڑھا","54.txt",false));
            itemsList.add(new Item("بِکری","55.txt",false));
            itemsList.add(new Item("خوف","56.txt",false));
            itemsList.add(new Item("ملن","57.txt",false));
            itemsList.add(new Item("راز","58.txt",false));
            itemsList.add(new Item("بربط","59.txt",false));
            itemsList.add(new Item("کھیل","60.txt",false));
            itemsList.add(new Item("سوال","61.txt",false));
            itemsList.add(new Item("دُور کی شہزادی","62.txt",false));
            itemsList.add(new Item("تخلیق","63.txt",false));
            itemsList.add(new Item("دائرے","64.txt",false));
            itemsList.add(new Item("قبرستان","65.txt",false));
            itemsList.add(new Item("عذاب","66.txt",false));
            itemsList.add(new Item("ہمالہ","67.txt",false));
            itemsList.add(new Item("سہ سطورے","",true));
            itemsList.add(new Item("سوختہ","68.txt",false));
            itemsList.add(new Item("تعاقب","69.txt",false));
            itemsList.add(new Item("زندگی","70.txt",false));
            itemsList.add(new Item("سِتار","71.txt",false));
            itemsList.add(new Item("تیرگی","72.txt",false));
            itemsList.add(new Item("بہار","73.txt",false));
            itemsList.add(new Item("طلسم","74.txt",false));
            itemsList.add(new Item("بادل","75.txt",false));
            itemsList.add(new Item("احتیاط","76.txt",false));
            itemsList.add(new Item("دھوکہ","77.txt",false));
            itemsList.add(new Item("صدا","78.txt",false));
            itemsList.add(new Item("تراجم","",true));
            itemsList.add(new Item("مماثلتیں(۱)","79.txt",false));
            itemsList.add(new Item("ایلباٹراس(۱)","80.txt",false));
            itemsList.add(new Item("آہنگ شام(۱)","81.txt",false));
            itemsList.add(new Item("اجنبی ساحل کی خوشبو(۱)","82.txt",false));
            itemsList.add(new Item("اے مقدس میری تنہائی(۱)","83.txt",false));
            itemsList.add(new Item("شیون(۱)","84.txt",false));
            itemsList.add(new Item("فرشتے(۱)","85.txt",false));
            itemsList.add(new Item("جارج ٹریکل (Georg Trakl)","86.txt",false));
            itemsList.add(new Item("تابستان (۱)","87.txt",false));
            itemsList.add(new Item("فراغ و سکوت(۱)","88.txt",false));
            itemsList.add(new Item("سورج(۱)","89.txt",false));
            itemsList.add(new Item("امبیرٹو سابا (Umberto Saba)","90.txt",false));
            itemsList.add(new Item("بَکری","91.txt",false));
            itemsList.add(new Item("مشقّت","92.txt",false));
            itemsList.add(new Item("مبتلا گلاب(۱)","93.txt",false));
            itemsList.add(new Item("مشاہیر کی آرا","94-aara.txt",false));


            temp = 3;

        }
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(ReaderBook.this,BookScreenMain.class);
                startActivity(n);
            }
        });
        nextchap.setOnClickListener(this);
        prevchap.setOnClickListener(this);
        /*back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(ReaderBook.this,indexpagecall.getClass());
                startActivity(n);
            }
        });*/
        String content = "";
        Log.d("file   name",filename);
        try {
            InputStream is = getAssets().open(filename);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            content = new String(buffer);
            bookchapte.setText(content);
        } catch (IOException e) {
            Log.e("ReaderBook",""+e.getLocalizedMessage());
            e.printStackTrace();
        }

        bookchapte.setTypeface(typeface);
        heading.setTypeface(typeface);
    }

    private void fileRead(int position)
    {
        String content = "";
        Log.d("file   name",filename);
        try {
            InputStream is = getAssets().open(itemsList.get(position).getFileName());
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            content = new String(buffer);
            bookchapte.setText(content);
        } catch (IOException e) {
            Log.e("ReaderBook",""+e.getLocalizedMessage());
            e.printStackTrace();
        }
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/mnw.ttf");
        bookchapte.setTypeface(typeface);
        heading.setTypeface(typeface);
        heading.setText(itemsList.get(position).getIndex());


    }
    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.forwardtoforward:
                if(currentPosition < itemsList.size()  -1 ) {
                    currentPosition++;
                    if(itemsList.get(currentPosition).getType()) {
                        if (currentPosition < itemsList.size() - 1)
                            currentPosition++;
                    }
                    else
                        fileRead(currentPosition);
                }
                break;
            case R.id.backtoback:
                if(currentPosition >0 ) {
                    currentPosition--;
                    if(itemsList.get(currentPosition).getType()) {
                        if (currentPosition  > 0)
                            currentPosition--;
                    }
                    else
                        fileRead(currentPosition);

                }
                break;
            case  R.id.backindex:
               Intent i = new Intent(ReaderBook.this,FirstBookIndex.class);
                 startActivity(i);
                break;
            case R.id.zoomin:
                if(bookchapte.getTextSize() > 80)
                {
                    // Toast.makeText(getApplicationContext(), "Font Size is Maximum", Toast.LENGTH_SHORT).show();
                }
                else {
                    size++;
                    bookchapte.setTextSize(size);
                }
                break;
            case R.id.zoomout:
                if(bookchapte.getTextSize() < 25)
                {
                    //Toast.makeText(getApplicationContext(), "Font Size is Minimun", Toast.LENGTH_SHORT).show();
                }
                else {
                    size--;
                    bookchapte.setTextSize(size);
                }
                break;
                    }

    }
}

package com.ahmedgraf.saadiqbal.tanhaikaysafarbook;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FirstBookIndex extends AppCompatActivity {

    TextView t2,ghazilayt,radif1,c1,c2,c3;
    ImageView home;
    ListView IndexBook;
    String name = "FirstBookIndex";
    ArrayList<Item> itemsList;
    /* private ListView mDrawerList;
     private DrawerLayout mDrawerLayout;
     private ArrayAdapter<String> mAdapter;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_book_index);

        Toolbar topToolBar = (Toolbar)findViewById(R.id.toolbar);
        setTitle("");
        setSupportActionBar(topToolBar);
        itemsList = new ArrayList<>();
        IndexBook = (ListView) findViewById(R.id.navlist2);
        c1 = (TextView) findViewById(R.id.id_hading);

        /*---------------------------------------*/

        itemsList.add(new Item("مصنف کے بارے میں","00-musnnif.txt",false));
        itemsList.add(new Item("مشاہیر کی آرا","94-aara.txt",false));
        itemsList.add(new Item("تنہائی کے تہوار","",true));
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


        /*---------------------------------------*/

        MyAdapter myAdapter=new MyAdapter(this,R.layout.item_row,itemsList);
        IndexBook.setAdapter(myAdapter);
        home = (ImageView)findViewById(R.id.homescreen);
        t2  = (TextView) findViewById(R.id.textheader);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/mnw.ttf");
        t2.setTypeface(typeface);
        c1.setTypeface(typeface);
        /*c1 = (TextView) findViewById(R.id.content1);
        c2 = (TextView) findViewById(R.id.content2);
        home = (ImageView)findViewById(R.id.homescreen);
        c3 = (TextView) findViewById(R.id.content3);


        c1.setTypeface(typeface);

        c2.setTypeface(typeface);
        c3.setTypeface(typeface);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(FirstBookIndex.this,ReaderBook.class);
                startActivity(n);
            }
        });*/
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(FirstBookIndex.this,BookScreenMain.class);
                startActivity(n);
            }
        });

        IndexBook.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int itemPosition, long l) {

                if(itemsList.get(itemPosition).getType()) {
                    return;
                }
                //Toast.makeText(FirstBookIndex.this,""+  itemsList.get(itemPosition).getFileName(),Toast.LENGTH_LONG).show();
                Intent i = new Intent(FirstBookIndex.this,ReaderBook.class);
                i.putExtra("file",""+itemsList.get(itemPosition).getFileName());
                i.putExtra("class",""+name);
                i.putExtra("itemPosition",itemPosition);
                i.putExtra("headings",""+itemsList.get(itemPosition).getIndex());
                i.putExtra("bookname","Dewan-e-Ghalib");
                startActivity(i);
            }
        });
       /* ghazilayt= (TextView) findViewById(R.id.ghazliyat_section);
        ghazilayt.setTypeface(typeface);
        radif1 = (TextView) findViewById(R.id.rdeefAlif);
        radif1.setTypeface(typeface);*/
      /*  IndexBook = (ListView)findViewById(R.id.navList1);*/

/*
        mDrawerList = (ListView)findViewById(R.id.navList1);
        addDrawerItems();
    }

    private void addDrawerItems()
    {
        String[] a = {"اس کتاب کے بارے میں","غالبؔ کی ردیف","حروفِ تہجی","اُردو حروف تہجی","حروف تہجی کا چارٹ","کلمات ِ تشکر"};
        mAdapter =  new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,a);
        mDrawerList.setAdapter(mAdapter);

    }*/
    }
}

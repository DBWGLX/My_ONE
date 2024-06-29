package com.example.my_one;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.DrawableRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.my_one.R;
public class MainActivity extends BaseActivity implements View.OnClickListener{
    int lastop = 1;
    LinearLayout option1;
    ImageView image1;
    LinearLayout option2;
    ImageView image2;
    LinearLayout option3;
    ImageView image3;
    LinearLayout option4;
    static int have_signed = 0;
    ImageView image4;
    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    protected void onCreate(Bundle savedInstancesState) {
        super.onCreate(savedInstancesState);
        setContentView(R.layout.activity_main);

        //获取视图 获取整体是为了按钮，获取图片是为了替换
        image1 = findViewById(R.id.icon1);
        option1 = findViewById(R.id.option1);
        image2 = findViewById(R.id.icon2);
        option2 = findViewById(R.id.option2);
        image3 = findViewById(R.id.icon3);
        option3 = findViewById(R.id.option3);
        image4 = findViewById(R.id.icon4);
        option4 = findViewById(R.id.option4);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);

        option1.setOnClickListener(this);
        option2.setOnClickListener(this);
        option3.setOnClickListener(this);
        option4.setOnClickListener(this);
        replaceFragment(new Option1());
    }
    @Override
    public void onClick(View v){
        if(lastop==1) {
            image1.setImageResource(R.drawable.a1);
            text1.setTypeface(null, Typeface.NORMAL);
        }
        else if(lastop==2) {
            image2.setImageResource(R.drawable.b1);
            text2.setTypeface(null, Typeface.NORMAL);
        }
        else if(lastop==3){
            image3.setImageResource(R.drawable.c1);
            text3.setTypeface(null, Typeface.NORMAL);
        }
        else if(lastop==4){
            image4.setImageResource(R.drawable.d1);
            text4.setTypeface(null, Typeface.NORMAL);
        }

        int aim = v.getId();
        if(aim == R.id.option1)
        {
            replaceFragment(new Option1());
            image1.setImageResource(R.drawable.a2);
            text1.setTypeface(null, Typeface.BOLD);
            lastop=1;
        }
        else if(aim == R.id.option2)
        {
            replaceFragment(new Option2());
            image2.setImageResource(R.drawable.b2);
            text2.setTypeface(null, Typeface.BOLD);
            lastop=2;
        }
        else if(aim == R.id.option3)
        {
            replaceFragment(new Option3());
            image3.setImageResource(R.drawable.c2);
            text3.setTypeface(null, Typeface.BOLD);
            lastop=3;
        }
        else if(aim == R.id.option4)
        {
            if(have_signed==0)
                replaceFragment(new Option4());
            else
                replaceFragment(new Option4_1());
            image4.setImageResource(R.drawable.d2);
            text4.setTypeface(null, Typeface.BOLD);
            lastop=4;
        }
    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment,fragment);
        transaction.commit();
    }
}

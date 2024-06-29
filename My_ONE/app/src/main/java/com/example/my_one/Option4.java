package com.example.my_one;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;

public class Option4 extends Fragment {
    private Button login;
    private ImageView login_in_WeChat;
    private ImageView login_in_WeiBo;
    private ImageView login_in_QQ;
    private CheckBox have_read;
    private TextView register;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.option4,container,false);

        login = (Button)view.findViewById(R.id.button_start);
        login_in_WeChat = (ImageView)view.findViewById(R.id.image_weChat);
        login_in_WeChat.setImageResource(R.drawable.weixin);
        login_in_WeiBo = (ImageView)view.findViewById(R.id.image_sina);
        login_in_WeiBo.setImageResource(R.drawable.sina);
        login_in_QQ = (ImageView)view.findViewById(R.id.image_QQ);
        login_in_QQ.setImageResource(R.drawable.qq);
        have_read = (CheckBox) view.findViewById(R.id.remember_pass);
        register = (TextView) view.findViewById(R.id.text_regester);
        //register.setText(Html.fromHtml("还没有账号？点击<u>注册</u>"));
        SpannableString spannableString = new SpannableString("还没有账号？点击注册");
        spannableString.setSpan(new UnderlineSpan(),8,10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        register.setText(spannableString);

        login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(have_read.isChecked()) {
                    Intent intent = new Intent(getActivity(), LoginActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Option4.super.getContext(), "请同意条款后再登录", Toast.LENGTH_LONG).show();
                }
            }

        });
        login_in_QQ.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(Option4.super.getContext(), "你点击了QQ登录方式", Toast.LENGTH_LONG).show();
            }

        });
        login_in_WeChat.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(Option4.super.getContext(), "你点击了WeChat登录方式", Toast.LENGTH_LONG).show();
            }

        });
        login_in_WeiBo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(Option4.super.getContext(), "你点击了Sina登录方式", Toast.LENGTH_LONG).show();
            }

        });
        register.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(Option4.super.getContext(), "你点击了注册", Toast.LENGTH_LONG).show();
            }

        });

        return view;
    }
}

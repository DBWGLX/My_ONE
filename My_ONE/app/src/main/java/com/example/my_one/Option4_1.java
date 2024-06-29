package com.example.my_one;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Option4_1 extends Fragment {
    private TextView exit;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.option4_1_log_success,container,false);
        exit = view.findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.have_signed = 0;
                Intent intent = new Intent("com.example.my_campus.FORCE_OFFLINE");
                Option4_1.super.getContext().sendBroadcast(intent);
            }
        });
        return view;
    }
}

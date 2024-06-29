package com.example.my_one;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Option2_1_1 extends Fragment {
    private List<member2_1> memberlist = new ArrayList<>();
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.option2,container,false);

        initmembers();

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view1);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        Member2_1Adapter adapter = new Member2_1Adapter(memberlist,(FragmentActivity) getContext());
        recyclerView.setAdapter(adapter);

        return view;
    }
    private void initmembers(){
        member2_1 m1 = new member2_1("阅读");
        memberlist.add(m1);
        member2_1 m2 = new member2_1("日签");
        memberlist.add(m2);
        member2_1 m3 = new member2_1("专题");
        memberlist.add(m3);
        member2_1 m4 = new member2_1("问答");
        memberlist.add(m4);
        member2_1 m5 = new member2_1("长篇");
        memberlist.add(m5);
    }
}

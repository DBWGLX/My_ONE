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

public class Option3 extends Fragment {
    private List<member3> memberlist = new ArrayList<>();
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.option1,container,false);

        initmembers();

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view1);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        Member3Adapter adapter = new Member3Adapter(memberlist,(FragmentActivity) getContext());
        recyclerView.setAdapter(adapter);

        return view;
    }

    private void initmembers(){
        member3 m1 = new member3(R.drawable.cat,R.drawable.up1);
        memberlist.add(m1);
        member3 m2 = new member3(R.drawable.paidaxing,R.drawable.up2);
        memberlist.add(m2);
        memberlist.add(m2);
        memberlist.add(m2);
        memberlist.add(m2);
    }
}

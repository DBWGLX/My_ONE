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

public class Option1 extends Fragment {
    private List<member1> memberlist = new ArrayList<>();
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.option1,container,false);

        initmembers();

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view1);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);

        Member1Adapter adapter = new Member1Adapter(memberlist,(FragmentActivity) getContext());
        recyclerView.setAdapter(adapter);

        return view;
    }

    private void initmembers(){
        member1 m1 = new member1("一旦只追求结果，人就容易想方设法抄近路。在抄近路的过程中，人又容易迷失真相",R.drawable.nero);
        memberlist.add(m1);
        member1 m2 = new member1("我觉得是这样的，不要觉得 35 岁、40 岁会是一个坎。我今天也在写代码，有句话是这么说的：“人不是因为变老了才没有热情，而是因为没有热情才会变老。”\n" +
                "有的人说我老了，我学不动了。不是的，因为你学不动，你才变老了；不是你老了，你才学不动。这个世界上有大量这样本末倒置的因果关系的逻辑，如果你学得动，或者你还对这个事情充满憧憬，有想法，愿意去奋斗的话，70 岁你都不老。",R.drawable.chenhao);
        memberlist.add(m2);
        memberlist.add(m2);
        memberlist.add(m2);
        memberlist.add(m2);
        memberlist.add(m2);
    }
}

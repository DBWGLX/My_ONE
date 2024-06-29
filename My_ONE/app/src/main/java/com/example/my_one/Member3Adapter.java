package com.example.my_one;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Member3Adapter extends RecyclerView.Adapter<Member3Adapter.ViewHolder>{
    private List<member3>mNCList;
    private FragmentActivity mActivity;

    static class ViewHolder extends RecyclerView.ViewHolder{
        View fruitView;
        ImageView Image1;
        ImageView Image2;
        public ViewHolder(View view){
            super(view);
            fruitView = view;
            Image1 = (ImageView) view.findViewById(R.id.image1);
            Image2 = (ImageView) view.findViewById(R.id.image2);
        }
    }

    public Member3Adapter(List<member3> NClist, FragmentActivity activity)
    {
        mNCList = NClist;
        mActivity = activity;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType)
    {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.member3,parent,false);
        final ViewHolder holder = new ViewHolder(view);
        holder.fruitView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                member3 nc = mNCList.get(position);
                //Toast.makeText(v.getContext(),"you clicked view " + nc.getContext(),Toast.LENGTH_LONG).show();
            }
        });
        return holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder,int position){
        member3 nc = mNCList.get(position);
        holder.Image1.setImageResource(nc.getImageId1());
        holder.Image2.setImageResource(nc.getImageId2());
    }

    @Override
    public int getItemCount(){
        return mNCList.size();
    }
}

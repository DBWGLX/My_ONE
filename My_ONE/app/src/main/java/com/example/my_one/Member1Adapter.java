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

public class Member1Adapter extends RecyclerView.Adapter<Member1Adapter.ViewHolder>{
    private List<member1>mNCList;
    private FragmentActivity mActivity;

    static class ViewHolder extends RecyclerView.ViewHolder{
        View fruitView;
        ImageView NCImage;
        TextView NCName;
        public ViewHolder(View view){
            super(view);
            fruitView = view;
            NCImage = (ImageView) view.findViewById(R.id.image1);
            NCName = (TextView) view.findViewById(R.id.text1);
        }
    }

    public Member1Adapter(List<member1> NClist, FragmentActivity activity)
    {
        mNCList = NClist;
        mActivity = activity;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType)
    {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.member1,parent,false);
        final ViewHolder holder = new ViewHolder(view);
        holder.fruitView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                member1 nc = mNCList.get(position);
                Toast.makeText(v.getContext(),"you clicked view " + nc.getContext(),Toast.LENGTH_LONG).show();
            }
        });
        return holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder,int position){
        member1 nc = mNCList.get(position);
        holder.NCImage.setImageResource(nc.getImageId());
        holder.NCName.setText(nc.getContext());
    }

    @Override
    public int getItemCount(){
        return mNCList.size();
    }
}

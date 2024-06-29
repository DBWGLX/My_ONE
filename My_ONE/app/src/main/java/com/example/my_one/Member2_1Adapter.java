package com.example.my_one;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Member2_1Adapter extends RecyclerView.Adapter<Member2_1Adapter.ViewHolder>{
    private List<member2_1>mNCList;
    private FragmentActivity mActivity;

    static class ViewHolder extends RecyclerView.ViewHolder{
        View fruitView;
        //ImageView NCImage;
        TextView NCName;
        public ViewHolder(View view){
            super(view);
            fruitView = view;
            //NCImage = (ImageView) view.findViewById(R.id.image1);
            NCName = (TextView) view.findViewById(R.id.text1);
        }
    }

    public Member2_1Adapter(List<member2_1> NClist, FragmentActivity activity)
    {
        mNCList = NClist;
        mActivity = activity;
    }
    public int selectedItem = 0;
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType)
    {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.member2_1,parent,false);
        final ViewHolder holder = new ViewHolder(view);

        holder.fruitView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                member2_1 nc = mNCList.get(position);//第几个
                //直接重绑子项
                int previousItem = selectedItem;
                selectedItem = position;
                notifyItemChanged(previousItem); // 更新之前选中项
                notifyItemChanged(position); // 更新当前选中项

                //Toast.makeText(v.getContext(),"you clicked view " + nc.getContext(),Toast.LENGTH_LONG).show();
                if(nc.getContext()=="阅读") {

                }
                else if(nc.getContext()=="日签") {

                }
                else if(nc.getContext()=="专题") {

                }
                else if(nc.getContext()=="问答") {

                }
                else if(nc.getContext()=="长篇") {

                }
            }
        });
        return holder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder,int position){
        member2_1 nc = mNCList.get(position);
        holder.NCName.setText(nc.getContext());
        if (selectedItem == position) {
            holder.NCName.setTextColor(Color.BLACK); // 选中项字体变黑
        } else {
            holder.NCName.setTextColor(Color.GRAY); // 非选中项恢复原色
        }
    }

    @Override
    public int getItemCount(){
        return mNCList.size();
    }
}

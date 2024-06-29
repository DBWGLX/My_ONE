package com.example.my_one;

public class member1 {
    private String context;
    private int imageId;
    public member1(String context,int imageId)
    {
        this.context = context;
        this.imageId = imageId;
    }
    public String getContext(){
        return context;
    }
    public int getImageId(){return imageId;}
}

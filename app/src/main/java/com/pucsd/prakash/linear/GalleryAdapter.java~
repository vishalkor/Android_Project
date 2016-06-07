package com.pucsd.prakash.linear;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/*
All images are stored in drawble
*/
public class GalleryAdapter extends PagerAdapter {
    private int[] imageResources={R.drawable.dept,R.drawable.pu,R.drawable.cs_department,R.drawable.link,R.drawable.about,R.drawable.cells};
    private Context ctx;
    private LayoutInflater layoutInflater;

    public GalleryAdapter(Context ctx){
        this.ctx=ctx;
    }
    @Override
    public int getCount() {
        return imageResources.length;
    }
    
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }
    
    @Override
    public Object instantiateItem(ViewGroup container,int position){
        layoutInflater=(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView=layoutInflater.inflate(R.layout.swipelayout,container,false);
        ImageView imageView=(ImageView)itemView.findViewById(R.id.image_view);
        TextView textView= (TextView)itemView.findViewById(R.id.image_content);
        imageView.setImageResource(imageResources[position]);
        textView.setText("Image:" + position);
        container.addView(itemView);
        return itemView;
    }
    @Override
    public void destroyItem(ViewGroup container,int position,Object object){
        container.removeView((LinearLayout)object);
    }
}

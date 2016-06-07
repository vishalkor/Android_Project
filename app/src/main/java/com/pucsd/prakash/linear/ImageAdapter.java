package com.pucsd.prakash.linear;

import android.content.Context;
import android.view.ContextMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/*
Use of ImageAdapter, ImageView
*/
public class ImageAdapter extends BaseAdapter {
    private Context CTX;
    private Integer image_id[]={R.drawable.admissions,
            R.drawable.cells,
            R.drawable.courses,
            R.drawable.events,
            R.drawable.foto,
            R.drawable.dining,
            R.drawable.lib,
            R.drawable.news,
            R.drawable.map,
            R.drawable.about,
            R.drawable.link
    };

    public ImageAdapter (Context CTX) {
        this.CTX = CTX;
    }

    @Override
    public int getCount() {
        return image_id.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView img;
        if(view == null) {
            img = new ImageView(CTX);
            img.setLayoutParams(new GridView.LayoutParams(160,160));
            img.setScaleType(ImageView.ScaleType.CENTER_CROP);
            img.setPadding(8, 8, 8, 8);
        }
        else {
            img = (ImageView) view;
        }
        img.setImageResource(image_id[i]);
        return img;
    }
}

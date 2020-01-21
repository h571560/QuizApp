package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class ActivityShowAll extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_all);

         ArrayList<View> imageList = new ArrayList<View>();
         imageList.add(findViewById(R.id.img1));
         imageList.add(findViewById(R.id.img2));
         imageList.add(findViewById(R.id.img3));

         for(int i=0; i<imageList.size();i++){
             int imageresource = getResources().getIdentifier("@drawable/img1",null,this.getPackageName());
             ((ImageView)imageList.get(i)).setImageResource(imageresource);
         }



    }
}

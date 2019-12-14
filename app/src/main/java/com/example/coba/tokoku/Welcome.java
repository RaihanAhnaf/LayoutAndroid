package com.example.coba.tokoku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Welcome extends AppCompatActivity {

    ViewFlipper v_flipper;
    private int[] images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        int images[] = {R.drawable.slide1, R.drawable.slide2, R.drawable.slide3};
        v_flipper = findViewById(R.id.v_flipper);

        for (int i = 0; i<images.length; i++){
            fliverImages(images[i]);
        }
        for (int image: images)
            fliverImages(image);
    }
    public void fliverImages(int images){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(images);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this,R.anim.slide_in_right);
        v_flipper.setOutAnimation(this,R.anim.slide_out_left);
    }
}

package com.toshihiro.geometryphotos;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import ssru.toshihiro.geometryphoto.R;

public class DetailCamera extends Activity {

    TextView txtShape;
    ImageView imgShape;

    String strShape;
    int resImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_camera);

        Bundle bundle = getIntent().getExtras();
        int shape = bundle.getInt("Shape");
        Log.d("Get Intent ===>" , "" +shape);

        binWidget();

        dataChang(shape);
        mySetView();


    }

    private void mySetView() {
        txtShape.setText(strShape);
        imgShape.setBackgroundResource(resImg);

    }



    private void dataChang(int shape) {
        if (shape == 3){
            strShape = "รูปสามเหลี่ยม";
            resImg = R.drawable.triangle;

        } else if (shape == 4) {
            strShape = "รูปสี่เหลี่ยม";
            resImg = R.drawable.rectangle;
        } else if (shape == 99) {
            strShape = "รูปวงกลม";
            resImg = R.drawable.circle;
        } else {
            strShape = "Annonymous";
        }
    }

    private void binWidget() {
        txtShape = (TextView) findViewById(R.id.txt_detail_shape);
        imgShape = (ImageView) findViewById(R.id.img_detail_shape);

    }
}

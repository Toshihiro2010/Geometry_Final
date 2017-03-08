package com.toshihiro.geometryphotos;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import ssru.toshihiro.geometryphoto.R;

public class FormulatorGeometry extends Activity implements View.OnClickListener {

    ListView listView;
    private TextView txtSquare;
    private TextView txtTriangle;
    private TextView txtCircle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulator_geometry);

        bindWidGet();
        creatListViewSquare();
        txtClick();

    }

    private void txtClick() {
        txtSquare.setOnClickListener(this);
        txtCircle.setOnClickListener(this);
        txtTriangle.setOnClickListener(this);
    }

    private void bindWidGet() {
        txtSquare = (TextView) findViewById(R.id.txtSquare);
        txtCircle = (TextView) findViewById(R.id.txtCircle);
        txtTriangle = (TextView) findViewById(R.id.txtTriangle);
        listView = (ListView) findViewById(R.id.listView);
    }

    private void creatListViewCircle() {
        final MediaPlayer mediaPlayer = new MediaPlayer().create(FormulatorGeometry.this, R.raw.effect_btn_shut);

        Data circle = new Data();
        final int[] intImg = circle.cirResID();
        final String[] nameCircleStrings = circle.circleString();
        final String[] formula = circle.cirFormula();

        MyAdapter myAdapter = new MyAdapter(FormulatorGeometry.this, intImg, nameCircleStrings , formula);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mediaPlayer.start();
                //Toast.makeText(FormulatorGeometry.this,formula[i], Toast.LENGTH_SHORT).show();

                MyDialog myDialog = new MyDialog();
                myDialog.myDialog(FormulatorGeometry.this , nameCircleStrings[i] , formula[i] , intImg[i]);


            }
        });

    }
    private void creatListViewSquare() {
        final MediaPlayer mediaPlayer = new MediaPlayer().create(FormulatorGeometry.this, R.raw.effect_btn_shut);
        Data square = new Data();
        final int[] intImg = square.resId();
        final String[] nameSquareStrings = square.squareStrings();
        final String[] formula = square.formula();

        MyAdapter myAdapter = new MyAdapter(FormulatorGeometry.this, intImg, nameSquareStrings, formula);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mediaPlayer.start();
                MyDialog myDialog = new MyDialog();

                myDialog.myDialog(FormulatorGeometry.this, nameSquareStrings[i], formula[i] , intImg[i]);

                //Toast.makeText(FormulatorGeometry.this, formula[i], Toast.LENGTH_SHORT).show();


            }
        });

    }

    private void creatListViewTriangle() {
        final MediaPlayer mediaPlayer = new MediaPlayer().create(FormulatorGeometry.this, R.raw.effect_btn_shut);
        Data triangle = new Data();
        final int[] intImg = triangle.trResID();
        final String[] nameTriangleStrings = triangle.trString();
        final String[] formula = triangle.trFormula();

        MyAdapter myAdapter = new MyAdapter(FormulatorGeometry.this, intImg, nameTriangleStrings , formula);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                mediaPlayer.start();

                MyDialog myDialog = new MyDialog();
                myDialog.myDialog(FormulatorGeometry.this ,nameTriangleStrings[i] , formula[i] , intImg[i] );

                //Toast.makeText(FormulatorGeometry.this,formula[i], Toast.LENGTH_SHORT).show();


            }
        });

    }

    @Override
    public void onClick(View view) {
        MediaPlayer mp = new MediaPlayer().create(FormulatorGeometry.this,R.raw.effect_btn_shut);
        mp.start();
        if (view == txtSquare) {
            creatListViewSquare();
        } else if (view == txtCircle) {
            creatListViewCircle();
        } else if (view == txtTriangle) {
            creatListViewTriangle();
        }


    }
}

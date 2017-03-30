package com.toshihiro.geometryphotos;


import android.app.ProgressDialog;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;

import com.github.barteksc.pdfviewer.PDFView;

import java.net.URL;

import ssru.toshihiro.geometryphoto.R;


public class LearnShape extends Activity {

    private String linkUrl = "https://docs.google.com/viewer?url=http://www.csclub.ssru.ac.th/s56122201044/finalproject/pdf_file/shape2d.pdf";

    private PDFView pdfView;
    private WebView webView;

    private ProgressBar pb_web_view;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_shape);

        bindeWidGet();
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        pdfViewServer();
        /*Uri uriLink = Uri.parse(linkUrl);
        Log.d("uriLink = > " , uriLink.toString());

        pdfView = (PDFView) findViewById(R.id.pdfView);
        pdfView.fromUri(Uri.parse(linkUrl)).load();*/

    }



    private void pdfViewServer() {
        String url = linkUrl;
        webView.loadUrl(url);
        pb_web_view.setVisibility(View.INVISIBLE);

    }


    private void bindeWidGet() {
        webView = (WebView) findViewById(R.id.webView);
        pb_web_view = (ProgressBar) findViewById(R.id.pb_web_view);
    }


}

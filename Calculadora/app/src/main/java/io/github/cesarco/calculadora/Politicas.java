package io.github.cesarco.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class Politicas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_politicas);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://platzi.com/privacidad/");

    }
}
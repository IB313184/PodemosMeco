package com.ErNicoSystem.podemosmeco;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


import com.google.android.gms.ads.*;



public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);



/*
        // Buscar AdView como recurso y cargar una solicitud.
        AdView adView = (AdView) this.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
*/

/*
        Intent intent = new Intent(Intent.ACTION_VIEW);
        String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/PDF";

        File file = new File(path, "demo.pdf");
        intent.setDataAndType(Uri.fromFile(file), "application/pdf");
        startActivity(intent);

    }
*/


        WebView WebView = (WebView) findViewById(R.id.webView);
        WebView.getSettings().setJavaScriptEnabled(true);

/*
        final Activity activity = this;
        WebView.setWebChromeClient(new WebChromeClient() {
            public void onProgressChanged(WebView view, int progress) {
                // Activities and WebViews measure progress with different scales.
                // The progress meter will automatically disappear when we reach 100%
                activity.setProgress(progress * 1000);
            }
        });
*/


        WebSettings webSettings = WebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        WebView.getSettings().setPluginState(WebSettings.PluginState.ON);
        WebView.getSettings().setLoadWithOverviewMode(true);
        WebView.getSettings().setUseWideViewPort(true);





        WebView.setWebViewClient(new WebViewClient());
        //     WebView.loadUrl("file:///android_res/raw/index.html");

        //     WebView.loadUrl("file:///android_res/raw/unity.swf");
        //     WebView.loadUrl("https://googledrive.com/host/0BxeagsjJRhCPVkw4cEJxZXZ3bm8/");
        //  WebView.loadUrl("https://googledrive.com/host/0BxeagsjJRhCPVkw4cEJxZXZ3bm8/");
        WebView.loadUrl("http://podemosmeco.ernico.es/");

        // WebView.loadUrl("http://10.0.0.3/index.html");

    }


   /*
        //  WebView webView = new WebView(MainActivity.this);
        WebView webView = (WebView) this.findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);

        // Añadido despues
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);

        webView.loadUrl("http://www.agirregabiria.net/g/sylvainaitor/principito.pdf");

   */

    //   webView.getSettings().setJavaScriptEnabled(true);
    //    webView.getSettings().setPluginState(WebSettings.PluginState.ON);
    //    webView.loadUrl("http://www.agirregabiria.net/g/sylvainaitor/principito.pdf");
    //   webView.setWebViewClient(new Callback());
    //   webView.loadUrl("http://docs.google.com/gview?embedded=true&url=" + pdfURL);
    //   setContentView(webView);


    // String pdfURL = "http://www.agirregabiria.net/g/sylvainaitor/principito.pdf";
    // String pdfURL = "R.raw.demo.pdf";
    // webView.loadUrl("file://res/raw/demo.pdf");




    private class Callback extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(
                WebView view, String url) {

            return (false);
        }
    }

}























































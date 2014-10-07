package com.ErNicoSystem.podemosmeco;

        import android.app.ActionBar;
        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.view.Window;
        import android.view.WindowManager;


public class MainPortada extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_portada);



    }

    public void LeerLibro(View view){
        Intent imenu = new Intent(this, MainActivity.class);
        MainPortada.this.startActivity(imenu);
        MainPortada.this.finish();
    }

}
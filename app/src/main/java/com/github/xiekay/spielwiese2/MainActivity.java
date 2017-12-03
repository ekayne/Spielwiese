package com.github.xiekay.spielwiese2;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.Manifest;





public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button newAct = (Button) findViewById(R.id.newact);
        Button camera = (Button) findViewById(R.id.camera);
        newAct.setOnClickListener(this);
        camera.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.newact:
                Intent intentnewact = new Intent(this, gotoActivity.class);
                startActivity(intentnewact);
                break;
            case R.id.camera:
                Intent intentcam = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intentcam);
                break;
            default:
                break;
        }
    }
    //@Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    //public void gotoCamera(View view) {
    //}
}
package com.example.timmy.aboutme;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class aboutme extends Activity {


    private ImageButton bn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutme);
        bn2=(ImageButton) findViewById(R.id.button_backward);
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(TitleActivity.this,MainActivity.class);
                //   startActivity(intent);
                finish();
            }
        });
    }
}

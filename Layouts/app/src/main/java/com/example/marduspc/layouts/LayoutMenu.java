package com.example.marduspc.layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LayoutMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_menu);


        configLinLayoutBut();
        configRelLayoutBut();


    }

    private void configRelLayoutBut(){
        Button btnRel = (Button) findViewById(R.id.btnRel);
        btnRel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                startActivity(new Intent(LayoutMenu.this, MainActivity.class));
            }
        });
    }

    private void configLinLayoutBut(){
        Button btnLin = (Button) findViewById(R.id.btnLin);
        btnLin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                startActivity(new Intent(LayoutMenu.this, Linear.class));
            }
        });
    }


}

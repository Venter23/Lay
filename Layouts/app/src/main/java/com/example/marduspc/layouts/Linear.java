package com.example.marduspc.layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Linear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        configLayoutMenBut();
    }

    private void configLayoutMenBut(){
        Button btnlay = (Button) findViewById(R.id.btnlay);
        btnlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                startActivity(new Intent(Linear.this, LayoutMenu.class));
            }
        });
    }
}

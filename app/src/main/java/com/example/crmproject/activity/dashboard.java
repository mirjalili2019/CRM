package com.example.crmproject.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.crmproject.R;

public class dashboard extends AppCompatActivity {
 CardView crd_set;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        initilize();
        crd_set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s=new Intent(dashboard.this,Settings.class);
                startActivity(s);
            }
        });





    }

    public void initilize(){
        crd_set=findViewById(R.id.crd_set);
    }
}

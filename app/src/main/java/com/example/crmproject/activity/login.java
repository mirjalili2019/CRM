package com.example.crmproject.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.crmproject.R;

public class login extends AppCompatActivity {
    EditText edt_user,edt_pass;
    CheckBox chk_save;

    Button btn_save,btn_enter;

    Button btn_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initilize();

        ////////sabtnam///////////

        ////////register///////////

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(login.this, register.class);
                startActivity(i);
            }
        });
    }


    private void initilize(){
        edt_user=findViewById(R.id.edt_user);
        edt_pass=findViewById(R.id.edt_pass);
        chk_save=findViewById(R.id.chk_save);
        btn_save=findViewById(R.id.btn_save);

//        btn_enter=findViewById(R.id.btn_enter);
//
//        btn_login=findViewById(R.id.btn_login);


    }
}

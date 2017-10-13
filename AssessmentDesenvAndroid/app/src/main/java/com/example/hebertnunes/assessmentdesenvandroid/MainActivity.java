package com.example.hebertnunes.assessmentdesenvandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = (Button) findViewById(R.id.btn_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pagLogin = new Intent(MainActivity.this, PageLogin.class);
                startActivity(pagLogin);
            }
        });

        Button cadastra = (Button) findViewById(R.id.btn_cadastro);
        cadastra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pagCadastra = new Intent(MainActivity.this, PageCadastra.class);
                startActivity(pagCadastra);
            }
        });
    }
}

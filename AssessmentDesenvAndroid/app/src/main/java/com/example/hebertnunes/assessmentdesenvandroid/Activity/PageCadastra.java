package com.example.hebertnunes.assessmentdesenvandroid.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.hebertnunes.assessmentdesenvandroid.R;

public class PageCadastra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_cadastra);

        final EditText edit_nome = (EditText) findViewById(R.id.edit_nome);
        final EditText edit_login = (EditText) findViewById(R.id.edit_login);
        final EditText edit_senha = (EditText) findViewById(R.id.edit_cpf);
        final EditText edit_conf_senha = (EditText) findViewById(R.id.edit_conf_senha);
        final EditText edit_cpf = (EditText) findViewById(R.id.edit_cpf);
        Button btn_cadastrar = (Button)findViewById(R.id.btn_cadastrar);

        btn_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = edit_nome.getText().toString().trim();
                String login = edit_login.getText().toString().trim();
                String senha = edit_senha.getText().toString().trim();
                String conf_senha = edit_conf_senha.getText().toString().trim();
                String cpf = edit_cpf.getText().toString().trim();

            }
        });
    }
}

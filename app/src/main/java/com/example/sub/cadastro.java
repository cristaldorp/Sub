package com.example.sub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class cadastro extends AppCompatActivity {

    private EditText nome;
    private EditText nascimento;
    private EditText cpf;
    private EditText idade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nome = findViewById(R.id.idNome);
        nascimento = findViewById(R.id.dataNasc);
        cpf = findViewById(R.id.idCpf);
        idade = findViewById(R.id.idIdade);
    }




}
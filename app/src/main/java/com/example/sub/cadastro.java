package com.example.sub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.sub.domain.DAO;
import com.example.sub.domain.Pessoas;

import java.sql.Date;

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
    public void NovoCadastro(View view){
        Pessoas pessoas = new Pessoas();

        pessoas.setNome(nome.getText().toString());
        pessoas.setNascimento(Date.valueOf(nascimento.getText().toString()));
        pessoas.setCpf(cpf.getText().toString());
        pessoas.setIdade(Integer.parseInt(idade.getText().toString()));

        DAO.SalvarDados(pessoas);
        System.out.println(DAO.getListaDados());
        finish();

    }


}
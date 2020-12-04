package com.example.sub.domain;

import java.util.Date;

public class Pessoas {

    private String nome;
    private Date nascimento;
    private String cpf;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoas{" +
                "nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                ", cpf='" + cpf + '\'' +
                ", idade=" + idade +
                '}';
    }
}

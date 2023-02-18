package br.com.medcontrol.controller;

public class Pessoa {
    public String nome;
    public String idade;
    public String sexo ;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Pessoa(String nome, String idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;

    }
}

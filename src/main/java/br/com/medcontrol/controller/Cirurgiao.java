package br.com.medcontrol.controller;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Cirurgiao extends Pessoa {

    public String funcao;
    public String crm;
    public boolean Atuando;
    public int telefone;

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public boolean isAtuando() {
        return Atuando;
    }

    public void setAtuando(boolean atuando) {
        Atuando = atuando;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Cirurgiao(String nome, String idade, String sexo) {
        super(nome, idade, sexo);
    }
}

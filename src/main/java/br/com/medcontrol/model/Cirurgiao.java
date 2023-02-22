package br.com.medcontrol.model;

public class Cirurgiao extends Pessoa {

    public String funcao;
    public String crm;
    public boolean Atuando;
    public int telefone;

    public Cirurgiao(String nome, String idade, String sexo, String funcao, String crm, boolean atuando, int telefone) {
        super(nome, idade, sexo);
        this.funcao = funcao;
        this.crm = crm;
        Atuando = atuando;
        this.telefone = telefone;
    }

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

   // Cirurgiao[] c = new Cirurgiao[3]{
    }

    //public Cirurgiao(String nome, String idade, String sexo) {
       // super(nome, idade, sexo);

    }
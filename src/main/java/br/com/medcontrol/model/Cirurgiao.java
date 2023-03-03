package br.com.medcontrol.model;

public class Cirurgiao extends Pessoa {

    // Atributos

    private String funcao;
    private int crm;
    private int telefone;

    // métodos publuicos

    public void apresentar(){
        System.out.println("olá, meu nome é " + this.getNome());
        System.out.println("sou especialista em " + this.getFuncao());
    }

    //metodos especiais


    public Cirurgiao(String nome, String idade, String sexo, String funcao, int crm, int telefone) {
        super(nome, idade, sexo);
        this.funcao = funcao;
        this.crm = crm;
        this.telefone = telefone;


    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}

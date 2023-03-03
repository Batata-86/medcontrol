package br.com.medcontrol.model;


public class Paciente extends Pessoa {

    //atributos
    private String sintomas;
    private int quantoTempo;
    private boolean casoCirurgico;

    //métodos publicos

    public void consulta(){
        if(this.casoCirurgico ){
            System.out.println("procure um Cirurgião");
        }else System.out.println("tome um remédio");
    }

    // métodos especiais


    public Paciente(String nome, String idade, String sexo, String sintomas, int quantoTempo, boolean casoCirurgico) {
        super(nome, idade, sexo);
        this.sintomas = sintomas;
        this.quantoTempo = quantoTempo;
        this.casoCirurgico = casoCirurgico;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public int getQuantoTempo() {
        return quantoTempo;
    }

    public void setQuantoTempo(int quantoTempo) {
        this.quantoTempo = quantoTempo;
    }

    public boolean isCasoCirurgico() {
        return casoCirurgico;
    }

    public void setCasoCirurgico(boolean casoCirurgico) {
        this.casoCirurgico = casoCirurgico;
    }
}
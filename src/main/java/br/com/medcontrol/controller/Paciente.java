package br.com.medcontrol.controller;


public class Paciente extends Pessoa{

    public String sintomas;
    public int quantoTempo;
    public boolean casoCirurgico;

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

    public Paciente(String nome, String idade, String sexo, String sintomas, int quantoTempo, boolean casoCirurgico) {
        super(nome, idade, sexo);
        this.sintomas = sintomas;
        this.quantoTempo = quantoTempo;
        this.casoCirurgico = casoCirurgico;
    }
}

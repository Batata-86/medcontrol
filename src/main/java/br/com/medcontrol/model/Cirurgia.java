package br.com.medcontrol.model;

import java.util.ArrayList;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Cirurgia {

    public ArrayList<Cirurgiao> cirurgioes;
    public Paciente paciente;
    public LocalDateTime dataCirurgia;
    public String tipoCirurgia;

    public Cirurgia(ArrayList<Cirurgiao> cirurgioes, Paciente paciente, LocalDateTime dataCirurgia, String tipoCirurgia) {
        this.cirurgioes = cirurgioes;
        this.paciente = paciente;
        this.dataCirurgia = dataCirurgia;
        this.tipoCirurgia = tipoCirurgia;
    }

    public ArrayList<Cirurgiao> getCirurgioes() {
        return cirurgioes;
    }

    public void setCirurgioes(ArrayList<Cirurgiao> cirurgioes) {
        this.cirurgioes = cirurgioes;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public LocalDateTime getDataCirurgia() {
        return dataCirurgia;
    }

    public void setDataCirurgia(LocalDateTime dataCirurgia) {
        this.dataCirurgia = dataCirurgia;
    }

    public String getTipoCirurgia() {
        return tipoCirurgia;
    }

    public void setTipoCirurgia(String tipoCirurgia) {
        this.tipoCirurgia = tipoCirurgia;
    }
}









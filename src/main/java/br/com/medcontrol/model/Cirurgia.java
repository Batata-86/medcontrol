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

    //public Cirurgia() {cirurgioes  = new ArrayList<>();


    }









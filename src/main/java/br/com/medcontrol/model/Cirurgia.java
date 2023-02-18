package br.com.medcontrol.model;


import br.com.medcontrol.controller.Cirurgiao;
import br.com.medcontrol.controller.Paciente;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Cirurgia {

    public String Cirugiao;
    public String Paciente;
    public LocalDateTime dataCirurgia;
    public String tipoCirurgia;



    Cirurgiao[] C = new Cirurgiao[3];
    C [0] = new Cirurgiao ("maria", "27", "F", "pediatra", "111111", "sim",  "62 1111-1111");
    C [1] = new Cirurgiao ("joao", "33", "M", "Ortopedista", "222222", "sim", "62 2222-2222");
    C [2] = new Cirurgiao ("paulo", "60", "M", "Cardiologista", "333333", "Nao", "62 3333-3333");




    Paciente[] P = new Paciente[2];
    P[0] = new Paciente ("batata", 26, "M", "Dor no estomago", "uma semana", "nao");
    P[1] = new Paciente ("amanda", 24, "F", "Dor no ombro esquedo", "dois anos", "sim" );
}

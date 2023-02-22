package br.com.medcontrol.service;

import br.com.medcontrol.model.Cirurgia;
import br.com.medcontrol.model.Cirurgiao;
import br.com.medcontrol.model.Paciente;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class CirurgiaService {

    public List<Cirurgia> getCirurgias(){
        Cirurgia cirurgia = new Cirurgia();

        ArrayList<Cirurgiao> cirurgioes = new ArrayList<>();
        Cirurgiao[] c = new Cirurgiao[3];
        c[0] = new Cirurgiao("napoleao","40", "M", "ortopedista", "22222222", true, 22222222 );
        c[1] = new Cirurgiao("caipira", "35", "M", "cardiologista", "33333333", true, 33333333);
        c[2] = new Cirurgiao("batata", "26", "M", "pediatra", "4444444", false, 44444444);


        Paciente paciente = new Paciente("amanda","24", "F", "dor no ombor",1, true);


     ArrayList<Cirurgia> cirurgias = new ArrayList<>();
     cirurgias.add(cirurgia);



        return cirurgias;
    }
}

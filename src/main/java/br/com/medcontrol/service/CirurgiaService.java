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

    public List<Cirurgia> getCirurgias() {
        Cirurgia[] cir = new Cirurgia[3];
        cir[0] = new Cirurgia("batata", "maria", 12, "hérnia");
        cir[1] = new Cirurgia("caipira", "joao", 13, "marcapasso");
        cir[2] = new Cirurgia("napoleao", "pedro", 14,"clavicula");


        ArrayList<Cirurgiao> cirurgioes = new ArrayList<>();
        Cirurgiao[] c = new Cirurgiao[3];
        c[0] = new Cirurgiao("napoleao", "40", "M", "ortopedista", 22222222, 22222222);
        c[1] = new Cirurgiao("caipira", "35", "M", "cardiologista", 33333333, 33333333);
        c[2] = new Cirurgiao("batata", "26", "M", "pediatra", 4444444, 44444444);


        Paciente paciente = new Paciente("amanda", "24", "F", "dor no ombor", 1, true);

    }
}

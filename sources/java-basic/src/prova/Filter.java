package prova;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {

    public List<Candidato> candidatosAptos2(List<Candidato> input){
        Stream<Candidato> stream = input.stream();
        List<Candidato> resultado = stream.filter(x -> x.dataNascimento.getYear() <2005 ).collect(Collectors.toList());
        return resultado;
    }

    public List<Candidato> candidatosAptos(List<Candidato> input){



    return input.stream()
            .filter(candidato -> ChronoUnit.YEARS.between(candidato.getDataNascimento(), LocalDate.now()) > 18)
            .collect(Collectors.toList());
}

    public static void main(String[] args) {



    }


}

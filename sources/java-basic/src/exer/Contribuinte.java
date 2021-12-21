package exer;

import java.util.Date;
import java.util.List;

public class Contribuinte {

    public enum Sexo {
        MASCULINO, FEMININO
    }

    private String nome;

    private Date dataNascimento;

    private List<Vinculos> vinculos;

    private Sexo sexo;

    public Contribuinte(String nome, Date dataNascimento, List<Vinculos> vinculos, Sexo sexo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.vinculos = vinculos;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public List<Vinculos> getVinculos() {
        return vinculos;
    }

    public Sexo getSexo() {
        return sexo;
    }
}

package prova;


import java.time.LocalDate;

public class Candidato {

    public String nome;
    public LocalDate dataNascimento;

    public Candidato(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

}

package aula14;

public class Cidade {

    public String nome;

    public int populacao;

    public Cidade(String nome, int populacao) {
        this.nome = nome;
        this.populacao = populacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cidade cidade = (Cidade) o;

        if (populacao != cidade.populacao) return false;
        return nome != null ? nome.equals(cidade.nome) : cidade.nome == null;
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + populacao;
        return result;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "nome='" + nome + '\'' +
                ", populacao=" + populacao +
                '}';
    }
}

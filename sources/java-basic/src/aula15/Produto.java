package aula15;

public class Produto extends Object {

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    private String nome;

    private Double preco;

    public boolean equals(Object obj){
        if (obj instanceof Produto){
            Produto other = (Produto) obj;
            return nome != null && nome.equals(other.nome);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public static void main(String[] args) {
        Produto p1 = new Produto("Galaxy", 5000d);
        Produto p2 = new Produto("Galaxy", 7000d);
        System.out.println(p1.equals(p2));
    }

}

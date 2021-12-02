package aula09;

public class LivroParadidatico extends Livro {

    @Override
    public void editar() {

    }

    @Override
    public boolean validar() {
        System.out.println("LivroParadidatico::validando");
        return Math.random() > 0.5;
    }

}

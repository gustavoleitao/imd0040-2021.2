package aula09;

public  class LivroDidatico extends Livro {

    @Override
    public void editar() {
        System.out.println("qualquer coisa...");
    }

    @Override
    public boolean validar() {
        System.out.println("LivroDidatico::validando");
        return Math.random() > 0.5;
    }

}

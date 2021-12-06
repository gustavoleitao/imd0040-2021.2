package aula12;

public class Principal {

    public static void main(String[] args) {

        //método 1
        Cantor cantorCaetano = new Cantor() {
            @Override
            public String cantar() {
                return "Debaixo dos caracois dos seus cabelos...";
            }

        };

        System.out.println(cantorCaetano);

        System.out.println(cantorCaetano.cantar());

        //método 2
        Cantor cantor = () ->  "Amigo é coisa para se guardar";
        System.out.println(cantor);
        System.out.println(cantor.cantar());

    }

}

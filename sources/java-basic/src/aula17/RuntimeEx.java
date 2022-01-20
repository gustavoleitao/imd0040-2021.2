package aula17;

public class RuntimeEx {

    public static void main(String[] args) {

        String abc = null;
        try{
            abc.toLowerCase();
            System.out.println("******");
        }catch (NullPointerException e){
            System.out.println("Deixaram a variável abc nula");
        }

        System.out.println("Vai ser executado");


    }

}

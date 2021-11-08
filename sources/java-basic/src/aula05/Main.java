package aula05;

public class Main {

    public static void main(String[] args) {

        var c1 = new Circle(2, Color.BLUE);
        var c2 = new Circle(2.5, Color.RED);
        var c3 = new Circle(1, Color.RED);

        var c4 = new Circle();

        var c5 = new Circle(5, Color.GREEN);

        System.out.println("O valor da área de c1 é: "+ Math.ceil(c1.getArea() * 1000) / 1000);
        System.out.println("O valor da área de c2 é: "+c2.getArea());
        System.out.println("O valor da área de c3 é: "+c3.getArea());

        System.out.println("O meu raio é "+c4.getRadius()+" e minha cor é: "+c4.getColor());

        Color red = Color.valueOf("red".toUpperCase());
        System.out.println("O código hexa da cor "+red+" é: "+red.getHexCode() +
                " e o nome da cor em português é: "+red.getPtValue());

    }

}

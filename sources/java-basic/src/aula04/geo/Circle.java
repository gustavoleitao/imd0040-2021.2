package geo;

public class Circle {

    private double raio = 10;

    public Circle(double raio){
        System.out.println("Está criando um objeto da classe Circle");
        this.raio = raio;
    }

    public Circle(){

    }

    public double area(){
        return Math.PI * Math.pow(raio, 2);
    }

}

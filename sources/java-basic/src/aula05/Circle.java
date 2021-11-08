package aula05;

public class Circle {

    private double radius = 1.0;
    private Color color = Color.RED;

    public Circle(double radius, Color color){
        this.radius = radius;
        this.color = color;
    }

    public Circle(){

    }

    public double getRadius(){
        return radius;
    }

    public Color getColor(){
        return color;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

}

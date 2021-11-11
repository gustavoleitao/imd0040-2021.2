package aula06;

public class Main3 extends Object {

    public Referencia sortear(Referencia ref){
        ref = new Referencia();
        System.out.println("reff interno:" + ref);
        ref.sortear();
        return ref;
    }

    public static void main(String[] args) {
        Main3 m3 = new Main3();
        var ref01 = new Referencia();
        System.out.println("reff01: " + ref01);
        var ref02 = m3.sortear(ref01);
        System.out.println("reff01 pós" + ref01);
        System.out.println("reff02:" + ref02);
        System.out.println(ref01 == ref02);
    }

}

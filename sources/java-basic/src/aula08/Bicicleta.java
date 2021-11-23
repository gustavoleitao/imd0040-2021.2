package aula08;

public class Bicicleta extends Veiculo {

    @Override
    public void checklist(){
        System.out.println("Bicicleta::checklist");
    }

    @Override
    public void adjust() {
        System.out.println("Bicicleta::adjust");
    }

    @Override
    public void cleanup(){
        System.out.println("Bicicleta::cleanup");
    }

    public void trocarPedal(){
        System.out.println("trocando Pedal");
    }

}

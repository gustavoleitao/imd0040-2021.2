package aula08;

public class Automovel extends Veiculo {

    @Override
    public void checklist() {
        System.out.println("Automovel::checklist");
    }

    @Override
    public void adjust() {
        super.adjust();
        System.out.println("Automovel::adjust");
    }

    @Override
    public void cleanup(){
        System.out.println("Automovel::cleanup");
    }

}

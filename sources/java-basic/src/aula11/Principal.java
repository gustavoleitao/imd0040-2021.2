package aula11;

public class Principal {

    public void cantarAgora(Cantor cantor){
        System.out.println(cantor.cantar());
    }

    public void dancarAgora(Dancarino dancarino){
        System.out.println(dancarino.dancar());
    }

    public static void main(String[] args) {
        Principal principal = new Principal();

        Cantor wesleySafadao = new WesleySafadao();

        principal.cantarAgora( wesleySafadao);
        principal.dancarAgora( (Dancarino) wesleySafadao);
    }

}

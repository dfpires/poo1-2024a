package exe4;

public class Papel extends Coisa{
    @Override
    public void compara(Coisa c) {
        if (c.quemSouEu().equals("Papel")){
            System.out.println("Empate");
        }
        else if (c.quemSouEu().equals("Pedra")){
            System.out.println("Papel ganha Pedra");
        }
        else if (c.quemSouEu().equals("Tesoura")){
            System.out.println("Papel perde Tesoura");
        }
        else {
            System.out.println("Impossível comparar");
        }
    }

    @Override
    public String quemSouEu() {
        return "Papel";
    }
}

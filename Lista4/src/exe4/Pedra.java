package exe4;

public class Pedra extends Coisa{
    @Override
    public void compara(Coisa c) {
        if (c.quemSouEu().equals("Pedra")){
            System.out.println("Empate");
        }
        else if (c.quemSouEu().equals("Papel")){
            System.out.println("Pedra perde Papel");
        }
        else if (c.quemSouEu().equals("Tesoura")){
            System.out.println("Pedra ganha Tesoura");
        }
        else {
            System.out.println("Impossível comparar");
        }
    }

    @Override
    public String quemSouEu() {
        return "Pedra";
    }
}

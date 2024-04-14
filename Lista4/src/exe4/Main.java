package exe4;
import javax.swing.*;
public class Main {
    public static void main(String args[]){
        String user = JOptionPane.showInputDialog("Digite 1. Papel 2. Pedra 3. Tesoura");
        Coisa escolhaUsuario;
        if (user.equals("1")){
            escolhaUsuario = new Papel();
        }
        else if (user.equals("2")){
            escolhaUsuario = new Pedra();
        }
        else if (user.equals("3")){
            escolhaUsuario = new Tesoura();
        }
        else {
            escolhaUsuario = new Papel();
            System.out.println("Escolha errada, foi definida a escolha Papel");
        }
        // escolha do PC
        int pc = (int) (Math.random() * 10);
        Coisa escolhaPc;
        if (pc >= 0 && pc <= 2){
            escolhaPc = new Papel();
        }
        else if (pc >= 3 && pc <= 5){
            escolhaPc = new Pedra();
        }
        else {
            escolhaPc = new Tesoura();
        }

        escolhaUsuario.compara(escolhaPc);
    }
}

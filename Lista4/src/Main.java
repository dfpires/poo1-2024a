import rh.Assistente;
import rh.Diretor;
import rh.Funcionario;
import rh.Gerente;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void exibeDados(Funcionario camaleao){
        System.out.println(camaleao.toString());
        System.out.println("Salário final " + camaleao.calculaSalario());
    }
    public static void main(String[] args) {
            Assistente as1 =
            new Assistente("João", "Franca", "123", 3000, 3);
            exibeDados(as1);
            Gerente ge1 =
            new Gerente("Pedro", "Franca", "456", 5000, 2000);
            exibeDados(ge1);
            Diretor di1 =
            new Diretor("Lucas", "Franca", "789", 9000, 200);
            exibeDados(di1);

           // Funcionario fu1 = new Funcionario();
    }
}
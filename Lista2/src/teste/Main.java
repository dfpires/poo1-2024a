//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package teste;
import aluno.Aluno;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Aluno obj = new Aluno();
        obj.setCodigo(10);
        obj.setCodigo(-10);
        obj.setIdade(19);
        obj.setIdade(-19);
        obj.setNota(3);
        obj.setNota(39);


        System.out.println(" Código " + obj.getCodigo() + " Nota " + obj.getNota());
        Aluno obj2 = new Aluno(-10, -19, -8.5f);
    }
}
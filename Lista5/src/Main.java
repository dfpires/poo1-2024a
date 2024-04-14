//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AtletaBasqueteVolei abv = new AtletaBasqueteVolei();
        abv.sacar();
        abv.cortar();
        abv.arremessar();
        abv.baterLanceLivre();

        JogadorBasquete jb = new AtletaBasqueteVolei();
        jb.arremessar();
        jb.baterLanceLivre();
    }
}
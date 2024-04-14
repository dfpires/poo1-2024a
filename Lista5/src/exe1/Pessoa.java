package exe1;
public class Pessoa extends Animal implements Cidadao, Contribuinte, Professor{
    @Override
    public void vota() {
        System.out.println("Pessoa votou");
    }
    @Override
    public void tiraRg() {
        System.out.println("Pessoa tirou RG");
    }
    @Override
    public void pagaIr() {
        System.out.println("Pessoa pagou IR");
    }
    @Override
    public void tiraCpf() {
        System.out.println("Pessoa tirou CPF");
    }
    @Override
    public void trabalha() {
        System.out.println("Pessoa trabalhou");
    }
    @Override
    public void ensina() {
        System.out.println("Pessoa ensinou");
    }
}

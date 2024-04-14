public class AtletaBasqueteVolei implements JogadorBasquete, JogadorVolei{
    @Override
    public void baterLanceLivre() {
        System.out.println("Atleta de basquete e volei batendo lance livre");
    }
    @Override
    public void arremessar() {
        System.out.println("Atleta de basquete e volei arremessando");
    }
    @Override
    public void sacar() {
        System.out.println("Atleta de basquete e volei sacando");
    }
    @Override
    public void cortar() {
        System.out.println("Atleta de basquete e volei cortando");
    }
}

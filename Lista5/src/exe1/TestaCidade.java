package exe1;

public class TestaCidade {
    public static void main(String args[]){

        Pessoa fulano = new Pessoa();
        Cidade rp = new Cidade();
        rp.contrata(fulano);
        rp.contrata((Empregado) fulano); // cast
        rp.cobraDe(fulano);
        rp.registra(fulano);
        rp.alimenta(fulano);

    }
}

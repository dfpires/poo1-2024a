package exe1;
public class TestaPessoa {
    public static void main(String args[]){
        Pessoa objPes = new Pessoa();
        objPes.come(); objPes.respira();
        objPes.tiraRg(); objPes.vota();
        objPes.tiraCpf(); objPes.pagaIr();
        objPes.trabalha(); objPes.ensina();

        Cidadao objCi = new Pessoa();
        objCi.tiraRg(); objCi.vota();
        Empregado objEm = new Pessoa();
        objEm.trabalha();

    }
}

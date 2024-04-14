package exe1;
public class Cidade {
    public void contrata(Professor p){
        p.ensina();
        p.trabalha();
    }
    public void contrata(Empregado e){
        e.trabalha();
    }
    public void cobraDe(Contribuinte c) {
        c.pagaIr();
    }
    public void registra(Cidadao c) {
        c.tiraRg();
    }
    public void alimenta(Animal a ){
        a.come();
    }
}

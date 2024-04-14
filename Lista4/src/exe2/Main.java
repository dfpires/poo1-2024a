package exe2;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String args[]){
        List<CartaoWeb> lista = new ArrayList<CartaoWeb>();
        lista.add(new Aniversario("João"));
        lista.add(new Namorados("José"));
        lista.add(new Natal("Maria"));

        for(CartaoWeb item: lista){
            item.showMessage();
        }

    }
}

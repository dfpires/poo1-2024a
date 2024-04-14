package exe2;
public class Namorados extends CartaoWeb{
    public Namorados(){
        super();
    }
    public Namorados(String destinatario){
        super(destinatario);
    }
    @Override
    public void showMessage() {
        System.out.println(this.destinatario +
                ", feliz dia dos namorados");
    }
}

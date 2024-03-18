import java.util.ArrayList;

public class ShoppingCart {
    private int id;
    private float totalPrice;
    // composição
    private ArrayList<CarItem> carItens;

    public ShoppingCart() {
        // inicializa o vetor
        carItens = new ArrayList<CarItem>();
    }

    public ShoppingCart(int id, float totalPrice) {
        this.setId(id);
        this.setTotalPrice(totalPrice);
        // inicializa o vetor
        carItens = new ArrayList<CarItem>();
    }
    public void addCarItem(int id, int quantity, Product product){
        // composição
        // adiciona no vetor
        this.carItens.add(new CarItem(id, quantity, product));
        calculateTotalPrice();
    }
    public void calculateTotalPrice(){
        this.totalPrice = 0;
        for(CarItem obj: carItens){
            // obj representa cada item no carrinho
            this.totalPrice += obj.getQuantity() * obj.getProduct().getPrice();
        }
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setTotalPrice(float totalPrice) {

        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public ArrayList<CarItem> getCarItens() {
        return carItens;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", totalPrice=" + totalPrice +
                ", carItens=" + carItens +
                '}';
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // crie três produtos diferentes prod1, prod2 e prod3
        Product prod1 = new Product(1, 90,"Camiseta Sesi");
        Product prod2 = new Product(2, 400,"Bola basquete");
        Product prod3 = new Product(3, 150,"Mouse Óptico");
        // crie dois carrinhos diferentes car1 e car2
        // o carrinho car1 deve ter 2 itens de carrinho com os
        // produtos prod1 e prod2
        ShoppingCart shc1 = new ShoppingCart(100, 0);
        shc1.addCarItem(10, 5, prod1);
        shc1.addCarItem(11, 10, prod2);
        System.out.println(shc1.toString());
        // o carrinho car2 deve ter 2 itens de carrinho com os
        //  produtos prod2 e prod3

        // ao final, mostre os dados presentes nos carrinhos car1 e car2
        // data de entrega: 11/03 - segunda-feira

    }
}
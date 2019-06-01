public class TestBuyer {
    public static void main(String[] args) {
        Buyer b = new Buyer(1000);
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        b.print_summary();
    }
}

abstract class Product {
    private int price;

    protected Product(int price) { this.price = price; }

    public int getPrice() { return price; }
    public String toString() { return this.getClass().getName(); }
}

class Tv extends Product {
    public Tv() { super(100); }
}

class Computer extends Product {
    public Computer() { super(200); }
}

class Audio extends Product {
    public Audio() { super(50); }
}

class Buyer {
    private int money = 0;
    private Product[] cart = null;
    private int nitems;

    public Buyer(int money) { this.money = money; }
    public void buy(Product p) {
        if (money >= p.getPrice()) { money -= p.getPrice(); add(p); }
        else System.out.println("NOT_ENOUG_MONEY_" + (p.getPrice() - money));
    }
    private void add(Product p) {
        if (nitems == 0) { cart = new Product[]{p}; }
        else {
            if (nitems == cart.length) {
                Product[] tmp = new Product[nitems * 2];
                for (int i = 0; i < cart.length; i++) tmp[i] = cart[i];
                cart = tmp;
            }
            cart[nitems] = p;
        }
        nitems++;
    }
    public void print_summary() {
        int usedMoney = 0;
        System.out.print("Products: ");
        for (int i = 0; i < nitems; i++) {
            System.out.print(cart[i].toString() + " ");
            usedMoney += cart[i].getPrice();
        }
        System.out.println("\nUsed money: " + usedMoney);
        System.out.println("Remaining money: " + money);
    }
}

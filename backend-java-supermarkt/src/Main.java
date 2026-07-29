
class Main {
    void main() {

    }
}

class Product {
    private String name;
    private float price;
    private int amount;

    public Product(String name, float price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
}

class SuperMarket {
    private Product bread;
    private Product fruit;
    private Product cheese;
    private Product toiletPaper;

    public SuperMarket(Product bread, Product fruit, Product cheese, Product toiletPaper) {
        this.bread = bread;
        this.fruit = fruit;
        this.cheese = cheese;
        this.toiletPaper = toiletPaper;
    }

    public void buyBread(int amount) {

    }

    public void buyFruit(int amount) {

    }

    public void buyCheese(int amount) {

    }

    public void buyToiletPaper(int amount) {

    }

    public void buyItem(Product product, int amount) {

    }
}

class Customer {
    private String name;
    private SuperMarket superMarket;
    public Customer(String name) {
        this.name = name;
    }

    public void goToSupermarket(SuperMarket superMarket){

    }

    public void buyItem(String productName, int amount){

    }
}
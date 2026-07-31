
class Main {
    void main() {
        Product bread = new Product("bread", 1.45f, 142);
        Product fruit = new Product("fruit", 1.45f, 142);
        Product cheese = new Product("cheese", 1.45f, 142);
        Product toiletPaper = new Product("toilet paper", 1.45f, 142);


    }
}

class Product {
    public String name;
    public float price;
    public int amount;

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
        buyItem(this.bread, amount);
    }

    public void buyFruit(int amount) {
        buyItem(this.fruit, amount);
    }

    public void buyCheese(int amount) {
        buyItem(this.cheese, amount);
    }

    public void buyToiletPaper(int amount) {
        buyItem(this.toiletPaper, amount);
    }

    public void buyItem(Product product, int amount) {
        if (amount <= product.amount) {
            product.amount = product.amount - amount;
            float totalPrice = product.price * amount;
            System.out.println("You bought " + amount + " " + product.name + "  for " + totalPrice + " euro");
        } else {
            System.out.println("You cannot buy " + amount + " " + product.name + ", we only have " + product.amount + " " + product.name + " in stock.");
        }
    }
}

class Customer {
    private String name;
    private SuperMarket superMarket;

    public Customer(String name) {
        this.name = name;
    }

    public void goToSupermarket(SuperMarket superMarket) {
        this.superMarket = superMarket;
    }

    public void buyItem(String productName, int amount) {
        if (this.superMarket == null) {
            System.out.println("Select a supermarket to go to first");
        } else if (productName.equals("bread")) {
            superMarket.buyBread(amount);
        } else if (productName.equals("fruit")) {
            superMarket.buyFruit(amount);
        } else if (productName.equals("cheese")) {
            superMarket.buyCheese(amount);
        } else if (productName.equals("toilet paper")) {
            superMarket.buyToiletPaper(amount);
        } else {
            System.out.println("Product not found");
        }
    }
}
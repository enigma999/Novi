import java.util.ArrayList;
import java.util.HashMap;

class Main {
    void main() {
        Product product1 = new Product("bread", 1.12f, 14);
        Product product2 = new Product("fruit", 1.45f, 123);
        Product product3 = new Product("cheese", 1.55f, 32);
        Product product4 = new Product("toilet paper", 3.45f, 151);
        ArrayList<Product> productList1 = new ArrayList<>();
        productList1.add(product1);
        productList1.add(product2);
        productList1.add(product3);
        productList1.add(product4);

        Product product5 = new Product("bread", 1.12f, 142);
        Product product6 = new Product("lettuce", 0.45f, 13);
        Product product7 = new Product("cheese", 1.53f, 315);
        Product product8 = new Product("toilet paper", 2.45f, 14);
        ArrayList<Product> productList2 = new ArrayList<>();
        productList2.add(product5);
        productList2.add(product6);
        productList2.add(product7);
        productList2.add(product8);

        Product product9 = new Product("bread", 1.13f, 43);
        Product product10 = new Product("fruit", 1.24f, 57);
        Product product11 = new Product("burger", 2.59f, 87);
        Product product12 = new Product("toilet paper", 3.21f, 1241);
        ArrayList<Product> productList3 = new ArrayList<>();
        productList3.add(product9);
        productList3.add(product10);
        productList3.add(product11);
        productList3.add(product12);

        HashMap<String, SuperMarket> supermarkets = new HashMap<>();
        supermarkets.put("halbert eijn",new SuperMarket("Halbert Eijn", productList1));
        supermarkets.put("dumbo",new SuperMarket("Dumbo", productList2));
        supermarkets.put("caldi",new SuperMarket("Caldi", productList3));



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
    public String name;
    public ArrayList<Product> products;


    public SuperMarket(String name, ArrayList<Product> productList) {
        this.name = name;
        if (productList == null) {
            this.products = new ArrayList<Product>();
        } else {
            this.products = productList;
        }

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

    public void restockItem(String productName, int amount){
        for(int i = 0; i < this.products.size(); i++){
            Product superMarketProduct = this.products.get(i);
            if(superMarketProduct.name.equalsIgnoreCase(productName)){
                superMarketProduct.amount = superMarketProduct.amount + amount;
                return;
            }
        }
        System.out.println(this.name + " does not sell " + productName);
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
        } else {
            for(int i = 0; i < superMarket.products.size(); i++){
               Product superMarketProduct = superMarket.products.get(i);
               if(superMarketProduct.name.equalsIgnoreCase(productName)){
                   this.superMarket.buyItem(superMarketProduct, amount);
                   return;
               }
            }
            System.out.println(superMarket.name + " does not sell " + productName);
        }
    }
}
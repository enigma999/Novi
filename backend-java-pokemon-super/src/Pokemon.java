public class Pokemon {
    private int hp;
    private int level;
    private String name;

    public Pokemon(int hp){
        this.hp = hp;

    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak(){
        System.out.println(this.name + " says: peep");
    }

    public void eats(String foodName){
        System.out.println(this.name + " eats " + foodName);
    }
}
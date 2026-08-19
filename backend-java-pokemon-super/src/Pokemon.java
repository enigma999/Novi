public class Pokemon {
    private int hp;
    private int level;
    private String name;

    public Pokemon(int hp){
        this.hp = hp;
        this.level = 1;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speaks(){
        System.out.println(getName() + " says: peep");
    }

    public void eats(String foodName){
        System.out.println(this.name + " eats " + foodName);
    }

    public void getsHurt(int hp){
        setHp(getHp() - hp);
    }
}
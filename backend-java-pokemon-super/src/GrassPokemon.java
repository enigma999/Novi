public class GrassPokemon extends Pokemon{
    private boolean isRooted;
    private int healingStrength;
    public GrassPokemon(int hp){
        super(hp);
        this.isRooted = false;
        this.healingStrength = 2;
    }

    public boolean isRooted() {
        return isRooted;
    }

    public void setRooted(boolean rooted) {
        isRooted = rooted;
    }

    public int getHealingStrength() {
        return healingStrength;
    }

    public void setHealingStrength(int healingStrength) {
        this.healingStrength = healingStrength;
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " says: squeak");
    }

    public void heal(){
        setHp(getHp() + healingStrength);
        System.out.println(getName() + " used heal and healed" + healingStrength + " hp");
    }

    public void rootSelf(){
        this.isRooted = true;
        System.out.println(getName() + " rooted itself.");
    }
}

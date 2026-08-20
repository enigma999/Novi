public class WaterPokemon extends Pokemon{
    private boolean isInWater;
    private boolean hasShield;
    public WaterPokemon(int hp){
        super(hp);
        this.isInWater = false;
        this.hasShield = true;
    }

    public boolean isInWater() {
        return isInWater;
    }

    public void setInWater(boolean inWater) {
        isInWater = inWater;
    }

    public boolean isHasShield() {
        return hasShield;
    }

    public void setHasShield(boolean hasShield) {
        this.hasShield = hasShield;
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " says: blub");
    }

    public void bubble(){
        setHasShield(true);
        System.out.println(getName() +" used bubble to shield itself");
    }

    public void waterBlast(Pokemon targetPokemon){
        System.out.println(getName() + " attacks " + targetPokemon.getName() + " with water blast");
        int damage = 2;
        if (isInWater){
            damage  =damage * 2;
        }
        System.out.println("It does " + damage + " damage");

        targetPokemon.getsHurt(damage);
    }
}

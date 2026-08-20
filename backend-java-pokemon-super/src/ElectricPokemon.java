public class ElectricPokemon extends Pokemon {
    private int charge;
    private boolean isIncapacitated;
    public ElectricPokemon(int hp){
        super(hp);
        this.charge = 10;
        this.isIncapacitated = false;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public boolean isIncapacitated() {
        return isIncapacitated;
    }

    public void setIncapacitated(boolean incapacitated) {
        isIncapacitated = incapacitated;
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " says: bzzt");
    }

    public void bolt(Pokemon targetPokemon){
        if (this.charge>0) {
            System.out.println(getName() + " attacks " + targetPokemon.getName() + " with bolt");
            int damage = 2;
            System.out.println("It does " + damage + " damage");

            targetPokemon.getsHurt(damage);
            this.charge = this.charge - 1;
        }else{
            System.out.println(getName() + "has no charge left and can not use bolt");
        }
    }

    public void shock(Pokemon targetPokemon){
        if (this.charge>2) {
            System.out.println(getName() + " attacks " + targetPokemon.getName() + " with shock");
            int damage = 4;
            System.out.println("It does " + damage + " damage");

            targetPokemon.getsHurt(damage);
            this.charge = this.charge - 3;
        }else{
            System.out.println(getName() + "has no charge left and can not use shock");
        }
    }
}

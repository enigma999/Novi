public class FirePokemon extends Pokemon {
    private String flameColor;
    private int flameHeat;

    public FirePokemon(int hp) {
        super(hp);
        this.flameHeat = getLevel();
        this.flameColor = "red";
    }

    public String getFlameColor() {
        return flameColor;
    }

    public void setFlameColor(String flameColor) {
        this.flameColor = flameColor;
    }

    public int getFlameHeat() {
        return flameHeat;
    }

    public void setFlameHeat(int flameHeat) {
        this.flameHeat = flameHeat;
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " says: rawr");
    }

    public void fireBall(Pokemon targetPokemon) {
        System.out.println(getName() + " attacks " + targetPokemon.getName() + " with fireball");
        int damage = flameHeat * 2;
        System.out.println("It does " + damage + " damage");

        targetPokemon.getsHurt(damage);
    }

    public void flameThrower(Pokemon targetPokemonOne, Pokemon targetPokemonTwo){
        int damage = flameHeat;
        System.out.println(getName() + " attacks " + targetPokemonOne.getName() + " with flamethrower");
        System.out.println("It does " + damage + " damage");
        targetPokemonOne.getsHurt(damage);

        System.out.println(getName() + " attacks " + targetPokemonTwo.getName() + " with flamethrower");
        System.out.println("It does " + damage + " damage");
        targetPokemonTwo.getsHurt(damage);

    }
}

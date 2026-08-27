import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private final List<String> attacks = Arrays.asList("thunderpunch", "electroball", "thunder", "volttackle");
    private final int strongestAttackDamage = 20;

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "electric");
    }

    private int calculateDamage(Pokemon enemy) {
        return switch (enemy.getType()) {
            case "water" -> strongestAttackDamage;
            case "grass" -> 15;
            case "fire" -> 10;
            default -> 5;
        };
    }

    public void thunderPunch(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with thunderPunch");
        int damage = calculateDamage(gymPokemon);
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp remaining");
    }

    public void electroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with electroBall");
        int damage = calculateDamage(gymPokemon);
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp remaining");
    }

    public void thunder(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with thunder");
        if (gymPokemon.getType().equals("electric")) {
            int boost = 10;
            gymPokemon.setHp(gymPokemon.getHp() + boost);
            System.out.println(gymPokemon.getName() + " gains " + boost + " hp");
            System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp remaining");
            return;
        }
        int damage = calculateDamage(gymPokemon);
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp remaining");
    }

    public void voltTackle(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with voltTackle");
        int damage = calculateDamage(gymPokemon);
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp remaining");
    }

    public List<String> getAttacks() {
        return attacks;
    }
}

import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    List<String> attacks = Arrays.asList("inferno", "pyroball", "firelash", "flamethrower");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "fire");
    }

    private int calculateDamage(Pokemon enemy) {
        return switch (enemy.getType()) {
            case "grass" -> 20;
            case "water" -> 15;
            case "electric" -> 10;
            default -> 5;
        };
    }

    public void inferno(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with inferno");
        int damage = calculateDamage(gymPokemon);
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp remaining");
    }

    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with pyroBall");
        int damage = calculateDamage(gymPokemon);
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp remaining");
    }

    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with fireLash");
        int damage = calculateDamage(gymPokemon);
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp remaining");
    }

    public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with flameThrower");
        int damage = calculateDamage(gymPokemon);
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp remaining");
    }

    public List<String> getAttacks() {
        return attacks;
    }
}

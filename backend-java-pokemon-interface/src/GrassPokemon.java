import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private final List<String> attacks = Arrays.asList("leafstorm", "solarbeam", "leechseed", "leaveblade");
    private final int strongestAttackDamage = 20;

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "grass");
    }

    private int calculateDamage(Pokemon enemy) {
        return switch (enemy.getType()) {
            case "electric" -> strongestAttackDamage;
            case "fire" -> 15;
            case "water" -> 10;
            default -> 5;
        };
    }

    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with leafStorm");
        int damage = calculateDamage(gymPokemon);
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp remaining");
    }

    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with solarBeam");
        int damage = calculateDamage(gymPokemon);
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp remaining");
    }

    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with leechSeed");
        int damage = calculateDamage(gymPokemon);
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        pokemon.setHp(pokemon.getHp() + damage);
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        System.out.println(pokemon.getName() + " gains " + damage + " hp");
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp remaining");
    }

    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with leaveBlade");
        int damage = calculateDamage(gymPokemon);
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp remaining");
    }

    public List<String> getAttacks() {
        return attacks;
    }
}

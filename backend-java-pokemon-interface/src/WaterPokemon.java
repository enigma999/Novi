import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private final List<String> attacks = Arrays.asList("surf", "hydropump", "hydrocanon", "raindance");
    private final int strongestAttackDamage = 20;

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "water");
    }

    private int calculateDamage(Pokemon enemy) {
        return switch (enemy.getType()) {
            case "fire" -> strongestAttackDamage;
            case "electric" -> 15;
            case "grass" -> 10;
            default -> 5;
        };
    }

    public void surf(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with surf");
        int damage = calculateDamage(gymPokemon);
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp remaining");
    }

    public void hydroPump(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with hydroPump");
        int damage = calculateDamage(gymPokemon);
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp remaining");
    }

    public void hydroCanon(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with hydroCanon");
        int damage = calculateDamage(gymPokemon);
        gymPokemon.setHp(gymPokemon.getHp() - damage);
        System.out.println(gymPokemon.getName() + " loses " + damage + " hp");
        System.out.println(gymPokemon.getName() + " has " + gymPokemon.getHp() + " hp remaining");
    }

    public void rainDance(Pokemon pokemon, Pokemon gymPokemon) {
        System.out.println(pokemon.getName() + " attacks " + gymPokemon.getName() + " with rainDance");
        if (gymPokemon.getType().equals("electric")) {
            System.out.println("rainDance has no effect on " + gymPokemon.getName());
            return;
        }
        if (gymPokemon.getType().equals("grass")) {
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

    public List<String> getAttacks() {
        return attacks;
    }
}

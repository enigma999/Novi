import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    List<String> attacks = Arrays.asList("leafstorm", "solarbeam", "leechseed", "leaveblade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "grass");
    }

    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public List<String> getAttacks() {
        return attacks;
    }
}

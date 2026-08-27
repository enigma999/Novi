import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    List<String> attacks = Arrays.asList("inferno", "pyroball", "firelash", "flamethrower");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, "fire");
    }

    public void inferno(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public List<String> getAttacks() {
        return attacks;
    }
}

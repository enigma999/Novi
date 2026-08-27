import java.util.List;

public class PokemonTrainer {
    private String name;
    private List<Pokemon> pokemons;
    public PokemonTrainer(String name, List<Pokemon> pokemons){
        this.name = name;
        this.pokemons = pokemons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}

public class Main {

    public static void main(String[] args) {
        ElectricPokemon pikachu = new ElectricPokemon(15);
        FirePokemon charmander = new FirePokemon(24);
        WaterPokemon staryu = new WaterPokemon(15);
        GrassPokemon bulbasour = new GrassPokemon(15);


        pikachu.setName("pikachu");
        charmander.setName("charmander");
        staryu.setName("staryu");
        bulbasour.setName("bulbasour");

        pikachu.speaks();
        charmander.speaks();
        staryu.speaks();
        bulbasour.speaks();

        pikachu.bolt(charmander);
        pikachu.shock(staryu);
        pikachu.scratch(bulbasour);
        charmander.flameThrower(pikachu, staryu);

        staryu.bubble();
        staryu.waterBlast(charmander);

        bulbasour.rootSelf();
        bulbasour.heal();

        pikachu.eats("berries");
    }
}
package ac1_pokemon_top;

public class AC1_Pokemon_TOP {

    public class Main {

    }

    public static void main(String[] args) {
        Pokemon meuPokemon = new Pokemon("Arcanine", "Fogo", 80);
        Pokemon outroPokemon = new Pokemon("Blastoise", "Agua", 35);

        Batalhas batalha1 = new Batalhas();

        System.out.println("Seus: ");
        meuPokemon.printPokemon();
        System.out.println("Inimigos: ");
        outroPokemon.printPokemon();

        batalha1.startBatalha();
    }
}

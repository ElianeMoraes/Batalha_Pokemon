package ac1_pokemon_top;

public class Batalhas {

    private int meuPokemonvida;
    private int outroPokemonvida;
    private String meuPokemonNome;
    private String outroPokemonNome;

    public void meuPokemon(String nome, int vida) {
        this.meuPokemonvida = vida;
        this.meuPokemonNome = nome;
    }

    public void outroPokemon(String nome, int vida) {
        this.outroPokemonvida = vida;
        this.outroPokemonNome = nome;
    }

    public void startBatalha() {

        System.out.println("A batalha vai começar!...");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

        if (meuPokemonvida > outroPokemonvida) {

            System.out.println("Voce ganhou a Batalha !!!");

        } else {

            System.out.println("Voce perdeu !!!");

        }

    }
}

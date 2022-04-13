package ac1_pokemon_top;

public class Pokemon {

    private final String nome;
    private final String tipo;
    private final int level;
    private int vida = 200;
    private int ataque;
    private int defesa;

    public Pokemon(String nome, String tipo, int level) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;

        calculaAtributos();
        calculaBonus();
    }

    public String getNome() {
        return this.nome;
    }

    public int getLife() {
        return this.vida;
    }

    public int getAttack() {
        return this.ataque;
    }

    public int getDefense() {
        return this.defesa;
    }

    private void calculaAtributos() {
        switch (tipo) {
            case "Fogo":
                vida = vida - 20;
                ataque = 60;
                defesa = 20;
                break;

            case "Agua":
                vida = vida - 5;
                ataque = 40;
                defesa = 35;
                break;

            case "Planta":
                vida = vida + 20;
                ataque = 15;
                defesa = 60;
                break;

            case "Pedra":
                vida = vida + 25;
                ataque = 30;
                defesa = 60;
                break;
        }
    }

    private void calculaBonus() {

        vida = vida + (level / 2);
        ataque = ataque + (level / 3);
        defesa = defesa + (level / 4);

    }

    public void printPokemon() {

        System.out.println(
                "Pokemon: " + nome + " | "
                + "Tipo: " + tipo + " | "
                + "Level: " + level + " | "
                + "Vida: " + vida + " | "
                + "Ataque: " + ataque + " | "
                + "Defesa: " + defesa + "\n");

    }

}

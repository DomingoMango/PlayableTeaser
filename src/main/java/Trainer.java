import java.util.ArrayList;

public class Trainer extends Character {
    //region-String
    //pokemonMascota-Pokemon
    //TorneosGanados-int
    //Pokedex-ArrayList<Pokemon>
    //mochila-ArrayList<Objeto>
    private String region;
    Pokemon pokePet;
    int TOWon;
    ArrayList<Pokemon> pokedex;
    String nombre;
    ArrayList<Item> backpack;

    public Trainer(String name, int lvl, char genre, String region, Pokemon pokePet, int TOWon, ArrayList<Pokemon> pokedex, String nombre, ArrayList<Item> backpack) {
        super(name, lvl, genre);
        this.region = region;
        this.pokePet = pokePet;
        this.TOWon = TOWon;
        this.pokedex = pokedex;
        this.nombre = nombre;
        this.backpack = backpack;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Pokemon getPokePet() {
        return pokePet;
    }

    public void setPokePet(Pokemon pokePet) {
        this.pokePet = pokePet;
    }

    public int getTOWon() {
        return TOWon;
    }

    public void setTOWon(int TOWon) {
        this.TOWon = TOWon;
    }

    public ArrayList<Pokemon> getPokedex() {
        return pokedex;
    }

    public void setPokedex(ArrayList<Pokemon> pokedex) {
        this.pokedex = pokedex;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Item> getBackpack() {
        return backpack;
    }

    public void setBackpack(ArrayList<Item> backpack) {
        this.backpack = backpack;
    }

    public Trainer(String name, int lvl, char genre) {
        super(name, lvl, genre);
    }
}

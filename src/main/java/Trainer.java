import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
    public void mostrarMochila(){
        System.out.println("Los objtos diponibles son: ");
        int indice=1;
        for (Item objeto:backpack
        ) {
            System.out.println(indice+".- ");
            System.out.println(objeto);
            indice++;

        }
    }
    public void mostrarPokedex(ArrayList<Pokemon>Pokemon){
        System.out.println("Los pokemones disponibles son: ");
        int index=1;
        for (Pokemon object:Pokemon
        ) {
            System.out.println(index+".- ");
            System.out.println(object);
            index++;
        }
    }

    @Override
    public boolean Pelear(Pokemon pokemonEn) {

        ArrayList<Pokemon> fightPok = new ArrayList<>();
        mostrarPokedex(pokedex);
        System.out.println("Escoge tres pokemon");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa el pokemon");
            fightPok.add(pokedex.get(scanner.nextInt() - 1));

        }
        int respuesta = 0;
        do {
            if (fightPok.size() != 0) {

                System.out.println("1. Pelear");
                System.out.println("2. Usar posion");
                System.out.println("3. Huir");
                respuesta = scanner.nextInt();

                if (respuesta == 1) {
                    System.out.println("Escoge el pokemon para pelear");
                    mostrarPokedex(fightPok);
                    int eleccion = scanner.nextInt();
                    if (!fightPok.get(eleccion).pelear(pokemonEn)) {
                        fightPok.remove(eleccion);
                    } else {
                        return true;
                    }
                } else if (respuesta == 2) {
                    //
                    mostrarMochila();


                    System.out.println("Escoge la baya o pocion para el pokemon");
                    int eleccion = scanner.nextInt();
                    System.out.println("Escoge el pokemon para dar Baya o Pocion");
                    mostrarPokedex(fightPok);
                    backpack.get(eleccion - 1).usar(fightPok.get(scanner.nextInt()));

                } else {
                    System.out.println("Huyendo...");
                    return false;

                }

            }


            return false;
        } while (respuesta != 0);
    }

    @Override
    public boolean pelear(Pokemon trainer) {
        return false;
    }


    @Override
    public String toString() {
        return "Trainer{" +
                "region='" + region + '\'' +
                ", pokePet=" + pokePet +
                ", TOWon=" + TOWon +
                ", pokedex=" + pokedex +
                ", nombre='" + nombre + '\'' +
                ", backpack=" + backpack +
                '}';
    }
}

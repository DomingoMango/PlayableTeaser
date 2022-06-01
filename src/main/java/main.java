import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class main implements UtilInterface{
    static ArrayList<Habilidad> habilidades = new ArrayList<>();
    static Habilidad habilidad = new Habilidad("Ataque rastrero","Pega un ataque rastrero",50);
    static Habilidad habilidad1 = new Habilidad("Zape","zape",99);
    static Habilidad habilidad2 = new Habilidad("Zape con mano mojada","Zape pero con mano mojada",999);
    static ArrayList<String> tiposPokemon;
    public static void main(String[] args) throws InterruptedException {

        long initTime= System.currentTimeMillis();
        Thread.sleep(1500);
        habilidades.add(habilidad);
        habilidades.add(habilidad1);
        habilidades.add(habilidad2);
        tiposPokemon = new ArrayList<>(Arrays.asList("agua","fuego","tierra","Aire"));
        main objMain = new main();
        objMain.playTime(initTime,0);
        //Menu:
        //while respuesta == 0 salir
        //usuario escoge
        //Explorar
        int ans=1;
        Scanner sc= new Scanner(System.in);
        while(ans!=0){
            objMain.mostrarMenu();
            ans= sc.nextInt();
            if (ans==1){
                int stp=1;
                Thread.sleep(350);
                System.out.println("DIOS UN POKEMON???");
                System.out.println(objMain.createPokRandom());
                System.out.println("Quieres seguir explorando?");
                stp= sc.nextInt();
            }
        }

    }

    @Override
    public void playTime(long initTime, long finalTime) {
        //System.currentTimeMillis();
        finalTime=System.currentTimeMillis()-initTime;
        System.out.println("Su tiempo de juego es: "+ finalTime);



    }

    @Override
    public void mostrarMenu() {
        System.out.println("1. Explorar");
        System.out.println("2. Abrir Mochila");
        System.out.println("3. Ver estadisticas");
        System.out.println("4. Tiempo jugado");
        System.out.println("5. Tirar objeto");

    }



    @Override
    public Pokemon createPokRandom(Habilidad habilidad, String type) {

        Random random = new Random();
        int tamNombre = randNames(type).length;
        int name = random.nextInt(tamNombre);
        int hp = random.nextInt(3000);
        boolean legend=random.nextBoolean();
        String[] weakStrong = weakAndStrongRandm(type);
        int atk = random.nextInt(1200);
        int speed = random.nextInt(500);
        int lvl = random.nextInt(100);
        char genre = random.nextInt(10) < 5 ? 'f' : 'm';
        return new Pokemon(randNames(type)[name],lvl,genre,type,habilidad,hp,legend,weakStrong[0],weakStrong[1],speed,atk);
    }

    @Override
    public <R> R getRandom(ArrayList<R> arrayList) {
        Random random = new Random();
        int index = random.nextInt(arrayList.size()-1);
        return arrayList.get(index);
    }

    @Override
    public String[] weakAndStrongRandm(String type) {

        return new String[0];
    }

    @Override
    public String[] randNames(String type) {
        String[] naming = new String[10];
        switch(type){
            case "fuego":
                naming[0]="Azula";
                naming[1]="Torchic";
                naming[2]="Blaziken";
                naming[3]="Groudon";
                break;
            case "agua":
                naming[0]="Mi tio";
                naming[1]="Mi tio";
                naming[2]="Mi tio";
                naming[3]="Mi tio";
                break;


        }

        return new String[]{naming[0]};
    }
}

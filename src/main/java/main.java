import java.io.Console;
import java.util.ArrayList;

public class main implements UtilInterface{
    public static void main(String[] args) {




    }

    @Override
    public void playTime(long initTime, long finalTime) {
        //System.currentTimeMillis();
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
    public Pokemon createPokRandom() {
        return null;
    }

    @Override
    public <R> R getRandom(ArrayList<R> arrayList) {
        return null;
    }

    @Override
    public String[] weakAndStrongRandm(String type) {

        return new String[0];
    }

    @Override
    public String[] randNames(String type) {
        int rng= (int) Math.random();

        String[] fire = new String[10];
        fire[0]="Padrino";

        return new String[]{fire[0]};
    }
}

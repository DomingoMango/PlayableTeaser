import java.util.ArrayList;

public interface UtilInterface {
    void playTime(long initTime, long finalTime);
    void mostrarMenu();


    Pokemon createPokRandom(Habilidad habilidad, String type);

    <R> R getRandom(ArrayList<R> arrayList);
    String [] weakAndStrongRandm(String type);
    String [] randNames(String type);

}

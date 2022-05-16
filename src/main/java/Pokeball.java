import java.util.Random;

public class Pokeball extends Item {
    private double efficiency;


    public Pokeball(double efficiency, double cost, int qty, String name, String tipo) {
        super(cost, qty, name, tipo);
        this.efficiency = efficiency;
    }
    public void wildcatch(){

    }

    @Override
    public boolean usar(Pokemon pokemon) {
        if (pokemon.isLegendary()){
            this.efficiency -= 95;
        }
        Random random = new Random();
        int valor = random.nextInt(100);
        if (valor >= 1 && valor <= this.efficiency){
            return true;
        }else{
            return false;
        }

    }
}

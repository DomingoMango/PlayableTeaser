public class Pokeball extends Item {
    private double efficiency;


    public Pokeball(double efficiency, double cost, int qty, String name, String tipo) {
        super(cost, qty, name, tipo);
        this.efficiency = efficiency;
    }
    public void wildcatch(){

    }
}

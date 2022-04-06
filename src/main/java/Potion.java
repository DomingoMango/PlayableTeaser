public class Potion extends Item{
    private String effect;

    public Potion(String effect,double cost, int qty, String name, String tipo) {
        super(cost, qty, name, tipo);
        this.effect = effect;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }
}

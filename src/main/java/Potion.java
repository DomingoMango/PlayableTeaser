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

    @Override
    public boolean usar(Pokemon pokemon) {
        return false;
    }

    @Override
    public String toString() {
        return "Potion{" +
                "effect='" + effect + '\'' +
                '}';
    }
}

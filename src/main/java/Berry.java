public class Berry extends Item {
    private String effect;
    public Berry(double cost, int qty, String name, String tipo) {
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

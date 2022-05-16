public class Berry extends Item {
    private String effect;
    public Berry(double cost, int qty, String name, String tipo) {
        super(cost, qty, name, tipo);
        this.effect = effect;
    }

    @Override
    public boolean usar(Pokemon pokemon) {
        if (this.effect.equals("heal")){
            pokemon.setHp(pokemon.getHp()+20);
            return true;
        }else if (this.effect.equals("strenght")){
            pokemon.setStrength(pokemon.getStrength()+20);
            return true;
        }else if (this.effect.equals("speed")){
            pokemon.setSpeed(pokemon.getSpeed()+20);
            return true;
        }else{
            return false;
        }
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }
}

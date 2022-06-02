public abstract class Pokemon extends Character{
    //tipo-String
    //habilidad-Habilidag
    //hp-int
    //esLegendario-boolean
    //debilVS- String
    //fuerteVs-String
    private String type;
    Habilidad habilidad;
    private int hp;
    private boolean legendary;
    private String weakAg;
    private String strongAg;
    private int speed, strength;

    public Pokemon(String name, int lvl, char genre, String type, Habilidad habilidad, int hp, boolean legendary, String weakAg, String strongAg, int speed, int strength) {
        super(name, lvl, genre);
        this.type = type;
        this.habilidad = habilidad;
        this.hp = hp;
        this.legendary = legendary;
        this.weakAg = weakAg;
        this.strongAg = strongAg;
        this.speed = speed;
        this.strength = strength;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Habilidad getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isLegendary() {
        return legendary;
    }

    public void setLegendary(boolean legendary) {
        this.legendary = legendary;
    }

    public String getWeakAg() {
        return weakAg;
    }

    public void setWeakAg(String weakAg) {
        this.weakAg = weakAg;
    }

    public String getStrongAg() {
        return strongAg;
    }

    public void setStrongAg(String strongAg) {
        this.strongAg = strongAg;
    }

    public Pokemon(String name, int lvl, char genre) {
        super(name, lvl, genre);
    }

    @Override
    public boolean Pelear(Pokemon pokemonEn) {
        
        if (this.strongAg.equals(pokemonEn.getType())) {
            setStrength((int) (getStrength()*1.5));
            setSpeed((int) (getSpeed()+1.5));
            pokemonEn.habilidad.setAtkBase(this.habilidad.getAtkBase() - 20);


        } else if (pokemonEn.getStrongAg().equals(this.type)) {
            setStrength(getStrength()-20);
            pokemonEn.setStrength((int) (pokemonEn.getStrength()*1.25));

        } else {
        }
        do {
            if (this.speed >= pokemonEn.speed) {


                pokemonEn.setHp(pokemonEn.getHp()-(int) Math.sqrt(getStrength()) * habilidad.getAtkBase());

                if (pokemonEn.getHp() <= 0) {
                    return true;
                }
            } else {
                this.hp -= (int) Math.sqrt(pokemonEn.getStrength()) * pokemonEn.habilidad.getAtkBase();
            } if(getHp()<=0){
                return false;
            }
        } while (true);


    }


    @Override
    public String toString() {
        return "Pokemon{" +
                "type='" + type + '\'' +
                ", habilidad=" + habilidad +
                ", hp=" + hp +
                ", legendary=" + legendary +
                ", weakAg='" + weakAg + '\'' +
                ", strongAg='" + strongAg + '\'' +
                ", speed=" + speed +
                ", strength=" + strength +
                '}';
    }
}

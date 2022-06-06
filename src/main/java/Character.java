public abstract class Character {

    protected String name;
    protected int lvl;
    protected char genre;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public Character(String name, int lvl, char genre) {
        this.name = name;
        this.lvl = lvl;
        this.genre = genre;
    }

    public abstract boolean Pelear(Pokemon pokemonEn);

    public abstract boolean pelear(Pokemon trainer);

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", lvl=" + lvl +
                ", genre=" + genre +
                '}';
    }
}

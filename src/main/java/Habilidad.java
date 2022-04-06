public class Habilidad {
    private String nombre;
    private String desc;
    private int AtkBase;

    public Habilidad(String nombre, String desc, int atkBase) {
        this.nombre = nombre;
        this.desc = desc;
        AtkBase = atkBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getAtkBase() {
        return AtkBase;
    }

    public void setAtkBase(int atkBase) {
        AtkBase = atkBase;
    }
}

public abstract class Item {
    private double cost;
    private int qty;
    private String name;
    private String tipo;


    public Item(double cost, int qty, String name, String tipo) {
        this.cost = cost;
        this.qty = qty;
        this.name = name;
        this.tipo = tipo;
    }
    public abstract boolean usar(Pokemon pokemon);

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Item{" +
                "cost=" + cost +
                ", qty=" + qty +
                ", name='" + name + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}

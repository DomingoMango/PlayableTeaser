import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private ArrayList<Item> objetosDisponibles;
    public boolean comprar(double dinero, int cantidad, Item objeto, int ind){
        try {
            if (objetosDisponibles.get(ind).getCost() >= cantidad) {
                double precioTotal = cantidad * objetosDisponibles.get(ind).getCost();
                if (dinero >= precioTotal) {
                    System.out.println("Usted esta comprando " + cantidad + " " + objetosDisponibles.get(ind).getCost() +
                            "por $ " + precioTotal);
                    System.out.println("Su cambio es " + (dinero - precioTotal));
                    return true;
                } else {
                    System.out.println("No contamos con la cantidad solicitada");
                    return false;

                }
            }

            return false;
        }catch (IndexOutOfBoundsException e){
            System.out.println("Objeto inexistente");
        }
        return true;
    }
    public boolean vender(Item objeto, int cantidad){

        return false;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "nombre='" + nombre + '\'' +
                ", objetosDisponibles=" + objetosDisponibles +
                '}';
    }
}

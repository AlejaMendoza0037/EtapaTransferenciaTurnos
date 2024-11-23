import java.util.LinkedList;
import java.util.Queue;

public class ColaTurnos {


    private Queue<Turno> cola = new LinkedList<>(); // Usamos LinkedList para implementar la cola

    public void agregarTurno(Turno turno) {
        cola.add(turno); // Agrega el turno a la cola
        System.out.println("Turno " + turno.getCodigo() + " agregado a la cola.");
    }

    public Turno eliminarTurno() {
        return cola.poll(); // Elimina el primer turno de la cola
    }

    public boolean estaVacia() {
        return cola.isEmpty(); // Verifica si la cola está vacía
    }



}

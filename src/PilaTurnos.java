import java.util.Stack;

public class PilaTurnos {
    private Stack<Turno> pila = new Stack<>(); // Usamos Stack de Java

    public void agregarTurno(Turno turno) {
        pila.push(turno); // Agrega el turno a la pila
        System.out.println("Turno " + turno.getCodigo() + " movido a la pila.");
    }

    public Turno eliminarTurno() {
        return pila.pop(); // Elimina el último turno de la pila
    }

    public boolean estaVacia() {
        return pila.isEmpty(); // Verifica si la pila está vacía
    }
}

public class Usuario {
    private ColaTurnos colaTurnos;
    private PilaTurnos pilaTurnos;

    // Constructor de la clase Usuario, que recibe las instancias de ColaTurnos y PilaTurnos
    public Usuario(ColaTurnos cola, PilaTurnos pila) {
        this.colaTurnos = cola;
        this.pilaTurnos = pila;
    }

    // solicitamos un turno y agregarlo a la cola
    public void solicitarTurno(String codigo) {
        Turno nuevoTurno = new Turno(codigo);
        colaTurnos.agregarTurno(nuevoTurno); // Solicita un nuevo turno
    }

    // asignamos un turno, eliminándolo de la cola y agregándolo a la pila
    public void asignarTurno() {
        if (!colaTurnos.estaVacia()) {
            Turno turno = colaTurnos.eliminarTurno();
            pilaTurnos.agregarTurno(turno); // Asigna el turno y lo mueve a la pila
        } else {
            System.out.println("No hay turnos en la cola.");
        }
    }

    //  eliminamos un turno de la pila después de ser atendido
    public void eliminarTurno() {
        if (!pilaTurnos.estaVacia()) {
            Turno turnoAtendido = pilaTurnos.eliminarTurno();
            System.out.println("Turno " + turnoAtendido.getCodigo() + " ha sido eliminado.");
        } else {
            System.out.println("No hay turnos en la pila para eliminar.");
        }
    }
}

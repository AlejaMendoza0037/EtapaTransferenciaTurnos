//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");




        // Inicializamos las instancias de las colas y pilas correctamente
        ColaTurnos colaTurnos = new ColaTurnos(); // Crear una instancia de ColaTurnos
        PilaTurnos pilaTurnos = new PilaTurnos(); // Crear una instancia de PilaTurnos

        // Crear un usuario y asignarle las instancias de la cola y pila
        Usuario usuario = new Usuario(colaTurnos, pilaTurnos);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Menú de opciones
            System.out.println("\nSistema de Turnos:");
            System.out.println("1. Solicitar turno");
            System.out.println("2. Asignar turno a un operario de asesoria");
            System.out.println("3. Eliminar turno atendido");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Solicitar turno
                    System.out.print("Ingrese el código del nuevo turno: ");
                    String codigo = scanner.nextLine();
                    usuario.solicitarTurno(codigo);
                    break;
                case 2:
                    // Asignar turno
                    usuario.asignarTurno();
                    break;
                case 3:
                    // Eliminar turno atendido
                    usuario.eliminarTurno();
                    break;
                case 4:
                    // Salir del sistema
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }


    }

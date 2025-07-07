import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        menu();

    }

    static void menu() {
        Scanner sc = new Scanner(System.in);
        Bombilla salon = new Bombilla();
        Bombilla cocina = new Bombilla();
        Bombilla hab1 = new Bombilla();
        Bombilla hab2 = new Bombilla();
        Bombilla patio = new Bombilla();
        int opcion;
        do {
            System.out.println("Que bombilla deseo utilizar");
            System.out.println("1. Salón " + "[" + salon.mostrarEstado() + "]");
            System.out.println("2. Cocina " + "[" + cocina.mostrarEstado() + "]");
            System.out.println("3. Habitación Principal " + "[" + hab1.mostrarEstado() + "]");
            System.out.println("4. Habitación Niños " + "[" + hab2.mostrarEstado() + "]");
            System.out.println("5. Patio " + "[" + patio.mostrarEstado() + "]");
            System.out.println("6. Interruptor General " + "[" + Bombilla.interruptorGeneral + "]");
            System.out.println("7. Salir ");
            System.out.println("Indique su Opcion--> ");
            opcion = sc.nextInt();
            String mensaje = "El estado de la bombilla es: ";
            switch (opcion) {
                case 1 -> {
                    salon.encenderOapagar();
                }
                case 2 -> {
                    cocina.encenderOapagar();
                }
                case 3 -> {
                    hab1.encenderOapagar();
                }
                case 4 -> {
                    hab2.encenderOapagar();
                }
                case 5 -> {
                    patio.encenderOapagar();
                }
                case 6 -> {
                    if (Bombilla.interruptorGeneral) {
                        Bombilla.interruptorGeneral = false;
                    } else {
                        Bombilla.interruptorGeneral = true;
                    }
                }
                default -> System.out.println("Opcion no valida");

            }

        } while (opcion != 6);
    }
}
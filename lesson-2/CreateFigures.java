import java.util.Scanner;

public class CreateFigures {
    /**
     * Muestra el menú de opciones.
     */
    static void showMenu() {
        System.out.println();
        System.err.print("¡Bienvenido al programa de creación de figuras geométricas!, ");
        System.out.println("Selecciona una opción:");
        System.out.println("....................................");
        System.out.println("1. Cuadrado");
        System.out.println("2. Triángulo");
        System.out.println("3. Salir");
        System.out.println("....................................");
        System.out.print("Opción: ");

    }

    /**
     * Genera un cuadrado de un tamaño específico con asteriscos.
     * 
     * @param size Tamaño del cuadrado.
     */
    static void generateSquare(int size, boolean isFilled) {
        if (isFilled == true) {
            System.out.println("Cuadrado relleno de " + size + "x" + size + ":");
            System.out.println();
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Cuadrado vacío de " + size + "x" + size + ":");
            System.out.println();
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == 0 || i == size - 1 || j == 0 || j == size - 1)
                        System.out.print("* ");
                    else
                        System.out.print("  ");

                }
                System.out.println();
            }
        }
    }

    /**
     * Genera un triángulo de un tamaño específico con asteriscos.
     * 
     * @param size Tamaño del triángulo.
     */
    static void generateTriangle(int size, boolean isFilled) {
        if (isFilled == true) {
            System.out.println("Triángulo relleno de " + size + "x" + size + ":");
            System.out.println();
            for (int i = 0; i < size; i++) {
                System.out.println("* ".repeat(i + 1));
            }
        } else {
            System.out.println("Triángulo vacío de " + size + "x" + size + ":");
            System.out.println();
            for (int i = 0; i < size; i++) {
                if (i == 0 || i == size - 1) {
                    System.out.println("* ".repeat(i + 1));
                } else {
                    System.out.println("* " + "  ".repeat(i - 1) + "*");
                }

            }
        }
    }

    /**
     * Muestra el menú de opciones y permite al usuario seleccionar una figura para
     * generar.
     */
    static void setFigure() {
        Scanner scanner = new Scanner(System.in);
        int menuOption = 0;
        int size = 0;
        String selectedFill = "n";
        boolean isFilled = false;
        do {
            showMenu();
            menuOption = scanner.nextInt();
            if (menuOption == 3)  {
                System.out.println("¡Gracias por usar el programa!");
                break;
            };
            System.out.print("Ingrese el tamaño de la figura: ");
            size = scanner.nextInt();
            System.out.print("¿Desea rellenar la figura? (y/n): ");
            selectedFill = scanner.next().toLowerCase();
            isFilled = selectedFill.equals("y") ? true : false;
            switch (menuOption) {
                case 1:
                    generateSquare(size, isFilled);
                    break;
                case 2:
                    generateTriangle(size, isFilled);
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }
        } while (menuOption != 3);
        scanner.close();
    }

    public static void main(String[] args) {
        setFigure();
    }

}

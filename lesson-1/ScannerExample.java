import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        // basicUsage(keyboardInput);
        // basicError(keyboardInput);
        loopUsage(keyboardInput);
    }

    public static void basicUsage(Scanner scanner) {
        System.out.print("What's your name?: ");
        String enteredText = scanner.next(); // nextLine() para leer toda la línea hasta llegar a un espacio en blanco
        // String enteredText = entryKeyBoard.nextLine(); // nextLine() para leer toda
        // la línea hasta encontrar un salto de línea
        System.out.println("Hello " + enteredText);
        scanner.close();
    }

    public static void basicError(Scanner scanner) {
        System.out.print("Enter your age: ");
        int number = scanner.nextInt();
        // scanner.nextLine(); // Limpiar el buffer si no se realiza salta el error.(Comentar y descomentar para ver el error)
        System.out.println("Your age is: " + number);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        if (name.isEmpty())
            System.out.println("Ups! We've triggered the error, it seems like it's not working!");
        else
            System.out.println("Your name is: " + name); // Nunca se ejecuta ya que al utilizar nextInt() se queda un salto de línea en el buffer (\n)

        scanner.close();
    }

    public static void loopUsage(Scanner scanner) {
       String randomText;
       do {
              System.out.print("Enter text other than \"exit\" to continue in the loop: ");
              randomText = scanner.nextLine();
              System.out.println("You entered: " + randomText);
         } while (!randomText.equals("exit"));
    }
}

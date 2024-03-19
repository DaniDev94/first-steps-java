public class Indentation {
    public static void main(String[] args) {
        int number = 10;
        // Kernighan and Ritchie style (K&R)
        if (number > 5) {
            System.out.println("The number is greater than 5");
        } else {
            System.out.println("The number is less than or equal to 5");
        }

        // Allman style
        if (number > 5)
        {
            System.out.println("The number is greater than 5");
        }
        else
        {
            System.out.println("The number is less than or equal to 5");
        }
    }
    
}

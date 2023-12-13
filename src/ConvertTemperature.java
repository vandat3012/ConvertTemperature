import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("choice 1. celsius to fahrenheit");
            System.out.println("choice 2. fahrenheit to celsius");
            System.out.println("choice 0. exit");
            System.out.println("enter your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("Enter the celsius : \n");
                    celsius = scanner.nextDouble();
                    System.out.println(celsius + " C = " + cToF(celsius));
                    break;
                case 2:
                    System.out.println("Enter the fahrenheit : \n");
                    fahrenheit = scanner.nextDouble();
                    System.out.println(fahrenheit + " C = " + fToC(fahrenheit));
                    break;
            }
        } while (choice != 0);
    }

    public static double fToC(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static double cToF(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
}

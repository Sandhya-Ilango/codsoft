import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");
        System.out.println("1. USD to Rupee");
        System.out.println("2. Rupee to USD");
        System.out.println("3. Euro to Rupee");
        System.out.println("4. Rupee to Euro");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        double amount;
        double result;

        switch (choice) {
            case 1:
                System.out.print("Enter amount in USD: ");
                amount = scanner.nextDouble();
                result = convertUsdToRupee(amount);
                System.out.println("Converted amount in Rupee: " + result);
                break;

            case 2:
                System.out.print("Enter amount in Rupee: ");
                amount = scanner.nextDouble();
                result = convertRupeeToUsd(amount);
                System.out.println("Converted amount in USD: " + result);
                break;

            case 3:
                System.out.print("Enter amount in Euro: ");
                amount = scanner.nextDouble();
                result = convertEuroToRupee(amount);
                System.out.println("Converted amount in Rupee: " + result);
                break;

            case 4:
                System.out.print("Enter amount in Rupee: ");
                amount = scanner.nextDouble();
                result = convertRupeeToEuro(amount);
                System.out.println("Converted amount in Euro: " + result);
                break;

            default:
                System.out.println("Invalid choice. Please select between 1 to 4.");
        }

        scanner.close();
    }

    public static double convertUsdToRupee(double usd) {
        return usd * 83.47;
    }

    public static double convertRupeeToUsd(double rupee) {
        return rupee * 0.0119804;
    }

    public static double convertEuroToRupee(double euro) {
        return euro * 89.10;
    }

    public static double convertRupeeToEuro(double rupee) {
        return rupee * 0.0113;
    }
}

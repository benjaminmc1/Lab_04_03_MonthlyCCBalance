// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double creditBalance = 5000;
        double interestRate = .17;
        double firstMonth;
        double secondMonth;

        firstMonth = creditBalance * interestRate;
        System.out.println("The interest due for the first month is " + firstMonth + " dollars.");

        creditBalance = creditBalance + firstMonth;
        secondMonth = creditBalance * interestRate;
        System.out.println("The interest due for the second month is " + secondMonth + " dollars.");
    }
}
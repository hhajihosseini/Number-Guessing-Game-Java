import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.print("Insert a value between 0 to 100: ");
            int userNumber = sc.nextInt();
            int randomNumber = (int) (Math.random() * 101);

            evaluate(userNumber, randomNumber);

            System.out.print("Do you want to continue? (y/n): ");
            String con = sc.next();

            if (con.equalsIgnoreCase("Y")) {
                flag = true;                          // continue loop
            } else if (con.equalsIgnoreCase("N")) {
                flag = false;                         // exit loop
                System.out.println("Goodbye!");
            } else {
                System.out.println("Please insert correct value (y/n)");
                flag = true;                          // continue loop
            }
        }

        sc.close();
    }


    public static void evaluate(int userNumber, int randomNumber) {
        System.out.println("Machine number was: " + randomNumber);

        if (userNumber == randomNumber) {
            System.out.println("🎉 You win!!");

        } else if (userNumber > randomNumber) {
            // user guessed too HIGH
            System.out.println("❌ Your number is greater than machine number.");

        } else {
            // user guessed too LOW
            System.out.println("❌ Your number is less than machine number.");
        }
    }
}

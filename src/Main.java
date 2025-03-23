import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age = 22;
        double salary = 10.0;
        boolean flag = true;
        char aChar = 'T';
        String username = "alenj0x1";
        long isLong = 12;

        System.out.println(username);
        System.out.println(isLong);
        System.out.println(salary);

        // Operators
        Scanner keyboard = new Scanner(System.in);
        int num1, num2;

        System.out.println("Enter an integer (Add)");
        num1 = keyboard.nextInt();

        System.out.println("Enter other integer (Add)");
        num2 = keyboard.nextInt();

        int result = Operators.Add(num1, num2);
        System.out.println("The result is: " + result);

        int num3, num4;
        System.out.println("Enter an integer (Subtract)");
        num3 = keyboard.nextInt();

        System.out.println("Enter other integer (Subtract)");
        num4 = keyboard.nextInt();
        result = Operators.Subtract(num3, num4);

        System.out.println("The result is: " + result);
    }
}
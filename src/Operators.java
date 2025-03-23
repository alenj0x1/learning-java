import java.util.Scanner;

public class Operators {
    public static int Add(int a, int b) {
        return a + b;
    }

    public static int Subtract(int a, int b) {
        return a - b;
    }

    public static void Base() {
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

import java.util.Scanner;

public class Conditionals {
    public static void Base() {
        int age;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");

        age = input.nextInt();

        if (age == 18) {
            System.out.println("Allowed");
        }
        else if (age >= 18) {
            System.out.println("Super allowed");
        }
        else {
            System.out.println("Not allowed");
        }

        int day;
        String dayName;

        System.out.println("Enter a number from 1 to 7");
        day = input.nextInt();

        switch (day) {
            case 1: dayName = "Monday";
                break;
            case 2: dayName = "Tuesday";
                break;
            case 3: dayName = "Wednesday";
                break;
            case 4: dayName = "Thursday";
                break;
            case 5: dayName = "Friday";
                break;
            case 6: dayName = "Saturday";
                break;
            case 7: dayName = "Sunday";
                break;
            default:
                dayName = "Unknown";
        }

        System.out.println("Day name is: " + dayName);
    }
}

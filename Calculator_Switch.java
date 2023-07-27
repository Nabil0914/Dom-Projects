import java.util.Scanner;

public class Calculator_Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num1 = input.nextInt();
        System.out.print("Enter second number:");
        int num2 = input.nextInt();
        int result;
        System.out.print("Enter 1 for addition, " +
                "2 for subtraction, " +
                "3 for multiplication, " +
                "4 for division :");
        int menu = input.nextInt();
        switch (menu) {
            case 1 -> {
                result = num1 + num2;
                System.out.println(result);
            }
            case 2 -> {
                result = num1 - num2;
                System.out.println(result);
            }
            case 3 -> {
                result = num1 * num2;
                System.out.println(result);
            }
            case 4 -> {
                result = num1 / num2;
                System.out.println(result);
            }
            default -> System.out.println("Enter a valid number");
        }


    }
}

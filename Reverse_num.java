import java.util.Scanner;

public class Reverse_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = input.nextInt();
        System.out.println("Before reverse " + num);
        int res = 0;
        while (num > 0){
            int rem = num % 10;
            num = num / 10;
            res = res * 10 + rem;

        }
        System.out.println("Reversed number is " + res);
    }
}

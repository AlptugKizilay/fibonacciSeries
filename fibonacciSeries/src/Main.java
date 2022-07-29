import java.util.Scanner;

public class Main {
    static int fibonacci(int a) {
        int first = 0, second = 1, total = 0;
        for (int i = 1; i < a; i++) {
            total = first + second;
            System.out.println(total);
            first = second;
            second = total;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number;
        System.out.print("Enter the number of elements: ");
        number = inp.nextInt();
        fibonacci(number);
    }

}

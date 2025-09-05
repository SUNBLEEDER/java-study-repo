import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println(n % 2 == 0 ? "Even" : "Odd");
        scanner.close();
    }
}

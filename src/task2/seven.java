import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Float num = sc.nextFloat();
        if (num == 0) {
            System.out.println("zero");
        } else if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("negative");
        } else if (Math.abs(num) < 1) {
            System.out.println("small");
        } else if (Math.abs(num) > 1000000) {
            System.out.println("large");
        }
    }
}

import java.util.Scanner;

public class java3 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers between 1 - 10");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int z = a+b;
        z+=30;
        System.out.println(z);
    }
}

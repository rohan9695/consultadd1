package task3;

import java.util.Scanner;

public class sixth6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3 = sc.nextInt();

        if((num1< num2) && (num2 < num3)){
            System.out.println("Increasing Order");
        }
        else if((num1>num2)&& (num2> num3)){
            System.out.println("Decreasing Order");
        }
        else {
            System.out.println("Neither Increasing or Decreasing");
        }
    }
}

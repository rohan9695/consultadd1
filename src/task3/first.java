package task3;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0;i<10;i++){
            int sum = i * num;
            System.out.println( num+" X "+ i +'='+ sum);
        }
    }
}

package task3;

import java.util.Scanner;

public class second2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int [] num = new int[10];
        for(int i=0;i<9;i++){
             num[i] = sc.nextInt();
             sum += num[i];

        }
        System.out.println(sum);
        System.out.println(sum/10);

    }
}

package task3;

import java.util.Scanner;

public class tenth10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();

        if(Math.abs(a-b)==0.00){
            System.out.println("same");
        }
        else{
            System.out.println("different");
        }
    }
}

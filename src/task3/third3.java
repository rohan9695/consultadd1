package task3;

import java.util.Scanner;

public class third3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if(m<1 || m>12) {
            System.out.println("Invalid Details");
        } else if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
            System.out.println("There are 31 days in this month!");
        } else if(m==2) {
            System.out.println("There are either 28 or 29 days in month!");
        } else {
            System.out.println("There are 30 days in this month!");
        }
    }
}

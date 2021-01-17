package task3;

import java.util.Scanner;

public class Fifth5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long num = s.nextLong();
        int count =0;
        int sum = 0;
        while(num != 0){
            sum += num%10;
            num = num/10;
            ++count;

        }
        System.out.println(count);
        System.out.println(sum);
    }
}

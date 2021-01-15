import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num %2 == 0){
            System.out.println("New");
        }
        else if(num%2 == 0 &&(num>= 2 && num <=5)){
            System.out.println("OLD");

        }
        else if(num%2 == 0 &&(num>= 6 && num <=30)){
            System.out.println("NEW");

        }
        else if(num%2 == 0 &&( num >= 30)){
            System.out.println("OLD");

        }



    }
}

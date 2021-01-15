import java.util.Scanner;

public class first {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num % 3 ==0) && (num % 5 ==0)) {
            System.out.println("Consultadd JAVA training");

        }else if(num % 5 ==0){
            System.out.println("JAVA training");

        }else if(num % 3 ==0){
            System.out.println("Consultadd ");

        }
        else{
            System.out.println("none");
        }
    }
}

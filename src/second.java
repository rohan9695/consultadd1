import java.util.Scanner;

public class second {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b= sc.nextInt();
        int result = sc.nextInt();
        switch(result){
            case 1:
                result = a+b;
                System.out.println(result);
                if(result<0){
                    System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
                }
                break;
            case 2:
                result = a-b;
                System.out.println(result);
                if(result<0){
                    System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
                }

                break;
            case 3:
                result = a/b;
                System.out.println(result);
                if(result<0){
                    System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
                }

                break;
            case 4:
                result = a * b;
                System.out.println(result);
                if(result<0){
                    System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
                }

                break;
            case 5:
                int first1 = sc.nextInt();
                int second1= sc.nextInt();
                result = (first1+second1+a+b)/4;
                System.out.println(result);
                if(result<0){
                    System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
                }

                break;
            default:
        }


    }
}

public class java1 {
    public static void main(String[] args) {
        int a =5;
        int b=6;

        int temp = a;
        a=b;
        b=temp;

        System.out.println(a);
        System.out.println(b);
        System.out.println("swapping inplace");
        a = a+b;
        b= a-b;
        a= a-b;
        System.out.println(a);
        System.out.println(b);

    }
}

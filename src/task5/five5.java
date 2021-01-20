package task5;

public class five5 {
    public static void main(String[] args) {

        int a[] = {1,2,4,5,6,7,7,8,9,7,6,4,2};
        for(int i=0;i<a.length;i++){
            if(a[i]%2 == 0){
                System.out.println("Even numbers"+a[i]);
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]%2 == 1){
                System.out.println("Odd numbers"+a[i]);
            }
        }

    }
}

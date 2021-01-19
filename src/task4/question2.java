package task4;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,1,2,4,5,6,7};

          System.out.print(getSecondLargest(arr));

    }


    public static int getSecondLargest(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
        }

        return second;
    }
}

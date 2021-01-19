package task4;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int arr[] = {-1,1,2,4,5,6,7};
            System.out.print(getSecondSmallest(arr));
    }
        public static int getSecondSmallest(int[] arr){

        for(int j=0;j<arr.length;j++){
            for(int i=j+1; i<arr.length; i++){
                if(arr[j]> arr[i]){
                    int temp =arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            }
        return arr[1];
        }
    }

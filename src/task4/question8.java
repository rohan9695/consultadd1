package task4;

public class question8 {

        public static void main(String[] args) {


            int arr[] = {10,20,20,30,30,40,50,50};
            int length = arr.length;
            length = removeDuplicateElements(arr);
            //printing array elements
                System.out.print(length+" ");

        }

        public static int removeDuplicateElements(int arr[]){
            int j = 1;
            for(int i=0;i<arr.length;i++){
                if(arr[i]!= arr[j-1]){
                    arr[j++] = arr[i];
                }

            }
            return j;
        }


    }

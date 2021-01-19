package task5;

public class secondQuestion {
    public static void main(String[] args) {

            int arr[]= {2,2,3,3,4,4,4,11,11,11,11};
            int sum =0;
            int min =arr[0];
            int max = arr[0];

            for(int i=1;i< arr.length;i++){
                if(arr[i] > max){
                    max = arr[i];
                }
                else if(arr[i]<min) {
                    min = arr[i];
                }
            }
            for(int i=0;i<arr.length;i++){
                if(i!= min && i!=max){
                    sum+=i;
                }
            }
            System.out.println(sum);
        }
    }

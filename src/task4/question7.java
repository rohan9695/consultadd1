package task4;

public class question7 {
    public static void main(String[] args) {

        int arr[]= {9,2,4,3,5,6};

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
        System.out.println(max-min);
    }
}

package task4;

public class question5 {
    public static void main(String[] args) {
        int arr[] ={1,2,4,0,0,0,2,5,6,67};
        int n =arr.length;
        int count =0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count++] = arr[i];

            }
        }
        while(count <n){
            arr[count++] = 0;
        }
        for(int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }

    }
}

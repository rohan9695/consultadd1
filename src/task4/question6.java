package task4;

public class question6 {
    public static void main(String[] args) {
        int arr[] ={1,2,4,5,5,5,6,6,6};
        int n =arr.length;
        int count =0;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                arr[i]=0;
            }
        }
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

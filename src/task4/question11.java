package task4;

public class question11 {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,80,90,100};
        int n = arr.length;
        boolean x = true;
        int[] temp = new int[n];
        int s = 0, l = n-1;
        for(int i =0;i<n;i++){
            if(x){
                temp[i] = arr[l--];
            }else {
                temp[i] = arr[s++];

            }
            x = !x;
        }
        for(int i=0;i<n;i++) {
            System.out.println(temp[i]);
        }
    }
}

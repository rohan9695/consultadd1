package task4;

public class question10 {
    public static void main(String[] args) {
        int []  inputar = {-4,6,1,-6,4,5};
        int num = 0;
        for(int i=0;i<inputar.length;i++){
            for(int j=i+1;j<inputar.length;j++){
                if(inputar[i]+inputar[j] == num){
                    System.out.println(inputar[i]+","+inputar[j]);
                }
            }
        }

    }
}

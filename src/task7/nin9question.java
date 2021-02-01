package task7;

public class nin9question {
    public static void main(String[] args) {

        int a[] = { 1,2,24,5,6,7,8,292};


        int max = a[0] ;
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max =a[i];
            }
        }
        System.out.println(max);

    }
}

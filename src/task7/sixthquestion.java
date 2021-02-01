package task7;

public class sixthquestion {
    public static void main(String[] args) {

        int n  = 153;
        int a,c=0;
        int temp =n;
        while(n>0){
            a =n %10;
            n= n/10;
            c = c+(a*a*a);

        }
        if(temp == c){
            System.out.print("armstrong number");
        }
        else{
            System.out.print("not");
        }
    }
}

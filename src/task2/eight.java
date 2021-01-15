import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            String a = sc.nextLine();
            int count=0;
            char[] ch = new char[a.length()];
            for (int i=0;i<a.length();i++){
                ch[i] = a.charAt(i);
                if(ch[i]=='r'|| ch[i]=='a'||ch[i]=='n'||ch[i]=='d'||ch[i]=='o'||ch[i]=='m'){
                    count =1;
                }
                else{
                    count =0;
                }

            }
                if(count == 1){
                    System.out.println("FOUND");
                }
                else{
                    System.out.println("Not Found");
                }






    }
}

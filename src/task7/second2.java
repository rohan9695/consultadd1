package task7;

public class second2 {
    public static void main(String[] args) {

        String a = "Hello";
        char[] input = a.toCharArray();
        for(int i=0;i<a.length();i++){
            boolean u = true;
            for(int j=0;j<a.length();j++){
                if(i!=j && input[i] == input[j]){
                    u = false;
                    break;
                }
            }
            if(u){
                System.out.println("first unique charachter is "+a.charAt(i));
            }
        }

    }
}

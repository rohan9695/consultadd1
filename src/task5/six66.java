package task5;

public class six66 {
    public static void main(String[] args) {

        String str = "Hello World";
        char[] c = str.toCharArray();

        for(int i=0;i<c.length;i++){
            char ch = c[i];
            if(Character.isLowerCase(ch)){
                c[i]= Character.toUpperCase(ch);
            }else if(Character.isUpperCase(ch)){
                c[i] = Character.toLowerCase(ch);
            }
        }
        System.out.println(c);
    }
}

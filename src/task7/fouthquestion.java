package task7;

import java.util.Arrays;

public class fouthquestion {
    public static void main(String[] args) {


        String a = "Helos";
        System.out.print(stringarg(a));
    }
        static  boolean stringarg(String str){
            str = str.toLowerCase();
            int len = str.length();

            char arr[] = str.toCharArray();

            Arrays.sort(arr);
            for (int i = 0; i < len - 1; i++) {
                if (arr[i] == arr[i + 1])
                    return false;
            }
            return true;
        }
    }


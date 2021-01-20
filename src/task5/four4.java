package task5;

import java.util.Arrays;

public class four4 {
    public static void main(String[] args) {
        String api = "lloworld";

        System.out.print(stringarg(api));

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


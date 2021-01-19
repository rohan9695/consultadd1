package task5;

import java.util.Scanner;

public class firstquestion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numwords = scan.nextInt();
        String sentence = scan.nextLine();
        String shortestword = new String();
        String[] words = sentence.split(" ");
        for (int i = 0; i < numwords; i++) {
            if (shortestword.length() > words[i].length()) {
                shortestword = words[i];

            }
        }
        System.out.println(shortestword);
        //#cant solve this one
    }
}

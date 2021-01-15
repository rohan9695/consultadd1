import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] numbers = {10, 20, -1, 40, 50};
        for(int x : numbers ) {
            if( x <= 0 ) {
                break;
            }
            System.out.print( "It’s Over" );
            System.out.print("\n");
        }
        for(int x : numbers ) {
            if (x  >= 0) {
                continue;
            }
            System.out.print("Good Going");
            System.out.print("\n");
        }

    }
}

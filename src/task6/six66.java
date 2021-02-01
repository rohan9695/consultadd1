package task6;

public class six66 {

    public static void main(String[] args) {
        programming p1 = new programming();
        programming p2 = new programming("JAVA");
    }

    static class programming{

        public  programming(){
            System.out.println("I love programming");
        }
        public programming(String java){
            System.out.println("i love "+java);
        }

    }
}

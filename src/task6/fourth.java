package task6;

public class fourth {
    public static void main(String[] args) {

            rectangle r1 = new rectangle();
            r1.d();
            rectangle r2 = new rectangle(50, 30);
            r2.d();
            rectangle r3 = new rectangle(20);
            r3.d();


    }

    static class rectangle{
        int length;
        int breadth;

        public rectangle(){
            this.length = 0;
            this.breadth = 0;
        }

        public rectangle(int v){
            this.length = v;
            this.breadth = v;
        }
        public rectangle(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }
        public void d(){
            int a = this.length*this.breadth;
            System.out.println(a);
        }
    }
}

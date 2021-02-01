package task6;

public class third3 {
    public static void main(String[] args) {
        student st1 = new student("name");
        st1.d();
        student st2 = new student();
        st2.d();
    }

    static class student {
        String name;



        public  student(String name) {
            this.name = name;

        }

        public student() {
            this.name = "unknown";
        }

        public void d(){
            System.out.println(this.name);
        }

    }
}

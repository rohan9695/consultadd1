package task6;

public class five55 {

    public static void main(String[] args) {

            amount a = new amount(30);
             amount a1 = new amount();
            a.d();
            a1.d();


    }
    static class amount{
        int amount1 = 50;
        int count=0;
        public amount(){
            System.out.println("No amount added");
            count++;
        }
        public amount(int v){
            int a = this.amount1+v;
            System.out.println("Amount added"+ a);
            count++;

        }
        public void d(){
            System.out.println(this.amount1+"Amount is added and transcation "+this.count );
        }

    }
}

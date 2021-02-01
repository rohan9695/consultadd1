package task6;

public class second {
    public static void main(String[] args) {

        employee emp1 = new employee("Robert", 1994, 1000, "64C- Walls Streat");
        employee emp2 = new employee("Sam", 2000, 10000, "68D- Walls Streat");

        employee emp3 = new employee("John", 1999, 1000, "26B- Walls Streat");
        emp1.emp();
        emp2.emp();
        emp3.emp();

    }

     static class employee  {
         private String name;
         private int year_of_joining;
         private int salary;
         private String address;

        public  employee(String name, int year_of_joining, int salary, String address) {
            this.name =name;
            this.year_of_joining =year_of_joining;
            this.salary =salary;
            this.address =address;
        }

        public void emp(){
            System.out.println(this.name+','+this.salary+','+this.year_of_joining+','+this.address);
        }


    }
}

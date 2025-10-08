public class twentythree{

    static class Employee{
        int id;
        String name;
        int salary;
        public void printdetails(){
            System.out.println( "Hello everyone my name is " + name);
            System.out.println(  "And my id number is " + id);
            System.out.println("And my salary is " + salary);
        }
    }

    public static void main(String[] args){
        System.out.println("This is a custom class");
        Employee rishi = new Employee();

    rishi.id = 33445566;
    rishi.name= "rishiraj karan";
    rishi.salary=4234323;
    

    rishi.printdetails();
    }
} 
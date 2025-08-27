import java.util.Scanner;

public class addname{

    public static void main(String[] args){

        System.out.println("What is your name");
        Scanner sc= new Scanner(System.in);
        String name =sc.next();
        System.out.println( "Hello "  +name+  " have a good day"); //here the quotation is important for the location of the name 
    }
}
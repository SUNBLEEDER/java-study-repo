import java.util.Scanner;

public class numenter {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the age you want to check whether you are eligible or not");
         int age = sc.nextInt();

        if(age>18){
            System.out.println("you are eligible to drive");

        }
        else{
            System.out.println("You are not eligible to drive");
        }

    }
    
}

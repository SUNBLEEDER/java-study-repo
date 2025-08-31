import java.util.Scanner;
public class third {
    public static void main(String[] args) {
        
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the student");
        age = sc.nextInt();

        switch(age){
            case 18:
               System.out.println("you are going to get a job");
               break;

            case 21:
               System.out.println("You are going to get a job");
               break;

            case 30:
               System.out.println("You are going to ger married");
               break;

            case 60:
               System.out.println("You are going to retitre");
               break;

            default:
               System.out.println("Enjoy");
        }
    }
}

import java.util.Scanner;
public class fourth {
    public static void main(String[] args) {
        

        byte n1,n2,n3;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the marks in maths");
         n1 = sc.nextByte();

         System.out.println("Enter the marks in physics");
         n2 = sc.nextByte();

         System.out.println("Enter the marks in chemistry");
         n3= sc.nextByte();

         float avg =(n1+n2+n3)/3.0f;
         System.out.println("Your percentage is " + avg);

         if(avg>40 && n1>33 && n2>33 && n3>33){
            System.out.println("The Student has passed");
         }
         else{
            System.out.println("The student is failed");
         }
        

    }
    
}

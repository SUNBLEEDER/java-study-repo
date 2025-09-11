import java.util.Scanner;

public class kmtomiles{
    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the the number of kilometers you want to convert to miles:");
        float num= sc.nextFloat();
        
        float convert= (float) (num*0.621371);

        System.out.println(convert);
        


        
    }
}
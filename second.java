import java.util.Scanner;
public class second {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the age of which you want to check the experiexnce");
        int age = sc.nextInt();
        if(age>56){
            System.out.println("You are very muuch experienced");
        }
        else if(age>46)             //you have to enter conditions everytime in else if
        {
            System.out.println("you are qualified and have enough experience");
        }
        else if (age>36)
        {
            System.out.println("You are semiexperienced for this job");
        }
        else if (age>26)
        {
           System.out.println("You have less than required experience");
        }
        else
        {
            System.out.println("You have no experience");
        }


    }
    
}

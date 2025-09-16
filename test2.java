// it is program for manually entering the numbers for getting their sums 


import java.util.Scanner;   //here scanner class is imported 


public class test{          //here the class is created 
    public static void main(String[] args){   //here the main method is created 

        Scanner sc = new Scanner(System.in);   //here the scanner object is created 

        System.out.println("Enter the first number:");   //here the first number is entered 
        int num= sc.nextInt();                           //here the first number is stored in num variable 

        System.out.println("Enter the second number:");  //here the second number is entered 
        int num2= sc.nextInt();                          //here the second number is stored in num2 variable 

        System.out.println("Enter the third number:");   //here the third number is entered 
        int num3= sc.nextInt();                          //here the third number is stored in num3 variable 

        int sum=num+num2+num3;                          //here the sum of three numbers is calculated and stored in sum variable 

        System.out.println(sum);                         //here the sum is printed 

        System.out.println("the three numbers that you have entered are :"  +  num + ", " + num2 + ", " + num3); //here the three numbers are printed

public class twentytwo{
   /*  static int fact(int n ){
        if(n==1||n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }

        public static void main(String[] args){
        int n =67;  // here the error was showing because i havent entered the value of n in the code 

        System.out.println(fact(n));
        }
    
}*/

    static int math(int n ){
        if(n==1||n==0){
            return 1;
        }
        else{
            return n*math(n-1);
        }
    }

        public static void main(String[] args){
        int n =6;  // when i have to give a bigger number then i have to use biginteger for larger input  

        System.out.println(math(n));
        }
    
}
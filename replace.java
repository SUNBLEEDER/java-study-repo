public class replace {
    public static void main(String[] args) {
        

        String letter = "Dear <|name>| thanks a lot!";
        letter = letter.replace("<|name>|","Rishi");
        System.out.println(letter);
    }
    
}

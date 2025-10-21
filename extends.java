public class extends {
    public static void main(String [] args) {

        class Animal{
            void sound(){
                System.out.println("Animals makes sounds");
            }
        }

        class Dog extends Animal{
            void sound(){
                System.out.println("The dog barks");
            }
        }

        Dog d = new Dog();
        d.sound();
    }
}

package OOP_Part_1.Classes_Part_1.Inheritance_Part_1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(1,1,1,1, "ant");

        Dog dog = new Dog(4,3,"woofer",2,4,16,5,"Black");
        dog.eat();
//        dog.walk();
        dog.run();
    }
}

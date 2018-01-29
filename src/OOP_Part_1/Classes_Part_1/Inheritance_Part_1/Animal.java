package OOP_Part_1.Classes_Part_1.Inheritance_Part_1;

public class Animal {

    private int brain,size,body,weight;
    private String name;

    public Animal(int brain, int size, int body, int weight, String name) {
        this.brain = brain;
        this.size = size;
        this.body = body;
        this.weight = weight;
        this.name = name;
    }

    public void eat(){
        System.out.println("Animal.eat() Called");
    }

    public void move(int speed){
        System.out.println("Animal.move() called.   Animal is moving at " + speed);
    }

    public int getBrain() {
        return brain;
    }

    public int getSize() {
        return size;
    }

    public int getBody() {
        return body;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}

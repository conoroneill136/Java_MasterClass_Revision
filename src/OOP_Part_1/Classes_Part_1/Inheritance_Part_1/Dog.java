package OOP_Part_1.Classes_Part_1.Inheritance_Part_1;

public class Dog extends Animal{

    private int eyes,legs,tall,teeth;
    private String coat;

    public Dog( int size, int weight, String name,int eyes, int legs, int teeth,int tall,String coat) {
        super(1, size, 1, weight, name);
        this.eyes = eyes;
        this.legs = legs;
        this.tall = tall;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}

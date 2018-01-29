package OOP_Part_1.Classes_Part_1.Inheritance_Part_1;

public class Fish extends Animal{

    private int gills,eyes,fins;

    public Fish(int size, int weight, String name, int gills, int eyes, int fins) {
        super(1, size, 1, weight, name);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }


    private void rest(){

    }

    private void moveMuscles(){

    }

    private void moveBackFin(){

    }

    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }


}

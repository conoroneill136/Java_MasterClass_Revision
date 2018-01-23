package WhileDoWhile;

public class Main        {

    public static void main(String[] args) {
        int number = 5;
        int finalNumber = 20;
        int count = 0;
        while(number <= finalNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            System.out.println("Even Number" + number);
            number++;
            count++;
            if(count==5)
                break;
        }
        System.out.println("Total Number of even numbers found is "+ count);
    }

    public static boolean isEvenNumber(int number){
        if((number%2)!=0)
            return false;
        return true;
    }

}

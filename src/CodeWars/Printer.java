package CodeWars;

public class Printer {

    public static String printerError(String s) {
        char[] validColours = {'a','b','c','d','e','f','g','h','i','j','k','l','m'};
        int incorrect=0;
        boolean valid = false;
        for(int i = 0 ; i < s.length(); i++){
            for(int j = 0; j < validColours.length;j++){
                if(s.charAt(i)== validColours[j]){
                    valid = true;
                }
            }
            if(!valid){
                incorrect++;
            }
            valid=false;
        }
        return incorrect + "/" + s.length();
    }

    public static void main(String[] args) {
        System.out.println(printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"));
    }
}


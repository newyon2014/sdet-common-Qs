package Numbers;

public class CheckGivenNumberIsBinary {

    public static boolean isBinary2 (int num){
        return String.valueOf(num).matches("[0-1]+");
    }

    public static boolean isBinary(int number){
        boolean isBinary = true;
        while (number !=0){
            int remainder = number%10;
            if(remainder >1){
                isBinary = false;
                break;
            } else {
                number = number/10;
            }
        }
        return isBinary;
    }

    public static void main(String[] args) {
        System.out.println(isBinary(1011));
        System.out.println(isBinary(2345));
    }
}

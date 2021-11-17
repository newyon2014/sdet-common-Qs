package Numbers;

public class ReverseNumberByrecursion {

    public static void rev (int number){
        if(number < 10){
            System.out.println(number);
            return;
        }else {
            System.out.print(number%10);
            rev(number/10);
        }
     }

    public static void main(String[] args) {
        rev(9);
        rev(909);
        rev(001);
        rev(100);
        rev(0);


    }
}

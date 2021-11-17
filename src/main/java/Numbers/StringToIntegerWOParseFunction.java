package Numbers;

public class StringToIntegerWOParseFunction {

    public static int StringToNumber (String str){
        int num = 0;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            num = num * 10 + ((int) str.charAt(i) - 48);
        }
        return num;
    }

    // AlternateSolution

    public static int convertToInteger(String str){
        int sum = 0;
        int zeroASCII = (int)'0'; // 48
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int asc = (int) ch[i];
            sum = sum*10 + (asc - zeroASCII);
           }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(StringToNumber("123"));
        System.out.println(convertToInteger("123"));

    }
}

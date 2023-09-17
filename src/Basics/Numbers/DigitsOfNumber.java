package Basics.Numbers;

public class DigitsOfNumber {
    public static void main(String[] args) {
        int num = 1000;
        int num2 = 1000;
        System.out.println(extractNum(num));
        System.out.println(extractNum(num2));
    }
    public static String extractNum(int num){
        //first counting number of digits in the given number
        int numberOfDigits = 0;
        while(num !=0){
            num = num/10;
            numberOfDigits++;
        }

        return "";
    }
}

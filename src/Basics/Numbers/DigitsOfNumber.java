package Basics.Numbers;

public class DigitsOfNumber {
    public static void main(String[] args) {
        int num = 1548634;
        int num2 = 1000;
        System.out.println(extractNum(num));
        System.out.println(extractNum(num2));
    }
    public static String extractNum(int num){
        //first counting number of digits in the given number
        int temp =num;
        StringBuilder sb = new StringBuilder();
        int numberOfDigits = 0;
        while(temp !=0){
            temp = temp/10;
            numberOfDigits++;
        }
        int div = (int)Math.pow(10,numberOfDigits-1);
        while(div != 0){
            int quotient = num/div;
            sb.append(quotient);
            sb.append("+");
            num = num%div;
            div = div/10;
        }

        return sb.toString();
    }
}

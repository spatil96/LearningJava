package LeetCode.Arrays;

public class Mercor {
    public static void main(String[] args) {
        String number = "2466";
//        String result = groupSum(number);
//        System.out.println("Grouped sum of digits: " + result);
        System.out.println(groupSum(0));
    }

    public static int groupSum(int num) {
        StringBuilder result = new StringBuilder();
        String number = String.valueOf(num);
        int count = 1;
        char currentDigit = number.charAt(0);

        for (int i = 1; i < number.length(); i++) {
            if (number.charAt(i) == currentDigit) {
                count++;
            } else {
                result.append(count).append(currentDigit);
                count = 1;
                currentDigit = number.charAt(i);
            }
        }

        // Append the count and the last digit
        result.append(count).append(currentDigit);

        return Integer.valueOf(result.toString());
    }
}

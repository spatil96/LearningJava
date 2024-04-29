package HackerRank.Java;

public class CountingValleys {
    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
    }

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int res = 0;
        int temp = 0;
        for(int i=0; i<steps; i++){
            if(path.charAt(i) == 'U'){
                if(temp == -1){res++;}
                temp++;
            }else if (path.charAt(i) == 'D'){
                temp--;
            }

        }
        return res;
    }
}

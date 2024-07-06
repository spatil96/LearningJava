package LeetCode.Easy;

public class PassThePillow2582 {
    public static void main(String[] args) {
        System.out.println(passThePillow(3,5));
    }
    // public int passThePillow(int n, int time) {
    //      int person = 1; // Start from the first person
    //     int direction = 1; // Initially moving forward (towards higher index)

    //     while (time != 0) {
    //         if (direction == 1) { // Moving forward
    //             person++;
    //             if (person == n) { // If reached the end, change direction
    //                 direction = -1;
    //             }
    //         } else { // Moving backward
    //             person--;
    //             if (person == 1) { // If reached the start, change direction
    //                 direction = 1;
    //             }
    //         }
    //         time--;
    //     }
    //     return person;
    // }
    public static int passThePillow(int n, int time) {
        int cycleLength = 2 * (n - 1);
        int posInCycle = time % cycleLength;

        if (posInCycle < n) {
            return posInCycle + 1;
        } else {
            return cycleLength - posInCycle + 1;
        }
    }
}

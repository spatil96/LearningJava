package LeetCode.OOPsAndProgrammingSkills;

public class DesignParkingSystem1603 {
    public static void main(String[] args) {
        // Initialize the ParkingSystem with 1 big, 1 medium, and 0 small spaces.
        ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);

        // Test adding a big car. Should return true.
        System.out.println("Add big car: " + parkingSystem.addCar(1)); // Output: true

        // Test adding a medium car. Should return true.
        System.out.println("Add medium car: " + parkingSystem.addCar(2)); // Output: true

        // Test adding a small car. Should return false since there are no small spaces.
        System.out.println("Add small car: " + parkingSystem.addCar(3)); // Output: false

        // Test adding another big car. Should return false since there are no more big spaces.
        System.out.println("Add another big car: " + parkingSystem.addCar(1)); // Output: false

        // Test adding another medium car. Should return false since there are no more medium spaces.
        System.out.println("Add another medium car: " + parkingSystem.addCar(2)); // Output: false
    }

}
class ParkingSystem {
    int[] spaces = new int[4];
    public ParkingSystem(int big, int medium, int small) {
        spaces[1] = big;
        spaces[2] = medium;
        spaces[3] = small;
    }

    public boolean addCar(int carType) {
        if(spaces[carType] > 0){
            spaces[carType] = spaces[carType] - 1;
            return true;
        }
        return false;
    }
}
class ParkingSystem1 {
    private  int b=0; int s=0; int m=0;
    public ParkingSystem1(int big, int medium, int small) {
        b=big;
        m=medium;
        s=small;
    }

    public boolean addCar(int carType) {
        if(carType == 1) {
            if (b > 0) {
                b--;
                return true;
            }
        } else if (carType == 2) {
            if (m > 0) {
                m--;
                return true;
            }
        } else if (carType == 3) {
            if (s > 0) {
                s--;
                return true;
            }
        }
        return false;
    }
}
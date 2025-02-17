import java.util.Random;

public class ThreeWayDisjointImproved {

    public boolean isDisjoint(int[] A, int[] B, int[] C, int loopIterations) {
        boolean value = true; // Assume no o common value found
        for(int i = 0; i < loopIterations; i++) {
            for (int a : A) {
                for (int b : B) {
                    if (a == b) { // Check for match between A and B
                        for (int c : C) {
                            if (a == c) { // Check for match between A/B and C
                                value = false; // Found a common value, not disjoint
                            }
                        }
                    }
                }
            }
        }
        return value;
    }


    public static void main(String[] args) {
        // Test run parameters
        int inputArraySize1 = 1000;
        int inputArraySize2 = 2000;
        int timesToRun = 25;


        // Create an instance of ThreeWayDisjointImproved
        ThreeWayDisjointImproved threeWayDisjointImproved = new ThreeWayDisjointImproved();

        // Test first size
        System.out.println("Building arrays...");
        int[] A1 = generateRandomIntArray(inputArraySize1);
        int[] B1 = generateRandomIntArray(inputArraySize1);
        int[] C1 = generateRandomIntArray(inputArraySize1);
        System.out.println("Running isDisjoint...");
        long startTime = System.currentTimeMillis();
        boolean result = threeWayDisjointImproved.isDisjoint(A1, B1, C1,timesToRun);
        long endTime = System.currentTimeMillis();
        long elapsed = endTime - startTime;
        System.out.println("Time in milliseconds: " + elapsed);
        System.out.println("Is disjoint: " + result);

        // Test second size
        System.out.println("Building arrays...");
        int[] A2 = generateRandomIntArray(inputArraySize2);
        int[] B2 = generateRandomIntArray(inputArraySize2);
        int[] C2 = generateRandomIntArray(inputArraySize2);
        System.out.println("Running isDisjoint...");
        startTime = System.currentTimeMillis();
        result = threeWayDisjointImproved.isDisjoint(A2, B2, C2, timesToRun);
        endTime = System.currentTimeMillis();
        elapsed = endTime - startTime;
        System.out.println("Time in milliseconds: " + elapsed);
        System.out.println("Is disjoint: " + result);
    }

    // Helper method to generate random integer arrays
    public static int[] generateRandomIntArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size); // Generates random integers between 0 and size
        }
        return array;
    }
}

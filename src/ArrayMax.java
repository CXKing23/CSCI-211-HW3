import java.util.Random;

public class ArrayMax {

    // >>> Code from book here
    /** Returns the maximum value of a nonempty array of numbers. */
    public static double arrayMax(double[] data, int loopIterations) {
        int n = data.length;
        double currentMax = data[0];              // assume first entry is biggest (for now)
        // Loop here to run this multiple times
        for (int i = 0; i < loopIterations; i++)
            for (int j=1; j < n; j++)                 // consider all other entries
                if (data[j] > currentMax)             // if data[j] is biggest thus far...
                    currentMax = data[j];             // record it as the current max
        return currentMax;
    }

    // >>> Helper methods defined here
    // Those methods needed to run tests on book examples
    public static double[] generateRandomDoubleArray(int size) {
        Random random = new Random();
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble()*size; // Generates random double between 0.0 and 1.0
        }
        return array;
    }

    // Main for test run
    public static void main(String[] args){

        // Test run parameters
        int inputArraySize1 = 134217728;
        int inputArraySize2 = 268435456;
        int timesToRun = 25;

        System.out.println("Building array...");
        double[] myData = generateRandomDoubleArray(inputArraySize1);
        //double[] myData = {1.1, 1.2, 1.3}; for test
        System.out.println("Running arrayMax...");
        long startTime = System.currentTimeMillis();
        double largest = arrayMax(myData, timesToRun);
        long endTime = System.currentTimeMillis();         // record the ending time
        long elapsed = endTime - startTime;
        String outputString = new String(Long.toString(elapsed));
        System.out.println(outputString);
        double elapsedseconds = (double) elapsed/1000;
        outputString = ("Time in seconds is: " +
                String.format("%.5f", elapsedseconds));
        System.out.println(outputString);
        System.out.println("Largest is: " + (String.format("%.3f", largest)));
        // 2nd run to compare
        System.out.println("Building array...");
        myData = generateRandomDoubleArray(inputArraySize2);
        //double[] myData = {1.1, 1.2, 1.3};
        System.out.println("Running arrayMax...");
        startTime = System.currentTimeMillis();
        largest = arrayMax(myData, timesToRun);
        endTime = System.currentTimeMillis();         // record the ending time
        elapsed = endTime - startTime;
        outputString = new String(Long.toString(elapsed));
        System.out.println(outputString);
        elapsedseconds = (double) elapsed/1000;
        outputString = ("Time in seconds is: " +
                String.format("%.5f", elapsedseconds));
        System.out.println(outputString);
        System.out.println("Largest is: " + (String.format("%.5f", largest)));
    }
}

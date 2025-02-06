Homework #3

The objective of this assignment is to gain experience with running timing tests against code and in this case to see how running times grow with input size. We will also continue to work with data structures and implement working code. We will use several book examples and "instrument" them.

First steps:
Download the HW3 repo from GitHub at: https://github.com/tqbartee/CSCI-211-HW3
The repo contains an object called "ArrayMax" which implements the array max algorithm in Section 4.3.1 of the book.
The ArrayMax object code includes three sections:
- The ArrayMax algorithm (copied from book item 4.3.1).
- A "Helper" method generateRandomDoubleArray, which generates an array of random doubles (real numbers) to fit within a given size array of doubles. This generates the input for the ArrayMax algorithm run.
- A Main which creates the randomDoubleArray and runs the tests.
The main includes test run parameters that specify the parameters for test runs of ArrayMax for timing purposes. The parameters specify the size of the first and second array for test. Note that the second array size is twice the first, so we can test the timing of the code with N and then with 2N input sizes. These inputs are drawn from a powers-of-2 spreadsheet, which makes it easy to do log calculations if needed. That is a recommended practice but the algorithms will run with other numbers too. Since this is a linear algorithm, we should see the running time for the larger array be 2X the time of the smaller array.

Core assignment:
Replicate the functionality of the ArrayMax object into two new java objects, 
ThreeWayDisjoint and ThreeWayDisjointImproved. These two objects will use the code in the book, Code Fragments 4.3.3 and 4.3.4.

Please write a helper method to support the two objects as follows:

public static int[][] generateSequentialIntArrays(int numarrays, int size)

This method will accept a number of arrays and a size and create a multi-dimensional array with integers that are the same as the array references (0, 1, 2, ..., n-1) for the first array, then starting at n...2n-1 for the second array and so forth. This will guarantee we are running with all unique numbers and the algorithm will run following a worst-case scenario (no triples). Then three one-dimensional arrays from the multi-dimensional array will be passed into the ThreeWayDisjoint and ThreeWayDisjointImproved methods to run the test.

You will need to (probably) adjust the numbers for inputArraySize1 and inputArraySize2 for the code to run in some reasonable timeframe (like a few seconds for the inputArraySize1). Verify that the time to run with InputArraySize2 is approximately 8X the time to run with inputArraySize1 since the algorithm growth with respect to array sizes is cubic.

The ThreeWayDisjointImproved will run in quadratic time as it will include two loops and not a third (unless there is a match). Your run will demonstrate this.

Let me know if any questions or issues and of course errors in the code. 

TB


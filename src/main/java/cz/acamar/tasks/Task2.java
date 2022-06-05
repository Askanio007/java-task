package cz.acamar.tasks;

public class Task2 {

    /**
     * Task 2. Squares of a sorted array.
     * <p>
     * Given an integer array sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     * <p>
     * Example input: [-4,-1,0,3,10]
     * Expected output: [0,1,9,16,100]
     * <p>
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     * @param input - an integer array sorted in non-decreasing order
     * @return - an array of the squares of each number sorted in non-decreasing order
     */
    public int[] squaresOfSortedArray(int[] input) {
        int[] newNums = new int[input.length];
        int firstIndex = 0;
        int lastIndex = input.length - 1;
        for (int i = input.length - 1; i > -1; i--) {
            int firstSqr = input[firstIndex] * input[firstIndex];
            int lastSqr = input[lastIndex] * input[lastIndex];
            if (firstSqr > lastSqr) {
                newNums[i] = firstSqr;
                firstIndex++;
            } else {
                newNums[i] = lastSqr;
                lastIndex--;
            }
        }
        return newNums;
    }
}

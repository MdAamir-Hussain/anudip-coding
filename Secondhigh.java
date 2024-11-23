public class Secondhigh {
    public static int findSecondHighest(int[] arr) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest && i != highest) {
                secondHighest = i;
            }
        }

        // Handle cases where there is no second highest value
        if (secondHighest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Array must have at least two distinct elements.");
        }

        return secondHighest;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 55, 68, 49, 23, 56, 78 };

        // Correctly print array elements
        System.out.print("Array elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Find and print the second highest element
        try {
            int secondHighest = findSecondHighest(arr);
            System.out.println("Second highest element: " + secondHighest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

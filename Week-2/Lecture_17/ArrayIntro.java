public class ArrayIntro {
    public static void main(String[] args) {
        // Declaring and creating an array of integers
        int[] numbers = new int[5];

        // Initializing array elements
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        // Accessing array elements
        int firstElement = numbers[0];
        int thirdElement = numbers[2];

        System.out.println("First element: " + firstElement);
        System.out.println("Third element: " + thirdElement);

        // Finding the length of the array
        int arrayLength = numbers.length;
        System.out.println("Array length: " + arrayLength);

        // Iterating through the array using foreach loop
        System.out.println("Array elements using foreach:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

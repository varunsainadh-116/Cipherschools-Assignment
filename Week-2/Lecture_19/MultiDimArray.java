import java.util.Scanner;

public class MultiDimArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaring and creating a 2D array
        int[][] matrix = new int[3][3];

        // Taking input for elements of the 2D array
        System.out.println("Enter elements of the 2D array (3x3):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Printing the elements of the 2D array
        System.out.println("Elements of the 2D array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}

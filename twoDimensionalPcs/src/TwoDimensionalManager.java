import java.util.Random;

public class TwoDimensionalManager {
    static Random r = new Random();

    public static void main(String[] args) {
        isUpperTriangleMatrix();
        System.out.println();
        hasParity();
    }

    // creating a random zero-one matrix and checking if its an upper triangle
    // matrix
    public static void isUpperTriangleMatrix() {
        // creating a random matrix
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++)
                matrix[i][j] = r.nextInt(2);
        }

        // printing the random matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        // checking if the random matrix is uptri and printing the result
        boolean isEqual = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i > j && matrix[i][j] != 0) {
                    isEqual = false;
                    break;
                }
            }
        }

        System.out.println(isEqual ? "it is an upper triangle matrix"
                : "it is not an upper triangle matrix");

        System.out.println();

        // creating a second matrix which is an upper triangle matrix
        int[][] secondMatrix = new int[4][4];

        for (int i = 1; i < secondMatrix.length; i++) {
            for (int j = 0; j < i; j++)
                secondMatrix[i][j] = 0;
        }

        for (int i = 0; i < secondMatrix.length; i++) {
            for (int j = secondMatrix.length - 1; j >= i; j--)
                secondMatrix[i][j] = 1;
        }

        // printing the second matrix
        for (int i = 0; i < secondMatrix.length; i++) {
            for (int j = 0; j < secondMatrix.length; j++)
                System.out.print(secondMatrix[i][j] + " ");
            System.out.println();
        }

        // double checking if the second matrix is an actual upper triangle matrix and
        // printing the result
        boolean isEqual2 = true;
        for (int i = 0; i < secondMatrix.length; i++) {
            for (int j = 0; j < secondMatrix.length; j++) {
                if (i > j && secondMatrix[i][j] != 0) {
                    isEqual2 = false;
                    break;
                }

                if (i <= j && secondMatrix[i][j] == 0) {
                    isEqual2 = false;
                    break;
                }
            }
        }

        System.out.println(isEqual2 ? "it is an upper triangle matrix"
                : "it is not an upper triangle matrix");
    }

    // creating a random matrix and checking if it has even sums on every row and
    // column
    public static void hasParity() {
        // creating the matrix
        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++)
                matrix[i][j] = r.nextInt(2);
        }

        // printing the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++)
                System.out.print(matrix[i][j] + " ");

            System.out.println();
        }

        // calculating and checking the sums
        boolean rowsParity = true;
        int rowSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                rowSum = rowSum + matrix[i][j];
            }

            if (rowSum % 2 != 0) {
                rowsParity = false;
                break;
            }

            rowSum = 0;
        }

        boolean columnsParity = true;
        int columnSum = 0;

        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                columnSum = columnSum + matrix[i][j];
            }

            if (columnSum % 2 != 0) {
                columnsParity = false;
                break;
            }

            columnSum = 0;
        }

        // printing the result
        if (rowsParity && columnsParity)
            System.out.println("this matrix has parity");
        else
            System.out.println("this matrix does not have parity");
    }
}

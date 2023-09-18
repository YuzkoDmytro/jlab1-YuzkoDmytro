import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмірність матриці n: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Введіть матрицю A:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int minColumnIndex = findMinColumn(matrix);

        for (int i = 0; i < minColumnIndex; i++) {
            cyclicShift(matrix);
        }

        System.out.println("Результат:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int findMinColumn(int[][] matrix) {
        int minColumnIndex = 0;
        int minElement = matrix[0][0];
        int n = matrix.length;

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                    minColumnIndex = j;
                }
            }
        }

        return minColumnIndex;
    }

    public static void cyclicShift(int[][] matrix) {
        int n = matrix.length;

        for (int j = 0; j < n; j++) {
            int temp = matrix[j][0];
            for (int i = 0; i < n - 1; i++) {
                matrix[j][i] = matrix[j][i + 1];
            }
            matrix[j][n - 1] = temp;
        }
    }
}
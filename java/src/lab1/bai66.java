// Example 6: bai66.java
package lab1;
//
import java.util.Scanner;

public class bai66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bạn muốn nhập ma trận từ bàn phím (1) hay sử dụng ma trận cố định (2)? ");
        int choice = scanner.nextInt();

        int[][] matrix1, matrix2;

        if (choice == 1) {
            matrix1 = readMatrixFromUser();
            matrix2 = readMatrixFromUser();
        } else if (choice == 2) {
            matrix1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            matrix2 = new int[][]{{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        } else {
            System.out.println("Lựa chọn không hợp lệ.");
            return;
        }

        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Hai ma trận có kích thước khác nhau. Không thể cộng.");
            return;
        }

        int[][] result = addMatrices(matrix1, matrix2);

        System.out.println("Ma trận sau khi cộng:");
        printMatrix(result);
    }

    public static int[][] readMatrixFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử thứ [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}


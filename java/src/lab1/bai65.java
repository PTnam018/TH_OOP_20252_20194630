//Example 5: bai65.java
package lab1;

import java.util.Arrays;
import java.util.Scanner;

public class bai65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bạn muốn nhập mảng từ bàn phím (1) hay sử dụng mảng cố định (2)? ");
        int choice = scanner.nextInt();
        
        int[] arr;
        if (choice == 1) {
            arr = readArrayFromUser();
        } else if (choice == 2) {
            arr = new int[]{5, 2, 9, 1, 5, 6}; // Sử dụng mảng cố định
        } else {
            System.out.println("Lựa chọn không hợp lệ.");
            return;
        }
        
        Arrays.sort(arr); // Sắp xếp mảng tăng dần
        
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
        
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        
        double average = (double) sum / arr.length;
        
        System.out.println("Tổng các phần tử trong mảng: " + sum);
        System.out.println("Giá trị trung bình của các phần tử trong mảng: " + average);
    }
    
    public static int[] readArrayFromUser() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập kích thước của mảng: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        
        return arr;
    }
}

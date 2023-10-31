// Example 3: bai63.java
package lab1;

import java.util.Scanner;

public class bai63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao của tam giác: ");
        int n = scanner.nextInt();
        
        // Vẽ tam giác
        for (int i = 1; i <= n; i++) {
            // In các dấu '*' cho từng hàng
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Xuống dòng
        }
    }
}

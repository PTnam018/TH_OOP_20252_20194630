// Example 4: bai64.java
package lab1;
import java.util.Scanner;
public class bai64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int daysInMonth = 0;
        while (true) {
            System.out.print("Nhập tháng (theo tên đầy đủ, viết tắt hoặc số): ");
            String inputMonth = scanner.nextLine();
            System.out.print("Nhập năm: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng thừa
            
            int month = getMonthNumber(inputMonth);
            if (month != -1 && isValidYear(year)) {
                daysInMonth = getDaysInMonth(month, year);
                if (daysInMonth != -1) {
                    break;
                }
            }
            
            System.out.println("Tháng hoặc năm không hợp lệ. Vui lòng nhập lại.");
        }
        
        System.out.println("Số ngày trong tháng là: " + daysInMonth);
    }
    
    public static int getMonthNumber(String inputMonth) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] monthAbbreviations = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
        String[] monthShortNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        
        for (int i = 0; i < months.length; i++) {
            if (inputMonth.equalsIgnoreCase(months[i]) || inputMonth.equalsIgnoreCase(monthAbbreviations[i]) || inputMonth.equalsIgnoreCase(monthShortNames[i]) 
            		|| inputMonth.equals(Integer.toString(i + 1))) {
                return i + 1; // Trả về số tháng (1-12)
            }
        }
        
        return -1; // Trả về -1 nếu không hợp lệ
    }
    
    public static boolean isValidYear(int year) {
        return year > 0 && year <= 9999;
    }
    
    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        
        return daysInMonth[month - 1];
    }
    
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}


package recursive;

import java.util.Scanner;

public class B22 {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B221==========");
        System.out.println("Kiểm tra chuỗi đối xứng");
        System.out.print("Nhập chuỗi: ");
        String str = readInput(inputString).trim();
        if(isSymmetry(str)){
            System.out.println("Chuỗi " + str + " là chuỗi đối xứng");
        } else {
            System.out.println("Chuỗi " + str + " không phải chuỗi đối xứng");
        }
        System.out.println("==========B222==========");
        System.out.println("Tính giá trị biểu thức");
        System.out.print("Nhập số: ");
        int number = inputNumber.nextInt();
        double result = result(number);
        System.out.println("Giá trị biểu thức của " + number + " là " + result);
    }

    public static String readInput(Scanner scanner) {
        String input = scanner.nextLine();
        if (!input.trim().isEmpty()) {
            return input;
        }
        System.out.println("Chuỗi không được để rỗng! Vui lòng nhập lại");
        return readInput(scanner);
    }

    public static boolean isSymmetry(String str) {
        return isSymmetryHelper(str, 0, str.length() - 1);
    }

    public static boolean isSymmetryHelper(String str, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        return isSymmetryHelper(str, left + 1, right - 1);
    }

    public static double result(int num){
        if (num == 0) {
            return 100;
        }
        double currentResult = (double) num * (num + 1)/((num  + 1) * (num + 2));
        return result(num - 1) + currentResult;
    }

}

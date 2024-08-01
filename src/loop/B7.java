package loop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class B7 {
    public void B71() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B71==========");
        System.out.println("Đọc số nguyên 1 chữ số");
        int num;
        do {
            System.out.print("Nhập số nguyên 1 chữ số: ");
            num = inputNumber.nextInt();
            if (num < 0 || num > 9) {
                System.out.println("Yêu cầu nhập lại!");
            }
        } while (num < 0 || num > 9);
        switch (num) {
            case 0:
                System.out.println("Không");
                break;
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bốn");
                break;
            case 5:
                System.out.println("Năm");
                break;
            case 6:
                System.out.println("Sáu");
                break;
            case 7:
                System.out.println("Bảy");
                break;
            case 8:
                System.out.println("Tám");
                break;
            case 9:
                System.out.println("Chín");
                break;
        }
    }

    public void B72() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B72==========");
        System.out.println("Cách đọc số có 2 chữ số");
        int num;
        do {
            System.out.print("Nhập số nguyên 2 chữ số: ");
            num = inputNumber.nextInt();
            if (num < 10 || num > 99) {
                System.out.println("Yêu cầu nhập lại!");
            }
        } while (num < 10 || num > 99);
        int tens = num / 10;
        int units = num % 10;
        switch (tens) {
            case 1:
                System.out.print("Mười");
                break;
            case 2:
                System.out.print("Hai mươi");
                break;
            case 3:
                System.out.print("Ba mươi");
                break;
            case 4:
                System.out.print("Bốn mươi");
                break;
            case 5:
                System.out.print("Năm mươi");
                break;
            case 6:
                System.out.print("Sáu mươi");
                break;
            case 7:
                System.out.print("Bảy mươi");
                break;
            case 8:
                System.out.print("Tám mươi");
                break;
            case 9:
                System.out.print("Chín mươi");
                break;
        }

        switch (units) {
            case 1:
                if (tens > 1) {
                    System.out.print(" mốt");
                } else {
                    System.out.print(" một");
                }
                break;
            case 2:
                System.out.print(" hai");
                break;
            case 3:
                System.out.print(" ba");
                break;
            case 4:
                System.out.print(" bốn");
                break;
            case 5:
                System.out.print(" năm");
                break;
            case 6:
                System.out.print(" sáu");
                break;
            case 7:
                System.out.print(" bảy");
                break;
            case 8:
                System.out.print(" tám");
                break;
            case 9:
                System.out.print(" chín");
                break;
        }
    }

    public void B73() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B73==========");
        System.out.println("Cách đọc số có 3 chữ số");
        int num;
        do {
            System.out.print("Nhập số có 3 chữ số: ");
            num = inputNumber.nextInt();
            if (num < 100 || num > 999) {
                System.out.println("Yêu cầu nhập lại!");
            }
        } while (num < 100 || num > 999);
        int hundreds = num / 100;
        int tens = (num % 100) / 10;
        int units = num % 10;
        switch (hundreds) {
            case 1:
                System.out.print("Một trăm");
                break;
            case 2:
                System.out.print("Hai trăm");
                break;
            case 3:
                System.out.print("Ba trăm");
                break;
            case 4:
                System.out.print("Bốn trăm");
                break;
            case 5:
                System.out.print("Năm trăm");
                break;
            case 6:
                System.out.print("Sáu trăm");
                break;
            case 7:
                System.out.print("Bảy trăm");
                break;
            case 8:
                System.out.print("Tám trăm");
                break;
            case 9:
                System.out.print("Chín trăm");
                break;
        }

        switch (tens) {
            case 0:
                System.out.print(" linh");
                break;
            case 1:
                System.out.print(" mười");
                break;
            case 2:
                System.out.print(" hai mươi");
                break;
            case 3:
                System.out.print(" ba mươi");
                break;
            case 4:
                System.out.print(" bốn mươi");
                break;
            case 5:
                System.out.print(" năm mươi");
                break;
            case 6:
                System.out.print(" sáu mươi");
                break;
            case 7:
                System.out.print(" bảy mươi");
                break;
            case 8:
                System.out.print(" tám mươi");
                break;
            case 9:
                System.out.print(" chín mươi");
                break;
        }

        switch (units) {
            case 1:
                if (tens > 1) {
                    System.out.print(" mốt");
                } else {
                    System.out.print(" một");
                }
                break;
            case 2:
                System.out.print(" hai");
                break;
            case 3:
                System.out.print(" ba");
                break;
            case 4:
                System.out.print(" bốn");
                break;
            case 5:
                System.out.print(" năm");
                break;
            case 6:
                System.out.print(" sáu");
                break;
            case 7:
                System.out.print(" bảy");
                break;
            case 8:
                System.out.print(" tám");
                break;
            case 9:
                System.out.print(" chín");
                break;
        }
        System.out.println();
    }

}

class MainB7 {
    public static void main(String[] args) {
        B7 b7 = new B7();
        Scanner inputNumber = new Scanner(System.in);
        int choice;
        do {
            System.out.println("==========B7==========");
            System.out.println("1. Một chữ số");
            System.out.println("2. Hai chữ số");
            System.out.println("3. Ba chữ số");
            System.out.println("0. Thoát chương trình");
            System.out.print("Nhập lựa chọn: ");
            choice = inputNumber.nextInt();
            switch (choice) {
                case 1:
                    b7.B71();
                    break;
                case 2:
                    b7.B72();
                    break;
                case 3:
                    b7.B73();
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Không có lựa chọn");
                    break;
            }
        } while (choice != 0);
    }
}

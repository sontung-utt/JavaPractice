package loop;

import java.util.ArrayList;
import java.util.Scanner;

public class B10 {
    public void B101() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B101==========");
        System.out.println("Tổng các tổ hợp từ 3 số ra số có 3 chữ số");
        int a, b, c;
        do {
            System.out.print("Nhập số a: ");
            a = inputNumber.nextInt();
            System.out.print("Nhập số b: ");
            b = inputNumber.nextInt();
            System.out.print("Nhập số c: ");
            c = inputNumber.nextInt();
            if (a == b || a == c || b == c) {
                System.out.println("3 số không được giống nhau");
            }
            if (a <= 0 || b <= 0 || c <= 0 || a > 9 || b > 9 || c > 9) {
                System.out.println("3 số phải lớn hơn 0 và nhỏ hơn 9");
            }
        } while (a == b || a == c || b == c || a <= 0 || b <= 0 || c <= 0 || a > 9 || b > 9 || c > 9);
        int count = 0;
        int[] arr = {a, b, c};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j != i) {
                    for (int k = 0; k < 3; k++) {
                        if (k != j && k != i) {
                            int total = arr[i] * 100 + arr[j] * 10 + arr[k];
                            System.out.println(total);
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println("Các tổ hợp tạo số có 3 chữ số là " + count);
    }

    public void B102() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B102==========");
        System.out.println("Tổng các tổ hợp từ 3 số ra số có 3 chữ số");
        int a, b, c;
        do {
            System.out.print("Nhập số a: ");
            a = inputNumber.nextInt();
            System.out.print("Nhập số b: ");
            b = inputNumber.nextInt();
            System.out.print("Nhập số c: ");
            c = inputNumber.nextInt();
            if (a <= 0 || b <= 0 || c <= 0 || a > 9 || b > 9 || c > 9) {
                System.out.println("3 số phải lớn hơn 0 và nhỏ hơn 9");
            }
        } while (a <= 0 || b <= 0 || c <= 0 || a > 9 || b > 9 || c > 9);
        int count = 0;
        int[] arr = {a, b, c};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    int total = arr[i] * 100 + arr[j] * 10 + arr[k];
                    if (!list.contains(total)) {
                        list.add(total);
                        System.out.println(total);
                        count++;
                    }
                }
            }
        }

        System.out.println("Các tổ hợp tạo số có 3 chữ số là " + count);
    }

    public void B103() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B103==========");
        System.out.println("Tổng các tổ hợp từ 3 số ra số có 3 chữ số");
        int a, b, c;
        do {
            System.out.print("Nhập số a: ");
            a = inputNumber.nextInt();
            System.out.print("Nhập số b: ");
            b = inputNumber.nextInt();
            System.out.print("Nhập số c: ");
            c = inputNumber.nextInt();
            if (a < 0 || b < 0 || c < 0 || a > 9 || b > 9 || c > 9) {
                System.out.println("3 số phải lớn hơn hoặc bằng 0 và nhỏ hơn 9");
            }
        } while (a < 0 || b < 0 || c < 0 || a > 9 || b > 9 || c > 9);
        System.out.println("Danh sách các số");
        int count = 0;
        int[] arr = {a, b, c};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (arr[i] != 0) {
                        int total = arr[i] * 100 + arr[j] * 10 + arr[k];
                        if (!list.contains(total)) {
                            list.add(total);
                            System.out.println(total);
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println("Các tổ hợp tạo số có 3 chữ số là " + count);
    }
}

class MainB10 {
    public static void main(String[] args) {
        B10 b10 = new B10();
        b10.B101();
        b10.B102();
        b10.B103();
    }
}
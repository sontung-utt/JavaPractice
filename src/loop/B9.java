package loop;

import java.util.Scanner;

public class B9 {
    public void B91() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B91==========");
        System.out.println("Tổng các tổ hợp cho 20000");
        int total = 20000;
        int count = 0;
        for (int i = 0; i <= total / 1000; i++) {
            for (int j = 0; j <= total / 2000; j++) {
                for (int k = 0; k <= total / 5000; k++) {
                    if (i * 1000 + j * 2000 + k * 5000 == total) {
                        System.out.println("Tờ 1000 cần " + i + " tờ, tờ 2000 cần " + j + " tờ, tờ 5000 cần " + k + " tờ");
                        count++;
                    }
                }
            }
        }
        System.out.println("Có tất cả " + count + " cách để có tổng 20000!");
    }

    public void B92() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B92==========");
        System.out.println("Tổng các tổ hợp cho số tiền bất kì");
        System.out.print("Nhập số tiền: ");
        int money = inputNumber.nextInt();
        int count = 0;
        for (int i = 0; i <= money / 1000; i++) {
            for (int j = 0; j <= money / 2000; j++) {
                for (int k = 0; k <= money / 5000; k++) {
                    if (i * 1000 + j * 2000 + k * 5000 == money) {
                        System.out.println("Tờ 1000 cần " + i + " tờ, tờ 2000 cần " + j + " tờ, tờ 5000 cần " + k + " tờ");
                        count++;
                    }
                }
            }
        }
        System.out.println("Có tất cả " + count + " cách để có tổng " + money + "!");
    }

    public void B93() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B93==========");
        System.out.println("Tổng các tổ hợp từ các số đã cho");
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
            if (a < 0 || b < 0 || c < 0 || a > 9 || b > 9 || c > 9) {
                System.out.println("3 số phải lớn hơn 0 và nhỏ hơn 9");
            }
        } while (a == b || a == c || b == c || a < 0 || b < 0 || c < 0 || a > 9 || b > 9 || c > 9);
        System.out.println("Danh sách các số");
        int[] arr = {a, b, c};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j != i) {
                    for (int k = 0; k < 3; k++) {
                        if (k != j && k != i) {
                            int total = arr[i] * 100 + arr[j] * 10 + arr[k];
                            System.out.println(total);
                        }
                    }
                }
            }
        }
    }
}

class MainB9 {
    public static void main(String[] args) {
        B9 b9 = new B9();
        b9.B91();
        b9.B92();
        b9.B93();
    }
}

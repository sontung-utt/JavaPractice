package loop;

import java.util.Scanner;

public class B6 {
    public void B61() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B61==========");
        System.out.println("Ước số nguyên dương");
        System.out.print("Nhập n: ");
        int n = inputNumber.nextInt();
        System.out.println("Danh sách ước số của " + n);
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Bội số nhỏ hơn 100 của " + n);
        for (int i = 1; i < 100; i++) {
            if (i % n == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void B62() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B62==========");
        System.out.println("Ước số nguyên lẻ lớn nhất");
        System.out.print("Nhập n: ");
        int n = inputNumber.nextInt();
        int maxOdd = -1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 != 0) {
                maxOdd = i;
            }
        }
        System.out.println("Ước số chung lẻ lớn nhất của " + n + " là " + maxOdd);
        int minEven;
        if (n % 2 == 0) {
            minEven = n;
        } else {
            minEven = n * 2;
        }
        System.out.println("Bội số chung chẵn nhỏ nhất của " + n + " là " + minEven);
    }

    public void B63() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B63==========");
        System.out.println("Ước chung lớn nhất - Bội chung nhỏ nhất");
        System.out.print("Nhập a: ");
        int a = inputNumber.nextInt();
        System.out.print("Nhập b: ");
        int b = inputNumber.nextInt();
        int a1 = Math.abs(a);
        int b1 = Math.abs(b);


        if (a1 == 0 || b1 == 0) {
            System.out.println("Không có ước chung");
        }
//        while (b1 != 0) {
//            int temp = b1;
//            b1 = a1 % b1;
//            a1 = temp;
//        }
        while (a1 != b1) {
            if (a1 > b1) {
                a1 = a1 - b1;
            } else {
                b1 = b1 - a1;
            }
        }
        System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + a1);
        int num = Math.abs(a * b)/a1;
        System.out.println("Bội chung nhỏ nhất của " + a + " và " + b + " là: " + num);
    }
}

class MainB6 {
    public static void main(String[] args) {
        B6 b6 = new B6();
        b6.B61();
        b6.B62();
        b6.B63();
    }
}

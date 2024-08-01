package loop;

import java.util.Scanner;

public class B5 {
    public void B51() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B51==========");
        System.out.println("Tính tổng n x (n + 1)");
        System.out.print("Nhập n: ");
        int n = inputNumber.nextInt();
        int sum = 0;
        for (int i = n; i >= 1; i--) {
            sum += i * (i + 1);
        }
        System.out.println("Tổng của " + n + " là: " + sum);
    }

    public void B52() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B52==========");
        System.out.println("Tính tổng phân số");
        System.out.print("Nhập n: ");
        int n = inputNumber.nextInt();
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += (double)((2 * i) + 1) / ((2 * i) + 2);
        }
        System.out.println("Tổng phân số: " + sum);
    }

    public void B53() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B53==========");
        System.out.println("Tổng phân số");
        System.out.print("Nhập n: ");
        int n = inputNumber.nextInt();
        double sum = 100;
        for (int i = 1; i <= n; i++) {
            sum += (double)i/(i + 2);
        }
        System.out.println("Tổng phân số: " + sum);
    }
}

class MainB5 {
    public static void main(String[] args) {
        B5 b5 = new B5();
        b5.B51();
        b5.B52();
        b5.B53();
    }
}

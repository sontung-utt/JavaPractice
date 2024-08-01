package recursive;

import java.util.Scanner;

public class B21 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B211==========");
        System.out.println("Tính lũy thừa của số nguyên");
        System.out.print("Nhập số nguyên: ");
        int number = inputNumber.nextInt();
        System.out.print("Nhập lũy thừa: ");
        int n = inputNumber.nextInt();
        System.out.println("Lũy thừa bậc " + n + " của " + number + " là " + pow(number, n));
        System.out.println("==========B212==========");
        System.out.println("Tìm số chữ số của số nguyên dương");
        System.out.print("Nhập số: ");
        int num = inputNumber.nextInt();
        System.out.println("Số " + num + " có " + count(num) + " chữ số");
    }

    public static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        }

        if (b < 0) {
            return 1 / pow(a, -b);
        }
        return a * pow(a, b - 1);
    }

    public static int count(int num){
        if (num == 0){
            return 0;
        }
        if(num < 10){
            return 1;
        }
        return 1 + count(num / 10);
    }
}

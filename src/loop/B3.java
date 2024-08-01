package loop;

import java.util.Scanner;

public class B3 {
    public void B31() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B31==========");
        System.out.println("Kiểm tra số lẻ từ a đến b");
        int a, b;
        do {
            System.out.print("Nhập số a: ");
            a = inputNumber.nextInt();
            System.out.print("Nhập số b: ");
            b = inputNumber.nextInt();
            if (a > b) {
                System.out.println("Yêu cầu nhập lại");
            }
        } while (a > b);
        System.out.println("Danh sách số lẻ từ " + a + " đến " + b);
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void B32() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B32==========");
        System.out.println("Fizz-Buzz");
        int a, b;
        do {
            System.out.print("Nhập số a: ");
            a = inputNumber.nextInt();
            System.out.print("Nhập số b: ");
            b = inputNumber.nextInt();
            if (a > b) {
                System.out.println("Yêu cầu nhập lại");
            }
        } while (a > b);
        System.out.println("Danh sách Fizz-Buzz");
        for (int i = a; i <= b; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public void B33() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B33==========");
        System.out.println("Số chính phương");
        int a, b;
        do {
            System.out.print("Nhập số a: ");
            a = inputNumber.nextInt();
            System.out.print("Nhập số b: ");
            b = inputNumber.nextInt();
            if (a > b) {
                System.out.println("Yêu cầu nhập lại");
            }
        } while (a > b);
        System.out.println("Danh sách số chính phương từ " + a + " đến " + b);
        for (int i = a; i <= b; i++) {
            if(Math.sqrt(i) == (int)Math.sqrt(i)){
                if(Math.sqrt(i) * Math.sqrt(i) == i) {
                    System.out.print(i + " ");
                }
            }

        }
        System.out.println();
    }
}

class MainB3 {
    public static void main(String[] args) {
        B3 b3 = new B3();
        b3.B31();
        b3.B32();
        b3.B33();
    }
}

package recursive;

import java.util.Scanner;

public class B20 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B201==========");
        System.out.println("Tính tổng các số");
        System.out.print("Nhập số: ");
        int num = inputNumber.nextInt();
        System.out.println("Tổng các số từ 1 đến " + num + " là " + sum(num));
        System.out.println("==========B202==========");
        System.out.println("Tính giai thừa");
        System.out.println("Giai thừa của " + num + " là " + factorial(num));
        System.out.println("==========B203==========");
        System.out.println("Ước chung lớn nhất của 2 số");
        System.out.print("Nhập số thứ nhất: ");
        int a = inputNumber.nextInt();
        System.out.print("Nhập số thứ hai: ");
        int b = inputNumber.nextInt();
        System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là " + findUCLN(a,b));
    }

    public static int factorial(int n) {
        if(n==0){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sum(int n) {
        if(n==1){
            return 1;
        }
        return n + sum(n - 1);
    }

    public static int findUCLN(int a, int b){
        if(b==0){
            return a;
        }
        return findUCLN(b,a%b);
    }
}

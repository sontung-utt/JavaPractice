package Condition;

import java.util.Scanner;

public class B1 {
    public void B11(){
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B11==========");
        System.out.println("Tìm số chẵn số lẻ");
        System.out.println("Nhập số: ") ;
        int n = inputNumber.nextInt();
        if(n%2==0){
            System.out.println(n + " là số chẵn!");
        } else {
            System.out.println(n + " là số lẻ");
        }
    }

    public void B12(){
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B12==========");
        System.out.println("Tìm số lớn nhất trong 3 số");
        System.out.println("Nhập số thứ nhất");
        int num1 = inputNumber.nextInt();
        System.out.println("Nhập số thứ hai");
        int num2 = inputNumber.nextInt();
        System.out.println("Nhập số thứ ba");
        int num3 = inputNumber.nextInt();
        int max = num1;
        if(num2>max){
            max = num2;
        }
        if(num3>max){
            max = num3;
        }
        System.out.println("Số lớn nhất trong 3 số là: " + max);
    }

    public void B13(){
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B13==========");
        System.out.println("Kiểm tra 3 cạnh của tam giác");
        System.out.println("Nhập cạnh thứ nhất");
        int num1 = inputNumber.nextInt();
        System.out.println("Nhập cạnh thứ hai");
        int num2 = inputNumber.nextInt();
        System.out.println("Nhập cạnh thứ ba");
        int num3 = inputNumber.nextInt();
        if(num1+num2>num3&&num1+num3>num2&&num2+num3>num1){
            System.out.println("Đây là 3 cạnh của tam giác");
        } else {
            System.out.println("Đây không phải 3 cạnh của tam giác");
        }
    }
}

class MainB1 {
    public static void main(String[] args) {
        B1 b1 = new B1();
        b1.B11();
        b1.B12();
        b1.B13();
;    }
}

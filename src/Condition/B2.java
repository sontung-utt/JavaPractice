package Condition;

import java.util.Scanner;

public class B2 {

    public void B21() {
        System.out.println("==========B21==========");
        System.out.println("Số lần rán bánh đa nem");
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Nhập số lượng bánh đa nem: ");
        int number = inputNumber.nextInt();
        int count = 0;
        if (number % 9 > 0) {
            count = number / 9 + 1;
        } else {
            count = number / 9;
        }
//        for (int i = number; i > 0; i = i-9){
//            count++;
//        }

        System.out.println("Nam phải rán " + count + " lần");
    }

    public void B22() {
        System.out.println("==========B22==========");
        Scanner inputNumber = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Tính lãi ngân hàng");
            System.out.println("1. Tính lãi đơn");
            System.out.println("2. Tính lãi kép");
            System.out.println("0. Thoát chương trình");
            System.out.print("Nhập lựa chọn: ");
            choice = inputNumber.nextInt();
            switch (choice) {
                case 1:
                    simpleInterest();
                    break;
                case 2:
                    doubleInterest();
                    break;
                case 0:
                    System.out.println("Thoát chương trình!");
                    break;
            }
        } while (choice != 0);
    }

    public void simpleInterest() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Tính lãi đơn");
        System.out.print("Nhập số tiền gốc: ");
        double principle = inputNumber.nextDouble();
        System.out.print("Nhập lãi suất hàng năm: ");
        double rate = inputNumber.nextDouble();
        System.out.print("Nhập số tháng gửi tiền: ");
        int month = inputNumber.nextInt();
        double total = (principle * (1 + rate * month));
        System.out.println("Số tiền lãi đơn sau " + month + " tháng là " + total);
    }

    public void doubleInterest() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Tính lãi kép");
        System.out.print("Nhập số tiền gốc: ");
        double principle = inputNumber.nextDouble();
        System.out.print("Nhập lãi suất hàng năm: ");
        double rate = inputNumber.nextDouble();
        System.out.print("Nhập số tháng gửi tiền: ");
        int month = inputNumber.nextInt();
        System.out.print("Nhập số tiền lãi được cộng vào mỗi năm: ");
        int n = inputNumber.nextInt();
        double total = principle * Math.pow(1 + (rate / n), n * month);
        System.out.println("Số tiền lãi kép sau " + month + " tháng là " + total);
    }

    public void B23() {
        System.out.println("==========B23==========");
        System.out.println("Phân loại học sinh");
        Scanner inputNumber = new Scanner(System.in);
        double[] marks = new double[3];
        for (int i = 0; i < marks.length; i++) {
            do {
                System.out.print("Nhập điểm thứ " + (i + 1) + ": ");
                marks[i] = inputNumber.nextDouble();
                if (marks[i] < 0 || marks[i] > 10) {
                    System.out.println("Yêu cầu nhập lại điểm!");
                }
            } while (marks[i] < 0 || marks[i] > 10);
        }
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        double avg = sum / 3;
        System.out.println("Điểm trung bình của học sinh là: " + avg);
        if (avg > 0 && avg <= 4) {
            System.out.println("Xếp loại yếu");
        } else if (avg > 4 && avg < 6.5) {
            System.out.println("Xếp loại trung bình");
        } else if (avg >= 6.5 && avg < 8.5) {
            System.out.println("Xếp loại khá");
        } else if (avg >= 8.5 && avg < 9.5) {
            System.out.println("Xếp loại giỏi");
        } else if (avg >= 9.5 && avg <= 10) {
            System.out.println("Xếp loại xuất sắc");
        }
    }
}

class MainB2 {
    public static void main(String[] args) {
        B2 b2 = new B2();
        b2.B21();
        b2.B22();
        b2.B23();
    }
}

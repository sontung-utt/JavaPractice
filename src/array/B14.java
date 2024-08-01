package array;

import java.util.Scanner;

public class B14 {
    public void B141(){
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B141==========");
        System.out.println("Tổng các phần tử trong mảng");
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int size = inputNumber.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            numbers[i] = inputNumber.nextInt();
        }
        System.out.println("Các phần tử trong mảng");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }
        System.out.println("Tổng các phần tử trong mảng: " + sum);
    }

    public void B142(){
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B142==========");
        System.out.println("Tổng các phần tử chia hết cho 3");
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int size = inputNumber.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            numbers[i] = inputNumber.nextInt();
        }
        System.out.println("Các phần tử trong mảng");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[i] % 3 == 0) {
                sum += numbers[i];
            }
        }
        System.out.println("Tổng các phần tử chia hết cho 3 trong mảng: " + sum);
    }

    public void B143(){
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B143==========");
        System.out.println("Tính trung bình các phần tử");
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int size = inputNumber.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            numbers[i] = inputNumber.nextInt();
        }
        System.out.println("Các phần tử trong mảng");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }
        double avg = (double) sum / size;
        System.out.println("Trung bình của các phần tử trong mảng: " + avg);
    }
}

class MainB14{
    public static void main(String[] args) {
        B14 b14 = new B14();
        b14.B141();
        b14.B142();
        b14.B143();
    }
}

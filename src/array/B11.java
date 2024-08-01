package array;

import java.util.Scanner;

public class B11 {

    public void B111() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B111==========");
        System.out.println("Tìm phần tử chẵn trong mảng");
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
        System.out.println("Các phần tử chẵn trong mảng");
        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }

    public void B112() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B112==========");
        System.out.println("Liệt kê các vị trí có giá trị âm");
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
        System.out.println("Vị trí các phần tử âm trong mảng");
        for (int i = 0; i < size; i++) {
            if (numbers[i] < 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void B113() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B113==========");
        System.out.println("Các phần tử trong mảng mà phần tử đó lớn hơn phần tử trước");
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
        System.out.println("Danh sách phần tử");
        for (int i = 1; i < size; i++) {
            if(numbers[i] > numbers[i - 1]){
                System.out.print(numbers[i] + " ");
            }
        }
    }
}

class MainB11 {
    public static void main(String[] args) {
        B11 b11 = new B11();
        b11.B111();
        b11.B112();
        b11.B113();
    }
}

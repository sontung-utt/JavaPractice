package sort_search;

import java.util.Scanner;

public class B29 {
    public static void main(String[] args) {
        System.out.println("==========B29==========");
        System.out.println("Đếm số lần xuất hiện của phần tử trong mảng dùng Map");
        Scanner inputNumber = new Scanner(System.in);
        int size;
        do {
            System.out.print("Nhập số phần tử trong mảng: ");
            size = inputNumber.nextInt();
            if (size < 2) {
                System.out.println("Số phần tử trong mảng phải lớn hơn hoặc bằng 2!");
            }
        } while (size < 2);
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            numbers[i] = inputNumber.nextInt();
        }

        System.out.println("Các phần tử trong mảng");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}

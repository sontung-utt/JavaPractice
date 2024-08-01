package array;

import java.util.ArrayList;
import java.util.Scanner;

public class B13 {
    public void B131() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B131==========");
        System.out.println("Tìm số lớn nhất trong mảng");
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
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng " + max);
    }

    public void B132() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B132==========");
        System.out.println("Tìm phần tử lớn thứ hai trong mảng");
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
        int max1 = numbers[0];
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (numbers[i] > max1) {
                max2 = max1;
                max1 = numbers[i];
            } else if (numbers[i] != max1 && numbers[i] > max2) {
                max2 = numbers[i];
            }
        }

        if(max2 == Integer.MIN_VALUE){
            System.out.println("Không có số lớn thứ hai");
        } else {
            System.out.println("Phần tử lớn thứ hai trong mảng là " + max2);
        }
    }

    public void B133() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B133==========");
        System.out.println("Tìm số lớn nhất trong mảng 2 chiều");
        System.out.print("Nhập số hàng của mảng: ");
        int size1 = inputNumber.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int size2 = inputNumber.nextInt();
        int[][] numbers1 = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print("Nhập phần tử hàng " + (i + 1) + " cột " + (j + 1) + ": ");
                numbers1[i][j] = inputNumber.nextInt();
            }
        }
        System.out.println("Các phần tử mảng hai chiều");
        for (int i = 0; i < size1; i++) {
            System.out.println();
            for (int j = 0; j < size2; j++) {
                System.out.print(numbers1[i][j] + " ");
            }
        }
        System.out.println();

        int max = numbers1[0][0];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (numbers1[i][j] > max) {
                    max = numbers1[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng 2 chiều là: " + max);
    }
}

class MainB13 {
    public static void main(String[] args) {
        B13 b13 = new B13();
        b13.B131();
        b13.B132();
        b13.B133();
    }
}

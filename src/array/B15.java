package array;

import java.util.ArrayList;
import java.util.Scanner;

public class B15 {
    public void B151() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B151==========");
        System.out.println("Kiểm tra mảng tăng dần");
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
        boolean isAscArray = false;
        for (int i = 1; i < size; i++) {
            if (numbers[i] > numbers[i - 1]) {
                isAscArray = true;
            } else {
                isAscArray = false;
            }
        }
        if (isAscArray) {
            System.out.println("Đây là mảng tăng dần");
        } else {
            System.out.println("Đây không phải mảng tăng dần");
        }
    }

    public void B152() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B152==========");
        System.out.println("Kiểm tra phần tử mảng a nằm trong mảng b");
        System.out.print("Nhập số lượng phần tử mảng thứ nhất: ");
        int size1 = inputNumber.nextInt();
        ArrayList<Integer> numbers1 = new ArrayList<>();
        for (int i = 0; i < size1; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng thứ nhất: ");
            numbers1.add(inputNumber.nextInt());
        }
        System.out.println("Các phần tử mảng đầu tiên");
        for (int i = 0; i < size1; i++) {
            System.out.print(numbers1.get(i) + " ");
        }
        System.out.println();
        System.out.print("Nhập số lượng phần tử mảng thứ hai: ");
        int size2 = inputNumber.nextInt();
        ArrayList<Integer> numbers2 = new ArrayList<>();
        for (int i = 0; i < size2; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng thứ hai: ");
            numbers2.add(inputNumber.nextInt());
        }
        System.out.println("Các phần tử mảng thứ hai");
        for (int i = 0; i < size2; i++) {
            System.out.print(numbers2.get(i) + " ");
        }
        System.out.println();
        if (numbers2.containsAll(numbers1)) {
            System.out.println("Các phần tử mảng thứ nhất nằm trong mảng thứ hai");
        }
        System.out.println("Các phần tử của mảng thứ nhất không nằm trong mảng thứ hai");
        for (int i = 0; i < size1; i++) {
            if (!numbers2.contains(numbers1.get(i))) {
                System.out.print(numbers1.get(i) + " ");
            }
        }
    }
}

class MainB15 {
    public static void main(String[] args) {
        B15 b15 = new B15();
        b15.B151();
        b15.B152();
    }
}

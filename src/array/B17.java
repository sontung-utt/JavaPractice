package array;

import java.util.ArrayList;
import java.util.Scanner;

public class B17 {
    public void B171() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B171==========");
        System.out.println("Tìm phần tử chung của 2 mảng");
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
        System.out.println("Các phần tử chung của 2 mảng");
        for (int i = 0; i < size1; i++) {
            if (numbers2.contains(numbers1.get(i))) {
                System.out.print(numbers1.get(i) + " ");
            }
        }
    }

    public void B172() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B172==========");
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
        ArrayList<Integer> numChild = findLongestIncreasingArray(numbers);
        System.out.println("Dãy con liên tiếp tăng dần dài nhất trong mảng");
        for (int i = 0; i < numChild.size(); i++) {
            System.out.print(numChild.get(i) + " ");
        }
    }

    public ArrayList<Integer> findLongestIncreasingArray(int[] arr) {
        int start = 0;
        int end = 0;
        int maxLength = 0;
        int currentStart = 0;
        int currentLength = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    start = currentStart;
                    end = i - 1;
                }
                currentStart = i;
                currentLength = 0;
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
            start = currentStart;
            end = arr.length - 1;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(arr[i]);
        }

        return list;
    }

    public void B173() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B173==========");
        System.out.println("Kiểm tra 1 mảng có chứa tất cả các số từ 1 đến n không");
        System.out.print("Nhập độ dài mảng: ");
        int size = inputNumber.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            numbers.add(inputNumber.nextInt());
        }
        System.out.println("Danh sách phần tử trong mảng");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
        System.out.print("Nhập N: ");
        int num = inputNumber.nextInt();
        ArrayList<Integer> listCheck = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            listCheck.add(i);
        }
        System.out.println("Mảng cần kiểm tra");
        for (int i = 0; i < num; i++) {
            System.out.print(listCheck.get(i) + " ");
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (!numbers.contains(i)) {
                list.add(i);
            }
        }
        System.out.println();
        if (numbers.containsAll(listCheck)) {
            System.out.println("Mảng gốc chứa tất cả các phần tử trong mảng từ 1 đến " + num);
        } else {
            System.out.println("Mảng gốc không chứa các phần tử từ 1 đến " + num);

            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
        }
    }
}

class MainB17 {
    public static void main(String[] args) {
        B17 b17 = new B17();
        b17.B171();
        b17.B172();
        b17.B173();
    }
}

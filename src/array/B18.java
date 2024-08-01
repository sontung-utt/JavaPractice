package array;

import java.util.ArrayList;
import java.util.Scanner;

public class B18 {
    public void B181() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B181==========");
        System.out.println("Tìm hai số trong mảng có tích lớn nhất");
        int size;
        do {
            System.out.print("Nhập độ dài mảng: ");
            size = inputNumber.nextInt();
            if (size < 2) {
                System.out.println("Độ dài của mảng phải lớn hơn hoặc bằng 2");
            }
        } while (size < 2);
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
            if (numbers[i] >= max1) {
                max2 = max1;
                max1 = numbers[i];
            }
        }
        int multi = max1 * max2;
        System.out.println(max1 + " và " + max2 + " là hai phần tử có tích lớn nhất: " + multi);
    }

    public void B182() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B182==========");
        System.out.println("Tìm dãy con liên tiếp có tổng lớn nhất");
        int size;
        do {
            System.out.print("Nhập độ dài mảng: ");
            size = inputNumber.nextInt();
            if (size < 2) {
                System.out.println("Độ dài của mảng phải lớn hơn hoặc bằng 2");
            }
        } while (size < 2);
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
        ArrayList<Integer> list = findMaxSumArray(numbers);
        System.out.println("Dãy con liên tiếp có tổng lớn nhất");
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            sum += list.get(i);
        }
        System.out.println();
        System.out.println("Tổng của dãy con: " + sum);
    }

    public ArrayList<Integer> findMaxSumArray(int[] arr) {
        int start = 0;
        int end = 0;
        int maxSum = 0;
        int currentStart = 0;
        int currentSum = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currentSum += arr[i];
            } else {
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    start = currentStart;
                    end = i - 1;
                }
                currentStart = i;
                currentSum = arr[i];
            }
        }

        if (currentSum > maxSum) {
            maxSum = currentSum;
            start = currentStart;
            end = arr.length - 1;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(arr[i]);
        }
        return list;
    }

    public void B183() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B183==========");
        System.out.println("Tìm số phần tử lớn nhất trong mảng");
        int size;
        do {
            System.out.print("Nhập độ dài mảng: ");
            size = inputNumber.nextInt();
            if (size < 2) {
                System.out.println("Độ dài của mảng phải lớn hơn hoặc bằng 2");
            }
        } while (size < 2);
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
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[i] > max){
                max = numbers[i];
                count = 1;
            } else if (numbers[i] == max){
                count++;
            }
        }
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < size; i++) {
//            if(numbers[i] == max){
//                list.add(i);
//            }
//        }
//        for (int i = 0; i < list.size(); i++) {
//            count++;
//        }
        System.out.println("Phần tử lớn nhất trong mảng là " + max + " xuất hiện " + count + " lần");
    }
}

class MainB18 {
    public static void main(String[] args) {
        B18 b18 = new B18();
        b18.B181();
        b18.B182();
        b18.B183();
    }
}

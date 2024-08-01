package array;

import java.util.*;

public class B19 {
    public void B191() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B191==========");
        System.out.println("Tìm tất cả các cặp trong mảng có tổng bằng tổng cho trước");
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
        System.out.print("Nhập tổng: ");
        int sum = inputNumber.nextInt();
        Set<String> duplicateSet = new HashSet<>();
        System.out.println("Các cặp phần tử có tổng bằng " + sum);
        boolean isSum = false;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] + numbers[j] == sum) {
                    String set = numbers[i] < numbers[j] ?
                            numbers[i] + " - " + numbers[j] :
                            numbers[j] + " - " + numbers[i];

                    if (!duplicateSet.contains(set)) {
                        duplicateSet.add(set);
                        System.out.println(numbers[i] + " - " + numbers[j]);
                        isSum = true;
                    }
                }
            }
        }
        if (!isSum) {
            System.out.println("Không có cặp nào có tổng bằng " + sum);
        }
    }

    public void B192() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B192==========");
        System.out.println("Sắp xếp một mảng sao cho các số chẵn đứng trước các số lẻ");
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
        ArrayList<Integer> listOdd = new ArrayList<>();
        ArrayList<Integer> listEven = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 == 0) {
                listEven.add(numbers[i]);
            } else {
                listOdd.add(numbers[i]);
            }
        }
        Collections.sort(listEven);
        Collections.sort(listOdd);
        System.out.println("Mảng sau sắp xếp");
        for (int i = 0; i < listEven.size(); i++) {
            System.out.print(listEven.get(i) + " ");
        }
        for (int i = 0; i < listOdd.size(); i++) {
            System.out.print(listOdd.get(i) + " ");
        }
    }

    public void B193() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B193==========");
        System.out.println("Dãy con tổng bằng 0");
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
        listSumZero(numbers);
    }

    public void listSumZero(int[] arr) {
        System.out.println("Dãy có tổng bằng 0");
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0) {
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}

class MainB19 {
    public static void main(String[] args) {
        B19 b19 = new B19();
        //b19.B191();
        //b19.B192();
        b19.B193();
    }
}

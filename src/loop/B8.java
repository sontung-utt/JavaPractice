package loop;

import java.util.Scanner;

public class B8 {
    public void B81() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B81==========");
        System.out.println("Tinh các tổ hợp");
        System.out.print("Nhập số N: ");
        int n = inputNumber.nextInt();
        System.out.print("Nhập số S: ");
        int s = inputNumber.nextInt();
        int count = 0;
        for (int x = 0; x <= n; x++) {
            for (int y = 0; y <= n; y++) {
                int z = s - x - y;
                if (z >= 0 && z <= n) {
                    System.out.println(x + ", " + y + ", " + z);
                    count++;
                }
            }
        }
        System.out.println("Số tổ hợp là " + count);
    }

    public void B82() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B82==========");
        System.out.println("Tính số tổ hợp nam nữ");
        System.out.print("Nhập số nam: ");
        int x = inputNumber.nextInt();
        System.out.print("Nhập số nữ: ");
        int y = inputNumber.nextInt();
        if (x > y) {
            int count1 = 0;
            for (int i = 1; i <= y; i++) {
                count1++;
            }
            System.out.println("Số tổ hợp nam - nữ là: " + count1 + " cặp");
            int count2 = (x - count1) / 2;
            if ((x - count1) % 2 == 0) {
                System.out.println("Số tổ hợp nam - nam là: " + count2 + " cặp");
            } else {

                System.out.println("Số tổ hợp nam - nam là: " + count2 + " cặp và lẻ 1 nam");
            }
        } else if (x < y) {
            int count1 = 0;
            for (int i = 1; i <= x; i++) {
                count1++;
            }
            System.out.println("Số tổ hợp nam - nữ là: " + count1 + " cặp");
            int count2 = (y - count1) / 2;
            if ((y - count1) % 2 == 0) {
                System.out.println("Số tổ hợp nữ - nữ là: " + count2 + " cặp");
            } else {

                System.out.println("Số tổ hợp nữ - nữ là: " + count2 + " cặp và lẻ 1 nữ");
            }
        } else {
            int count = 0;
            for (int i = 1; i <= x; i++) {
                count++;
            }
            System.out.println("Số tổ hợp nam - nữ là: " + count + " cặp");
        }
    }

    public void B83() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B83==========");
        System.out.println("Tính số bánh chưng");
        System.out.print("Nhập số lượng nhóm: ");
        int size = inputNumber.nextInt();
        int[] arr = new int[size];
        System.out.println("Nhập số lượng thành viên trong nhóm");
        for (int i = 0; i < size; i++) {
            do {
                System.out.print("Nhập số lượng thành viên nhóm " + (i + 1) + ": ");
                arr[i] = inputNumber.nextInt();
                if(arr[i] > 4) {
                    System.out.println("Thành viên trong nhập không quá 4 thành viên!");
                }
            } while (arr[i] > 4);
        }
        int total = 0;
        for (int i: arr) {
            total += (i + 3) / 4;
        }
        System.out.println("Tổng số lượng bánh chưng cho " + size + " nhóm là " + total + " cái");
    }
}

class MainB8 {
    public static void main(String[] args) {
        B8 b8 = new B8();
        b8.B81();
        b8.B82();
        b8.B83();
    }
}

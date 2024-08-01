package sort_search;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class B27 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        Random random = new Random();
        B27 b27 = new B27();
        System.out.println("============B27============");
        int size = 10000;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10000);
        }

        System.out.print("Nhập giá trị cần tìm: ");
        int x = inputNumber.nextInt();
        System.out.println("Tìm kiếm tuyến tính");
        int index = b27.findById(x, arr);
        if (index == -1) {
            System.out.println(x + " không xuất hiện trong mảng!");
        } else {
            System.out.println(x + " xuất hiện tại vị trí thứ " + index + " trong mảng!");
        }
        System.out.println("Tìm kiếm nhị phân");
        Arrays.sort(arr);
        int index2 = b27.findByIdBinary(x, arr);
        if (index2 == -1) {
            System.out.println(x + " không xuất hiện trong mảng!");
        } else {
            System.out.println(x + " xuất hiện tại vị trí thứ " + index2 + " trong mảng!");
        }
    }

    public int findById(int n, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public int findByIdBinary(int n, int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (arr[mid] == n){
                return mid;
            }
            if (arr[mid] < n){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

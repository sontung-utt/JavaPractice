package sort_search;

import java.util.ArrayList;
import java.util.Scanner;

public class B26 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("============B26============");
        B26 b26 = new B26();
        int size;
        do {
            System.out.print("Nhập số lượng phần tử trong mảng: ");
            size = inputNumber.nextInt();
            if (size < 2){
                System.out.println("Số lượng phần tử trong mảng phải lớn hơn hoặc bằng 2");
            }
        } while (size < 2);
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            numbers[i] = inputNumber.nextInt();
        }
        System.out.println("Danh sách mảng");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.print("Nhập số cần tìm: ");
        int x = inputNumber.nextInt();
        System.out.println("==========B261==========");
        System.out.println("Tìm vị trí của x trong mảng");
        int index = b26.findById(x, numbers);
        if (index == -1) {
            System.out.println(x + " không nằm trong mảng!");
        } else {
            System.out.println(x + " nằm tại vị trí thứ " + index + " trong mảng!");
        }
        System.out.println("==========B262==========");
        System.out.println("Tìm tất cả vị trí của x trong mảng");
        ArrayList<Integer> listId = b26.findAllById(x,numbers);
        if (listId.isEmpty()){
            System.out.println(x + " không nằm trong mảng!");
        } else {
            System.out.print(x + " nằm tại các vị trí: ");
            for (int i = 0; i < listId.size(); i++) {
                System.out.print(listId.get(i) + " ");
            }
        }
        System.out.println();
        System.out.println("==========B263==========");
        System.out.println("Đếm số lần xuất hiện của x trong mảng");
        int count = b26.countById(x,numbers);
        System.out.println(x + " xuất hiện " + count + " lần trong mảng!");
    }

    public int findById(int x, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Integer> findAllById(int x, int[] arr){
        ArrayList<Integer> listId = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                listId.add(i);
            }
        }
        return listId;
    }

    public int countById(int x, int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                count++;
            }
        }
        return count;
    }
}

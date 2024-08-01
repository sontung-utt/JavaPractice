package sort_search;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B25 {
    public static void main(String[] args) {
        B25 b25 = new B25();
        b25.B251();
    }

    public void B251() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B251==========");
        System.out.println("Sắp xếp phần tử trong mảng tăng dần");
        int size;
        do {
            System.out.print("Nhập số lượng phần tử mảng: ");
            size = inputNumber.nextInt();
            if (size < 2){
                System.out.println("Số lượng phần tử trong mảng phải lớn hơn hoặc bằng 2");
            }
        } while (size < 2);
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            numbers.add(inputNumber.nextInt());
        }
        System.out.println("Danh sách phần tử trong mảng");
        for(int i = 0; i < size; i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        ArrayList<Integer> listEven = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (numbers.get(i) % 2 == 0) {
                listEven.add(numbers.get(i));
            }
        }
        System.out.println("Danh sách phần tử chẵn trong mảng");
        for (int i = 0; i < listEven.size(); i++) {
            System.out.print(listEven.get(i) + " ");
        }
        System.out.println();
        Collections.sort(numbers);
        Collections.sort(listEven);
        System.out.println("Mảng sau khi sắp xếp");
        for(int i = 0; i < size; i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
        System.out.println("==========B252==========");
        System.out.println("Sắp xếp phần tử chẵn trong mảng tăng dần");
        System.out.println("Mảng chẵn sau khi sắp xếp");
        for (int i = 0; i < listEven.size(); i++) {
            System.out.print(listEven.get(i) + " ");
        }
    }
}



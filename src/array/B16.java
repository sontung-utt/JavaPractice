package array;

import java.util.Scanner;

public class B16 {
    public void B161(){
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B161==========");
        System.out.println("Đếm số lần xuất hiện củ phần tử trong mảng");
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
        System.out.print("Nhập phần tử muốn đếm: ");
        int number = inputNumber.nextInt();
        int count = 0;
        for(int i = 0; i < size; i++){
            if(number == numbers[i]){
                count++;
            }
        }
        System.out.println("Phần tử " + number + " xuất hiện " + count + " lần trong mảng!");
    }

    public void B162(){
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B162==========");
        System.out.println("Các phần tử chỉ xuất hiện một lần");
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
        int maxValue = 1000;
        int[] count = new int[maxValue + 1];
        for (int i = 0; i < size; i++) {
            count[numbers[i]]++;
        }
        System.out.println("Danh sách các phần tử trong mảng xuất hiện một lần");
        for (int i = 0; i < size; i++) {
            if(count[numbers[i]] == 1){
                System.out.print(numbers[i] + " ");
            }
        }
    }
}

class MainB16{
    public static void main(String[] args) {
        B16 b16 = new B16();
        b16.B161();
        b16.B162();
    }
}

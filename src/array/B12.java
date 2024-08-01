package array;

import java.util.Scanner;

public class B12 {
    public void B121(){
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B121==========");
        System.out.println("Tính tổng các phần tử ở vị trí lẻ");
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
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if(i % 2 != 0){
                sum += numbers[i];
            }
        }
        System.out.println("Tổng các phần tử ở vị trí lẻ: " + sum);
    }

    public void B122(){
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B122==========");
        System.out.println("Tính tổng vị trí của các phần tử chẵn");
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
        int sum = 0;
        for(int i = 0; i < size; i++){
            if(numbers[i] % 2 == 0){
                sum += i;
            }
        }
        System.out.println("Tổng các vị trí ở phần tử chẵn: " + sum);
    }

    public void B123(){
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B123==========");
        System.out.println("So sánh tổng chẵn tổng lẻ");
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
        int sumOdd = 0, sumEven = 0;
        for(int i = 0; i < size; i++){
            if(numbers[i] % 2 == 0){
                sumEven += numbers[i];
            } else {
                sumOdd += numbers[i];
            }
        }
        System.out.println("Tổng chẵn: " + sumEven + " - Tổng lẻ: " + sumOdd);
        if(sumOdd == sumEven){
            System.out.println("Tổng chẵn bằng tổng lẻ");
        } else if (sumOdd > sumEven){
            System.out.println("Tổng chẵn nhỏ hơn tổng lẻ");
        } else {
            System.out.println("Tổng chẵn lớn hơn tổng lẻ");
        }
    }
}

class MainB12{
    public static void main(String[] args) {
        B12 b12 = new B12();
        b12.B121();
        b12.B122();
        b12.B123();
    }
}

package sort_search;

import java.util.Random;
import java.util.Scanner;

public class B30 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        Random random = new Random();
        System.out.println("============B27============");
        int size = 10000;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10000);
        }

        System.out.println("Sắp xếp nổi bọt - Bubble Sort");
        int[] arrBubble = arr.clone();
        bubbleSort(arrBubble);
        System.out.println("Hoàn thành sắp xếp nổi bọt");

        System.out.println("Sắp xếp chèn - Insertion Sort");
        int[] arrInsertion = arr.clone();
        insertionSort(arrInsertion);
        System.out.println("Hoàn thành sắp xếp chèn");

        System.out.println("Sắp xếp chọn - Selection Sort");
        int[] arrSelection = arr.clone();
        selectionSort(arrSelection);
        System.out.println("Hoàn thành sắp xếp chọn");
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length -1; i++){
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

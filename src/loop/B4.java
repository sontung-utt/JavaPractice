package loop;

import java.util.Scanner;

public class B4 {
    public void B41(){
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B41==========");
        System.out.println("Tính tổng các số");
        int a, b;
        do {
            System.out.print("Nhập số a: ");
            a = inputNumber.nextInt();
            System.out.print("Nhập số b: ");
            b = inputNumber.nextInt();
            if (a > b) {
                System.out.println("Yêu cầu nhập lại");
            }
        } while (a > b);
        int sum = 0;
        for(int i = a; i <= b; i++){
            sum += i;
        }
        System.out.println("Tổng các số từ " + a + " đến " + b + " là: " + sum);
    }

    public void B42(){
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B42==========");
        System.out.println("Tổng các số chẵn");
        int a,b;
        do{
            System.out.print("Nhập số a: ");
            a = inputNumber.nextInt();
            System.out.print("Nhập số b: ");
            b = inputNumber.nextInt();
            if(a > b){
                System.out.println("Yêu cầu nhập lại");
            }
        } while (a > b);
        int sum = 0;
        for(int i = a; i <= b; i++){
            if(i % 2==0){
                sum += i;
            }
        }
        System.out.println("Tổng các số chẵn từ " + a + " đến " + b + " là: " + sum);
    }

    public void B43(){
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("==========B43==========");
        System.out.println("Tính tổng các số bình phương");
        int a,b;
        do{
            System.out.print("Nhập số a: ");
            a = inputNumber.nextInt();
            System.out.print("Nhập số b: ");
            b = inputNumber.nextInt();
            if(a > b){
                System.out.println("Yêu cầu nhập lại");
            }
        } while (a > b);
        int sum = 0;
        for(int i = a; i <= b; i++){
            sum += i * i;
        }
        System.out.println("Tổng số các bình phương từ " + a + " đến " + b + " là: " + sum);
    }
}

class MainB4{
    public static void main(String[] args) {
        B4 b4 = new B4();
        b4.B41();
        b4.B42();
        b4.B43();
    }
}

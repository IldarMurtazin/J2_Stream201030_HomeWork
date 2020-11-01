package HomeWork_1;

import java.util.Scanner;

public class Computation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int c = a + b;
        if ( c<= 20 && c >=10) {
            System.out.println("Это правильно");
        } else {
            System.out.println("Это неправильно");
        }
    }
}

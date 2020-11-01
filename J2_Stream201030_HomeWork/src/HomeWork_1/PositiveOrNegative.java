package HomeWork_1;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        System.out.println("Введите любое целое число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a >= 0){
            System.out.println("Вы ввели положительное число");
        } else if (a <= 0){
            System.out.println("Вы ввели отрицательное число");
        }

    }
}

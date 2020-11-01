package HomeWork_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) throws Exception{
        System.out.println("Введите год");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        int a = number % 400;
        int b = a % 100;
        int c = b % 4;

        if(a == 0) {
            System.out.println("Год високосный");
        } else if (b == 0) {
            System.out.println("Год не високосный");
        } else if (c == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }


    }
}

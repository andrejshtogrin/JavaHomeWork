package shtogryn.hw2;

import java.util.Scanner;

public class Int {
    private static Scanner in;

    public static void main(String[] args) {

        int a = 0, b = 14, d = 35, e = 50, f = 100;

        System.out.print("Проверка попадания числа в интервал от 0 до 100" + "\n" + "Введите число: ");

        in = new Scanner(System.in);
        int i = in.nextInt();

        if (i >= a && i <= b) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + a + " до " + b + "\n");
        } else if (i >= b+1 && i <= d) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + 15 + " до " + d + "\n");
        } else if (i >= d+1 && i <= e) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + 36 + " до " + e + "\n");
        } else if (i >= e+1 && i <= f) {
            System.out.print("Ваше число " + i + " попадает в интервал от " + 51 + " до " + f + "\n");
        } else if (i >= f+1 ) {
            System.out.print("Ваше число " + i + " не попадает ни в один интервал");
        } else if (i < a) {
            System.out.print("Ваше число " + i + " является отрицательным");
        }
    }
}



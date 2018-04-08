import Math.Math;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Base {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /**try {*/
            System.out.println("Введите первое число: ");
            double a = scanner.nextDouble();

            System.out.println("Введите второе число: ");
            double b = scanner.nextDouble();

            System.out.println("Введите операцию (+,-,*,/): ");
            String oper = scanner.next();

            System.out.println("Ответ:");
            Math calc = new Math();

            System.out.println(calc.calculate(a, b, oper));
    }
}

package Math;

public class Math {
    private double sum (double a, double b) {
        return a + b;
    }

    private double minus(double a, double b) {
        return a - b;
    }

    private double multiply (double a, double b) {
        return a * b;
    }

    private double division (double a, double b) {
        if (b==0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    public double calculate(double a, double b, String oper) {
        if (oper.equals("+")) {
            return this.sum(a, b);
        } else if (oper.equals("-")) {
            return this.minus(a, b);
        } else if (oper.equals("*")) {
            return this.multiply(a, b);
        } else if (oper.equals("/")) {
            return this.division(a, b);
        } else {
            System.out.println("Значение недопустимо. Завершение работы.");
            return 0;
        }
    }
}
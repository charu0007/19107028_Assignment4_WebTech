import java.util.*;

class Number {
    private double num;

    Number(double num) {
        this.num = num;
    }

    boolean isZero() {
        return num == 0;
    }

    boolean isPositive() {
        return num > 0;
    }

    boolean isNegative() {
        return num < 0;
    }

    boolean isOdd() {
        return num % 2 != 0;
    }

    boolean isEven() {
        return num % 2 == 0;
    }

    boolean isPrime() {
        int factors = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                factors++;
            }
        }
        if (factors == 0)
            return true;
        else
            return false;
    }

    boolean isArmstrong() {
        int armstrongNum = 0;
        int number = (int) num;
        while (number > 0) {

            int digit = (int) number % 10;
            armstrongNum += Math.pow(digit, 3);
            number /= 10;

        }
        return armstrongNum == (int) num;
    }

    double getFactorial() {
        double factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    double getSqrt() {
        return Math.sqrt(num);
    }

    double getSqr() {
        return num * num;
    }

    double sumDigits() {

        int sum = 0;
        while (num > 0) {

            int digit = (int) num % 10;
            sum += digit;
            num /= 10;

        }
        return sum;
    }

    double getReverse() {
        double reversedNumber = 0;
        num = (int) num;
        while (num > 0) {

            int d = (int) num % 10;
            reversedNumber = reversedNumber * 10 + d;
            num = num / 10;

        }
        return reversedNumber;
    }

    void listFactor() {
        for (int i = 0; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(num);
            }
        }
    }

    void dispBinary() {
        int number = (int) num;
        long i;
        System.out.print("0");
        for (i = 1 << 30; i > 0; i = i / 2) {
            if ((number & i) != 0) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
    }

}

class Ques3 {
    public static void main(String args[]) {

        Number n = new Number(869);
        System.out.println(n.getReverse());
    }
}
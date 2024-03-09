package Main.hw1.Calculator;

/** В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки и
 возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
 Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException.
 Не забудьте написать тесты для проверки этого поведения.

 */
public class Calculator {
    public double calculateDiscount(int sum, int discount) {
        if (sum < 0) {
            throw new ArithmeticException();
        }
        if (discount > 50) {
            throw new ArithmeticException();
        }
        int i = 100 - discount;

        return i * 0.01 * sum;
    }
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}


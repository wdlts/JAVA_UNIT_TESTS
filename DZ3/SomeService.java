package seminars.third.coverage;

public class SomeService {

    // ЗАДАНИЕ 1
    public double calculatingDiscount(double purchaseAmount, int discountAmount) {
        // purchaseAmount - сумма покупки
        // discountAmount - размер скидки
        double discountedAmount = 0; // Сумма со скидкой (первоначальная сумма - скидка%)
        if (purchaseAmount >= 0) {
            if (discountAmount >= 0 && discountAmount <= 100) {
                discountedAmount = purchaseAmount - (purchaseAmount * discountAmount) / 100;
            } else {
                throw new ArithmeticException("Скидка должна быть в диапазоне от 0 до 100%");
            }
        } else {
            // Сумма покупки не может быть отрицательной
            throw new ArithmeticException("Сумма покупки не может быть отрицательной");
        }
        return discountedAmount; // Метод должен возвращать сумму покупки со скидкой
    }

    // ЗАДАНИЕ 2.

    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


    // ЗАДАНИЕ 3
    public boolean numberInInterval(int discountAmount){
        return discountAmount >= 25 && discountAmount <= 100;
    }
}
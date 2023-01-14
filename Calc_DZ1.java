package UNIT_TEST_DZ;

import org.assertj.core.api.Assert;
import java.util.Locale;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


public class Calc_DZ1 {

    public static void main(String[] args) {
        calculatingDiscount(1578,12);
    }

    // Нужно написать в калькуляторе метод вычисления суммы покупки
    // (метод принимает сумму, процент скидки и возвращает сумму со скидкой)
    // и проверить его используя AssertJ (отрицательное числа, 0, дроби,
    // проценты >=100%, обычные скидки). Все ошибки должны быть обработаны,
    // при вводе недопустимых аргументов можно выбрасывать
    // (throw new ArithmeticException("Суть ошибки");),
    // но нужно проверить, что все ошибки проверяются в тестах. (Заготовки метода
    // уже есть в классе Calculator - calculatingDiscount)
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {


        assertThat(discountAmount).isNotNegative();
        assertThat(purchaseAmount).isNotNegative();
        assertThat(discountAmount).isLessThan(100);
        assertThat(discountAmount).isGreaterThan(0);
        assertThat(purchaseAmount).isNotZero();

        double result = Double.parseDouble(String.format(Locale.ENGLISH, "%(.2f",
                purchaseAmount-(purchaseAmount/100*(discountAmount))));

        System.out.println(result);
        return (result);
    }
}

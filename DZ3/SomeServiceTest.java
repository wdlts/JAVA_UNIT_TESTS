package seminars.third.coverage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
    SomeService ss = new SomeService();

    //ЗАДАНИЕ 1

    @Test
    void SplitAndCheckCoverageValidDiscount() {
        assertThat(ss.calculatingDiscount(2000.0, 50))
                .isEqualTo(1000); // обычная скидка
        assertThat(ss.calculatingDiscount(2000.0, 100))
                .isEqualTo(0); // обычная скидка
        assertThat(ss.calculatingDiscount(2000.0, 0))
                .isEqualTo(2000); // обычная скидка
    }

    @Test
    void SplitAndCheckCoverageDiscountLessThanZero() {
        assertThatThrownBy(() ->
                ss.calculatingDiscount(2000.0, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // скидка меньше 0
    }

    @Test
    void SplitAndCheckCoverageDiscountMoreThanZero() {
        assertThatThrownBy(() ->
                ss.calculatingDiscount(2000.0, 101))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Скидка должна быть в диапазоне от 0 до 100%"); // скидка больше 0
    }

    @Test
    void SplitAndCheckCoverageNegativePurchaseSum() {
        assertThatThrownBy(() ->
                ss.calculatingDiscount(-2000.0, 25))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Сумма покупки не может быть отрицательной"); // отрицательная сумма покупки
    }

    //ЗАДАНИЕ 2

    @Test
    void fullCoverageTrue(){
        assertTrue(ss.evenOddNumber(4));
    }
    @Test
    void fullCoverageFalse(){
        assertFalse(ss.evenOddNumber(5));
    }

    //ЗАДАНИЕ 3

    @Test
    void checkRange25to100True(){
        assertTrue(ss.numberInInterval(75));
    }
    @Test
    void checkRange25to100False(){
        assertFalse(ss.numberInInterval(15));
    }

}
package UNIT_TEST_DZ;

import UNIT_TEST_DZ.Calc_DZ1;
import org.assertj.core.api.Assertions;

import static UNIT_TEST_DZ.Calc_DZ1.calculatingDiscount;
import static org.assertj.core.api.Assertions.*;

public class Calc_DZ1_tests {

    public static void main(String[] args) {


        //результат не отрицательный
        assertThat(calculatingDiscount(100,10)).isNotNegative();
        //результат больше 0
        assertThat(calculatingDiscount(100,10)).isGreaterThan(0);
        //результат не больше суммы покупки
        assertThat(calculatingDiscount(100,10)).isLessThan(100);
        //результат не нулевой
        assertThat(calculatingDiscount(100,10)).isNotZero();
    }
}

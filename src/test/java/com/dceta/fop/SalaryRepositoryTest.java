package com.dceta.fop;

import com.dceta.fop.model.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalaryRepositoryTest {

    @Test
    void testSalaries() {
        List<Tax> taxes = new ArrayList<>();
        taxes.add(new IncomeTax(5));
        taxes.add(new SocialTax(BigDecimal.valueOf(1320)));
        Salary salary = new Salary(Currency.UAH, Currency.USD, BigDecimal.valueOf(4000), BigDecimal.valueOf(27.82), taxes);
        BigDecimal expected = BigDecimal.valueOf(104396.0000);
        assertEquals(0, expected.compareTo(salary.getNetSalaryInLocalCurrency()));
    }

}

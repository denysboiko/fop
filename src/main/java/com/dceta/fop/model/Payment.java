package com.dceta.fop.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

public class Payment {


    private Salary salary;
    List<Extra> extras;
    List<Fee> fees;
    private LocalDate date;
    private YearMonth period;


    private BigDecimal getSumOfExtrasInLocalCurrency() {
        return BigDecimal.ZERO;
    }

    private BigDecimal getSumOfFeesInLocalCurrency() {
        return BigDecimal.ZERO;
    }

    private BigDecimal getSumOfTaxesInLocalCurrency() {
        return BigDecimal.ZERO;
    }

    public BigDecimal getNetPayment() {
        return BigDecimal.ZERO;
    }

    public BigDecimal getNetPaymentInLocalCurrency() {
        return salary.getNetSalaryInLocalCurrency()
                .add(getSumOfExtrasInLocalCurrency())
                .subtract(getSumOfFeesInLocalCurrency());
    }
    


    private Integer getQuarter() {
        return null;
    }

}

package com.dceta.fop.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class Salary {

    private Currency localCurrency;
    private Currency currency;
    private BigDecimal amount;
    private BigDecimal rate;

    List<Tax> taxes;

    public BigDecimal getAmountInLocalCurrency() {
        return amount.multiply(rate);
    }

    public BigDecimal getNetSalaryInLocalCurrency() {
        BigDecimal amountInLocalCurrency = amount.multiply(rate);
        BigDecimal sumOfTaxes = taxes.stream()
                .map(tax -> tax.getValue(amountInLocalCurrency))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return amountInLocalCurrency.subtract(sumOfTaxes);
    }

}

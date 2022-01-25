package com.dceta.fop.model;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;
@AllArgsConstructor
public class IncomeTax implements Tax {

    private int percent;

    @Override
    public BigDecimal getValue(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(percent / 100.0));
    }
}

package com.dceta.fop.model;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;
@AllArgsConstructor
public class SocialTax implements Tax {

    private BigDecimal amount;

    @Override
    public BigDecimal getValue(BigDecimal base) {
        return amount;
    }
}

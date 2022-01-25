package com.dceta.fop.model;

import java.math.BigDecimal;

public interface Amount {
    BigDecimal getAmount();
    BigDecimal getAmountInLocalCurrency();
}

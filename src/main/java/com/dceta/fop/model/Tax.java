package com.dceta.fop.model;

import java.math.BigDecimal;

public interface Tax {

    BigDecimal getValue(BigDecimal amount);
}

package com.fedex.dto.shipmenttest;

import lombok.*;

import java.math.BigDecimal;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class CurrencyAmount {

    private String currencyCode;
    private float amount;
}

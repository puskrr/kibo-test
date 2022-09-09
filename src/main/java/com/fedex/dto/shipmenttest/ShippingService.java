package com.fedex.dto.shipmenttest;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ShippingService {
    private  String serviceType;
    private String signatureService;
}

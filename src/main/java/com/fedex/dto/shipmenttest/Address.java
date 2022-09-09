package com.fedex.dto.shipmenttest;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Address {
    private  String[] streetLines;
    private  String  stateOrProvinceCode;
    private  String postalCode;
   private  String countryCode;
}

package com.fedex.dto.shipmenttest;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Shipper {
    private  String accountNumber;
    private  ContactInfo contact;
}

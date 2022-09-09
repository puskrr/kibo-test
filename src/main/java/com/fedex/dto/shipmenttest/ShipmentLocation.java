package com.fedex.dto.shipmenttest;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ShipmentLocation {
    private Address address;
    private  String locationId;
}

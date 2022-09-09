package com.fedex.dto.shipmenttest;

import lombok.*;

import java.sql.Timestamp;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Pickup {
    private Timestamp readyTime;
    private  String localTimeZone;
    private  ShipmentLocation location;
}

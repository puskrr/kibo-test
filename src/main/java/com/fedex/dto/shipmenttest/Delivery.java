package com.fedex.dto.shipmenttest;

import lombok.*;

import java.sql.Timestamp;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Delivery {
    private Timestamp commitStartTime;
    private Timestamp commitEndTime;
    private ShipmentLocation location;
}

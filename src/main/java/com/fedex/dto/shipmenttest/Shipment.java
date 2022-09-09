package com.fedex.dto.shipmenttest;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Shipment {
    private ShippingService service;
    private String category;
    private Pickup pickupDetail;
    private Delivery deliveryDetail;
    private  Shipper shipper;
    private  Recipient recipient;
    private  Packages packages;
    private  CurrencyAmount totalDeclaredValue;
    private  HazardousMaterialsContactDetail hazmatContactDetail;

}

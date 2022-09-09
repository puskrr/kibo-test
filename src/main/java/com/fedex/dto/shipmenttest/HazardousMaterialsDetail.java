package com.fedex.dto.shipmenttest;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class HazardousMaterialsDetail {
    private  String packageType;
    private  HazardousCommodity[] commodities;
    private  RadioactiveDangerousGoodsDetail radioactiveDetail;

}

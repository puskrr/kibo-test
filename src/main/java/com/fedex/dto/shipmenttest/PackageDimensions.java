package com.fedex.dto.shipmenttest;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PackageDimensions {
    private  String unit;
    private  Integer length;
    private  Integer width;
    private  Integer height;
}

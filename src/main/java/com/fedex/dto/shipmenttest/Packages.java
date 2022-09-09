package com.fedex.dto.shipmenttest;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Packages {
    private  PackageWeight weight;
    private  PackageDimensions dimensions;
    private  HazardousMaterialsDetail[] hazmat;
}

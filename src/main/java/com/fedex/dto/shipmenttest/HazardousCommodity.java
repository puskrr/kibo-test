package com.fedex.dto.shipmenttest;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class HazardousCommodity {
    private  String idType;
    private  String idNumber;
    private  String dotShippingName;
    private  HazardousClassOrDivision[] classOrDivision;
   private  PackageWeight commodityWeight ;
}

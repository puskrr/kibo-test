package com.fedex.service;

import com.fedex.dto.kibo.AuthenticationResponse;
import com.fedex.dto.kibo.AuthorizationResponse;
import com.fedex.dto.kibo.CustomerCreationRequest;
import com.fedex.dto.kibo.CustomerResponse;
import com.fedex.dto.kibo.customer.filter.CustomerFilterResponse;
import com.fedex.dto.kibo.order.OrderCreationRequest;
import com.fedex.dto.kibo.order.filter.FilterResponse;
import com.fedex.dto.kibo.order.response.OrderCreationResponse;
import com.fedex.dto.kibo.shipment.ShipmentResponse;

public interface KiboApiService {

    AuthenticationResponse getAuthenticationToken();
    AuthorizationResponse getAuthorizationResponse();
    CustomerResponse getCustomerResponse(CustomerCreationRequest request);
    OrderCreationResponse getOrderCreationResponse(OrderCreationRequest orderCreationRequest);
    OrderCreationResponse getOrderById(String Id);

    FilterResponse filterOrder(String filter);

    CustomerFilterResponse filterCustomer(String customerFilter);

    Object getAllShipment();
    Object getShipmentByFilter(String shipmentFilter);

}

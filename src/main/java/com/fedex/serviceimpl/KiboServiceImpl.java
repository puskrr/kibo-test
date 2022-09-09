package com.fedex.serviceimpl;

import com.fedex.dto.kibo.*;
import com.fedex.dto.kibo.customer.filter.CustomerFilterResponse;
import com.fedex.dto.kibo.order.OrderCreationRequest;
import com.fedex.dto.kibo.order.filter.FilterResponse;
import com.fedex.dto.kibo.order.response.OrderCreationResponse;
import com.fedex.dto.kibo.shipment.ShipmentResponse;
import com.fedex.dto.kibo.shipments.ShipResponse;
import com.fedex.service.KiboApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class KiboServiceImpl implements KiboApiService {

   private  final WebClient kiboWebClient;

    @Value("${kibo.applicationId}")
    private String applicationId;

    @Value("${kibo.sharedSecret}")
    private String sharedSecret;

    @Value("${kibo.grantType}")
    private String grantType;

    @Override
    public AuthenticationResponse getAuthenticationToken() {
        AuthenticationRequest request = AuthenticationRequest.builder().applicationId(applicationId).
                sharedSecret(sharedSecret).build();
        return WebClient.builder().baseUrl("https://home.mozu.com/api/platform/applications/authtickets").build().post()
                .body(Mono.just(request), AuthenticationRequest.class).retrieve().bodyToMono(AuthenticationResponse.class).block();

    }

    @Override
    public AuthorizationResponse getAuthorizationResponse() {
        String authenticationToken = getAuthenticationToken().getAccessToken();
        AuthorizationRequest authorizationRequest = AuthorizationRequest.builder().clientId(applicationId).
                clientSecret(sharedSecret).grantType(grantType).build();

        return kiboWebClient.post().uri("api/platform/applications/authtickets/oauth").header("x-vol-app-claims", authenticationToken).bodyValue(authorizationRequest).
               retrieve().bodyToMono(AuthorizationResponse.class).block();
    }

    @Override
    public CustomerResponse getCustomerResponse(CustomerCreationRequest request) {
        String authorizationToken = getAuthorizationResponse().getAccessToken();

        return  kiboWebClient.post().uri("api/commerce/customer/accounts/").headers(httpHeaders -> {
            httpHeaders.set("Content-Type", "application/json");
            httpHeaders.set("x-vol-tenant", "34486");
            httpHeaders.set("Authorization", "Bearer " + authorizationToken);
            httpHeaders.set("x-vol-site", "55939");
        }).body(Mono.just(request),CustomerCreationRequest.class).retrieve().bodyToMono(CustomerResponse.class).block();



    }

    @Override
    public OrderCreationResponse getOrderCreationResponse(OrderCreationRequest orderCreationRequest) {
        String authorizationToken= getAuthorizationResponse().getAccessToken();
        return  kiboWebClient.post().uri("/api/commerce/orders/").headers(httpHeaders -> {
            httpHeaders.set("Content-Type", "application/json");
            httpHeaders.set("x-vol-tenant", "34486");
            httpHeaders.set("Authorization", "Bearer " + authorizationToken);
            httpHeaders.set("x-vol-site", "55939");
        }).body(Mono.just(orderCreationRequest),OrderCreationRequest.class).retrieve().bodyToMono(OrderCreationResponse.class).block();

    }

    @Override
    public OrderCreationResponse getOrderById(String id) {
        String authorizationToken= getAuthorizationResponse().getAccessToken();
     return  kiboWebClient.get().uri("/api/commerce/orders/"+id).headers(httpHeaders -> {
            httpHeaders.set("Content-Type", "application/json");
            httpHeaders.set("x-vol-tenant", "34486");
            httpHeaders.set("Authorization", "Bearer " + authorizationToken);
            httpHeaders.set("x-vol-site", "55939");
        }).retrieve().bodyToMono(OrderCreationResponse.class).block();

    }

    @Override
    public FilterResponse filterOrder(String filter) {
        String authorizationToken= getAuthorizationResponse().getAccessToken();

        FilterResponse filterResponseResponse=kiboWebClient.get().uri(uriBuilder -> uriBuilder
                .path("/api/commerce/orders/")
                .queryParam("filter", filter)
                .build()).headers(httpHeaders -> {
            httpHeaders.set("Content-Type", "application/json");
            httpHeaders.set("x-vol-tenant", "34486");
            httpHeaders.set("Authorization", "Bearer " + authorizationToken);
            httpHeaders.set("x-vol-site", "55939");
        }).retrieve().bodyToMono(FilterResponse.class).block();
        return  filterResponseResponse;

    }

    @Override
    public CustomerFilterResponse filterCustomer(String customerFilter) {
        String authorizationToken= getAuthorizationResponse().getAccessToken();

        CustomerFilterResponse filterResponseResponse=kiboWebClient.get().uri(uriBuilder -> uriBuilder
                .path("/api/commerce/customer/accounts/")
                .queryParam("filter", customerFilter)
                .build()).headers(httpHeaders -> {
            httpHeaders.set("Content-Type", "application/json");
            httpHeaders.set("x-vol-tenant", "34486");
            httpHeaders.set("Authorization", "Bearer " + authorizationToken);
            httpHeaders.set("x-vol-site", "55939");
        }).retrieve().bodyToMono(CustomerFilterResponse.class).block();
        return  filterResponseResponse;
    }

    @Override
    public Object getAllShipment() {
        String authorizationToken= getAuthorizationResponse().getAccessToken();

        Object shipResponse=kiboWebClient.get().uri("/api/commerce/shipments").headers(httpHeaders -> {
            httpHeaders.set("Content-Type", "application/json");
            httpHeaders.set("x-vol-tenant", "34486");
            httpHeaders.set("Authorization", "Bearer " + authorizationToken);
            httpHeaders.set("x-vol-site", "55939");
        }).retrieve().bodyToMono(Object.class).block();
        return  shipResponse;
    }

    @Override
    public Object getShipmentByFilter(String shipmentFilter) {
        String authorizationToken= getAuthorizationResponse().getAccessToken();
        Object filterResponseResponse=kiboWebClient.get().uri(uriBuilder -> uriBuilder
                .path("/api/commerce/customer/accounts/")
                .queryParam("filter", shipmentFilter)
                .build()).headers(httpHeaders -> {
            httpHeaders.set("Content-Type", "application/json");
            httpHeaders.set("x-vol-tenant", "34486");
            httpHeaders.set("Authorization", "Bearer " + authorizationToken);
            httpHeaders.set("x-vol-site", "55939");
        }).retrieve().bodyToMono(Object.class).block();
        return  filterResponseResponse;
    }
    }

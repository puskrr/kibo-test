package com.fedex.controller;


import com.fedex.dto.kibo.CustomerCreationRequest;
import com.fedex.dto.kibo.order.OrderCreationRequest;
import com.fedex.service.KiboApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kibo")
public class KiboController {

    private  final KiboApiService kiboApiService;

    @PostMapping("/authentication")
  public   ResponseEntity<?> getAuthToken()
    {
        System.out.println("hello from authentication");
       return ResponseEntity.ok(kiboApiService.getAuthenticationToken());
    }

    @GetMapping
   public ResponseEntity getTest()
    {
         return  ResponseEntity.ok("hello from test");
    }

    @PostMapping("/authorization")
    public  ResponseEntity<?> getAuthorization()
    {
        return  ResponseEntity.ok(kiboApiService.getAuthorizationResponse());
    }
    @PostMapping("/user")
    public  ResponseEntity<?> createCustomer(@RequestBody CustomerCreationRequest request)
    {
        return  ResponseEntity.ok(kiboApiService.getCustomerResponse(request));
    }
    @PostMapping("/order")
    public  ResponseEntity<?> createOrder(@RequestBody OrderCreationRequest request)
    {
        return  ResponseEntity.ok(kiboApiService.getOrderCreationResponse(request));
    }
    @GetMapping("/order/{id}")
    public  ResponseEntity<?> getOrder(@PathVariable String id)
    {
        return  ResponseEntity.ok(kiboApiService.getOrderById(id));
    }
    @GetMapping("/order")
    public  ResponseEntity<?> getOrderByFilter(@RequestParam String filter)
    {
        return  ResponseEntity.ok(kiboApiService.filterOrder(filter));
    }
    @GetMapping("/user")
    public  ResponseEntity<?> getUserByFilter(@RequestParam String filter)
    {
        return  ResponseEntity.ok(kiboApiService.filterCustomer(filter));
    }
    @GetMapping("/shipments")
    public  ResponseEntity<?> getAllShipment()
    {
        return  ResponseEntity.ok(kiboApiService.getAllShipment());
    }
    @GetMapping("/shipment")
    public  ResponseEntity<?> getShipmentByFilter(@RequestParam String filter)
    {
        return  ResponseEntity.ok(kiboApiService.getShipmentByFilter(filter));
    }
}

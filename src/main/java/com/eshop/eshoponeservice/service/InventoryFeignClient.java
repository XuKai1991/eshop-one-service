package com.eshop.eshoponeservice.service;

import com.eshop.eshoponeservice.service.fallback.InventoryFeignClientFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eshop-inventory-service", fallback = InventoryFeignClientFallback.class)
public interface InventoryFeignClient {

    @RequestMapping(value = "/product-inventory/findByProductId", method = RequestMethod.GET)
    String findByProductId(Long productId);

}

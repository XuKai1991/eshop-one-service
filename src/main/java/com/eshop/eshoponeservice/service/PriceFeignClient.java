package com.eshop.eshoponeservice.service;

import com.eshop.eshoponeservice.service.fallback.PriceFeignClientFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eshop-price-service", fallback = PriceFeignClientFallback.class)
public interface PriceFeignClient {

    @RequestMapping(value = "/product-price/findByProductId", method = RequestMethod.GET)
    String findByProductId(Long productId);

}

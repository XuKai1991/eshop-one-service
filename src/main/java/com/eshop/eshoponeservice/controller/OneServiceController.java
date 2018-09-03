package com.eshop.eshoponeservice.controller;

import com.eshop.eshoponeservice.service.InventoryFeignClient;
import com.eshop.eshoponeservice.service.PriceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Xukai
 * @description:
 * @createDate: 2018/9/3 12:01
 * @modified By:
 */
@RestController
@RequestMapping("/one")
public class OneServiceController {

    @Autowired
    private InventoryFeignClient inventoryFeignClient;

    @Autowired
    private PriceFeignClient priceFeignClient;

    @GetMapping("/findInventoryByProductId")
    private String findInventoryByProductId(Long productId) {
        return inventoryFeignClient.findByProductId(productId);
    }

    @GetMapping("/findPriceByProductId")
    @ResponseBody
    public String findPriceByProductId(Long productId) {
        return priceFeignClient.findByProductId(productId);
    }
}

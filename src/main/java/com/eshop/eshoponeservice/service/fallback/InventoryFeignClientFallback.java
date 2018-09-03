package com.eshop.eshoponeservice.service.fallback;

import com.eshop.eshoponeservice.service.InventoryFeignClient;
import org.springframework.stereotype.Component;

/**
 * @author: Xukai
 * @description:
 * @createDate: 2018/9/3 13:20
 * @modified By:
 */
@Component
public class InventoryFeignClientFallback implements InventoryFeignClient {

    @Override
    public String findByProductId(Long productId) {
        return "降级库存数据";
    }
}

package com.eshop.eshoponeservice.service.fallback;

import com.eshop.eshoponeservice.service.PriceFeignClient;
import org.springframework.stereotype.Component;

/**
 * @author: Xukai
 * @description:
 * @createDate: 2018/9/3 13:21
 * @modified By:
 */
@Component
public class PriceFeignClientFallback implements PriceFeignClient {

    @Override
    public String findByProductId(Long productId) {
        return "降级价格数据";
    }

}

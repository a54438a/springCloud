package com.yueguoo.springcloud.dao;

import com.yueguoo.springcloud.pojo.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author shkstart
 * @create 2019-04-29 10:48
 */
@FeignClient(value = "user-service",fallback = FallBack.class)
public interface FeignImpl {
    @GetMapping(value = "/aabb")
    public List<Customer> selectAll();
    @GetMapping(value = "/getOne/{id}")
    public Customer selectOne(@PathVariable String id);
}

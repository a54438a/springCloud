package com.yueguoo.springcloud.dao;

import com.yueguoo.springcloud.pojo.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @create 2019-04-29 11:53
 */
@Component
public class FallBack implements  FeignImpl {

    @Override
    public List<Customer> selectAll() {
        ArrayList<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setCustName("错误");
        customers.add(customer);
        return customers;
    }

    @Override
    public Customer selectOne(String id) {
        return null;
    }
}

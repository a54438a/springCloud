package com.yueguoo.springcloud.controller;


import com.yueguoo.springcloud.pojo.Customer;
import com.yueguoo.springcloud.service.TestSelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author shkstart
 * @create 2019-04-27 17:57
 */
@RestController
public class TestSelect {
    @Autowired
    private com.yueguoo.springcloud.service.TestSelectService testSelectService;


    @RequestMapping("/ccdd")
    public List<Customer> testa(){

        return  testSelectService.testa();
    }

    @RequestMapping("/getOne/{id}")
    public Customer getOne(@PathVariable String id){

        return  testSelectService.getOne(id);
    }

        public List<Customer> defaultFallback(){
            ArrayList<Customer> customers = new ArrayList<>();
            Customer customer = new Customer();
            customer.setCustName("错误");
            customers.add(customer);
            return customers;
    }
/*    public List<Customer> defaultFallback(){
        ArrayList<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setCustName("错误");
        customers.add(customer);
        return customers;
    }*/

}

package com.yueguoo.springcloud.service;


import com.yueguoo.springcloud.dao.FeignImpl;
import com.yueguoo.springcloud.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author shkstart
 * @create 2019-04-28 20:35
 */
@Service
public class TestSelectService {
    @Autowired
    private FeignImpl feign;

    public List<Customer> testa(){

        List<Customer> customers = feign.selectAll();
        return customers;
    /*    List<Customer> res=new ArrayList<Customer>();
        for(int i=0; i<40;i++){
            Customer[] forObject = restTemplate.getForObject("http://user-service/aabb", Customer[].class);
            List<Customer> customers = Arrays.asList(forObject);
            res.addAll(customers);
        }
        return  res;*/
 /*       Customer[] forObject = restTemplate.getForObject("http://user-service/aabb", Customer[].class);
        List<Customer> customers = Arrays.asList(forObject);
        return  customers;*/
    }
    public  Customer getOne(String id){
        return feign.selectOne(id);
    }


}

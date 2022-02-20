package org.sid.billingservice.feign;

import org.sid.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.ws.rs.QueryParam;

@FeignClient
public interface ProductItemRestClient {
    @GetMapping(path="/products")
    PagedModel<Product> pageProduct(@RequestParam (value ="page" )int page,
                                    @RequestParam (value="size")int size);
    @GetMapping(path="/products/{id}")
    Product getProductById(@PathVariable Long id);




}

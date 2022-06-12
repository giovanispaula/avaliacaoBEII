package com.dh.catalog.service;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "MOVIE-SERVICE")
@LoadBalancerClient (name = "MOVIE-SERVICE")
public interface MovieFeign {

    @GetMapping("/movies/{genre}")
    Object feignSearchByGenre(@PathVariable(value = "genre") String genre);
}

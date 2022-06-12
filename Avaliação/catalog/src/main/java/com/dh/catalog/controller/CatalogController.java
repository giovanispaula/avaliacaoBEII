package com.dh.catalog.controller;

import com.dh.catalog.service.CatalogService;
import com.dh.catalog.service.CatalogServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogServiceImpl service;

    @GetMapping("/{genre}")
    public ResponseEntity<?> searchByGenre(@PathVariable(name = "genre") String genre){
        return ResponseEntity.status(HttpStatus.OK.value()).body(service.searchByGenre(genre));
    }
}

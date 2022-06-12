package com.dh.movie.controller;

import com.dh.movie.entity.Movie;
import com.dh.movie.service.MovieServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    private MovieServiceImpl service;


    @PostMapping
    public ResponseEntity<?> save(@RequestBody Movie movie){
        log.info("save movie: {}", movie);
        service.save(movie);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{genre}")
    public ResponseEntity<List<Movie>> findAll(@PathVariable(name="genre") String genre){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAllByGenre(genre));
    }
}

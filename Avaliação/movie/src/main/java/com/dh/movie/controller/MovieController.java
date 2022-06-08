package com.dh.movie.controller;

import com.dh.movie.entity.Movie;
import com.dh.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

    @Autowired
    private MovieService service;


    @PostMapping
    public ResponseEntity<Void> save(@RequestBody Movie movie){
        service.save(movie);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{genre}")
    public ResponseEntity<List<Movie>> findAll(@PathVariable(name="genre") String genre){
        return ResponseEntity.status(HttpStatus.OK).body(service.findByGenre(genre));
    }
}

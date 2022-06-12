package com.dh.movie.service;

import com.dh.movie.entity.Movie;

import java.util.List;

public interface MovieService {

    void save(Movie movie);
    List<Movie> findAllByGenre(String genre);
}

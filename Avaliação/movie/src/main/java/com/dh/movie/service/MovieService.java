package com.dh.movie.service;

import com.dh.movie.entity.Movie;

import java.util.List;

public interface MovieService {
    void save(Movie movie);

//    Alterar para lista
    List<Movie> findByGenre(String genre);
}

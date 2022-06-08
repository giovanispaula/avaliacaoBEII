package com.dh.movie.service;

import com.dh.movie.entity.Movie;
import com.dh.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository repository;

    @Override
    public void save(Movie movie) {
        repository.save(movie);
    }

    @Override
    public List<Movie> findByGenre(String genre) {
        return repository.findByGenre(genre);
    };
}

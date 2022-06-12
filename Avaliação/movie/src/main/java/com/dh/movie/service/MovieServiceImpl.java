package com.dh.movie.service;

import com.dh.movie.entity.Movie;
import com.dh.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    private MovieRepository repository;

    @Override
    public void save(Movie dto) {
        Movie movie = new Movie();
        movie.setGenre(dto.getGenre());
        movie.setName(dto.getName());
        movie.setUrlStream(dto.getUrlStream());
        repository.save(movie);
    }

    @Override
    public List<Movie> findAllByGenre(String genre) {
        return repository.findAllByGenreContainsIgnoreCase(genre).orElse(null);
    };
}

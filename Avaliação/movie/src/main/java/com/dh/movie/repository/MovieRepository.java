package com.dh.movie.repository;

import com.dh.movie.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    Optional<List<Movie>> findAllByGenreContainsIgnoreCase(String genre);
}

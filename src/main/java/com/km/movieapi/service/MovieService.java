package com.km.movieapi.service;

import com.km.movieapi.model.Movie;
import com.km.movieapi.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;
    public List<Movie> getAllMovies () {
        return movieRepository.findAll();
    }
}

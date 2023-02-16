package com.km.movieapi.web;

import com.km.movieapi.model.Movie;
import com.km.movieapi.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping
    public ResponseEntity <List<Movie>> getAllMovies () {
        return new ResponseEntity<>(movieService.getAllMovies(), HttpStatus.OK);
    }
}

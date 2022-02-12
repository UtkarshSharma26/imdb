package org.app.imdb.service;

import org.app.imdb.manager.MovieManager;
import org.app.imdb.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieManager movieManager;

    @Override
    public List<Movie> getMovies(long id) {
        return movieManager.getMovies(id);
    }

    @Override
    public Movie upsertMovie(Movie movie) {
        return movieManager.upsertMovie(movie);
    }
}

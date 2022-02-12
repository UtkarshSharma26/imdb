package org.app.imdb.service;

import org.app.imdb.model.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getMovies(long id);

    Movie upsertMovie(Movie movie);
}

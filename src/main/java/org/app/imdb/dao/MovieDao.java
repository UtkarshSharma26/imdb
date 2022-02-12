package org.app.imdb.dao;

import org.app.imdb.model.Movie;

import java.util.List;

public interface MovieDao {
    List<Movie> getMovie(long id);

    Movie upsertMovie(Movie movie);
}

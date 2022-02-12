package org.app.imdb.dao;

import org.app.imdb.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieDaoImpl implements MovieDao {

    @Override
    public List<Movie> getMovie(long id) {
        return null;
    }

    @Override
    public Movie upsertMovie(Movie movie) {
        return null;
    }
}

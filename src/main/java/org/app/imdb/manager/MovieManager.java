package org.app.imdb.manager;

import org.app.imdb.dao.MovieDao;
import org.app.imdb.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MovieManager {

    @Autowired
    private MovieDao movieDao;

    public List<Movie> getMovies(long id) {
        return movieDao.getMovie(id);
    }

    public Movie upsertMovie(Movie movie) {
        return movieDao.upsertMovie(movie);
    }
}

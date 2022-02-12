package org.app.imdb.controller;

import org.app.imdb.model.Actor;
import org.app.imdb.model.Movie;
import org.app.imdb.model.Producer;
import org.app.imdb.service.ActorService;
import org.app.imdb.service.MovieService;
import org.app.imdb.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ImdbController {

    @Autowired
    private MovieService movieService;

    @Autowired
    private ActorService actorService;

    @Autowired
    private ProducerService producerService;

    @GetMapping("/getmovie/{id}")
    public List<Movie> getMovie(@PathVariable long id) {
        return movieService.getMovies(id);
    }

    @PostMapping("/upsertmovie")
    public Movie upsertMovie(@RequestBody Movie movie) {
        return movieService.upsertMovie(movie);
    }

    @PostMapping("/upsertactor")
    public Actor upsertActor(@RequestBody Actor actor) {
        return actorService.upsertActor(actor);
    }

    @PostMapping("/upsertproducer")
    public Producer upsertProducer(@RequestBody Producer producer) {
        return producerService.upsertProducer(producer);
    }
}

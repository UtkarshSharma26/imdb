package org.app.imdb.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class Movie {
    long id;
    String name;
    String plot;
    List<Long> actorIds;
    long releaseDate;
    List<String> actors;
    long producerId;
    String producer;
    String poster;
}

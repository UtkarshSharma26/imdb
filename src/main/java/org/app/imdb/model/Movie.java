package org.app.imdb.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class Movie {
    String name;
    String plot;
    long releaseDate;
    List<String> actors;
    String producer;
    String posterId;
}

package org.app.imdb.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Actor {
    long id;
    String name;
    String bio;
    long dateOfBirth;
    String gender;
}

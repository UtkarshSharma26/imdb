package org.app.imdb.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Actor {
    String name;
    String bio;
    long dateOfBirth;
    String gender;
}

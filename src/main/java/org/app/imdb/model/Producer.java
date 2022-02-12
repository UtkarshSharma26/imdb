package org.app.imdb.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Producer {
    String name;
    String bio;
    long dateOfBirth;
    String company;
    String gender;
}

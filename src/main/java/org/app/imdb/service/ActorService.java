package org.app.imdb.service;

import org.app.imdb.model.Actor;

public interface ActorService {
    Actor upsertActor(Actor actor);
}

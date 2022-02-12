package org.app.imdb.dao;

import org.app.imdb.model.Actor;

public interface ActorDao {
    Actor upsertActor(Actor actor);
}

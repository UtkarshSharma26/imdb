package org.app.imdb.manager;

import org.app.imdb.dao.ActorDao;
import org.app.imdb.model.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ActorManager {

    @Autowired
    private ActorDao actorDao;

    public Actor upsertActor(Actor actor) {
        return actorDao.upsertActor(actor);
    }
}

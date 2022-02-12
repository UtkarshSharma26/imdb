package org.app.imdb.service;

import org.app.imdb.manager.ActorManager;
import org.app.imdb.model.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActorServiceImpl implements ActorService {

    @Autowired
    private ActorManager actorManager;

    @Override
    public Actor upsertActor(Actor actor) {
        return actorManager.upsertActor(actor);
    }
}

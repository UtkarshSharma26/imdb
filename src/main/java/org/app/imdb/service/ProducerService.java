package org.app.imdb.service;

import org.app.imdb.model.Producer;

public interface ProducerService {
    Producer upsertProducer(Producer producer);
}

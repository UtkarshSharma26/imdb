package org.app.imdb.dao;

import org.app.imdb.model.Producer;

public interface ProducerDao {
    Producer upsertProducer(Producer producer);
}

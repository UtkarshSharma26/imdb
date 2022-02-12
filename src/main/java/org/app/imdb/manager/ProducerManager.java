package org.app.imdb.manager;

import org.app.imdb.dao.ProducerDao;
import org.app.imdb.model.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProducerManager {

    @Autowired
    private ProducerDao producerDao;

    public Producer upsertProducer(Producer producer) {
        return producerDao.upsertProducer(producer);
    }
}

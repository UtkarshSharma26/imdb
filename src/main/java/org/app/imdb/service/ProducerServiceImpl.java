package org.app.imdb.service;

import org.app.imdb.manager.ProducerManager;
import org.app.imdb.model.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    private ProducerManager producerManager;

    @Override
    public Producer upsertProducer(Producer producer) {
        return producerManager.upsertProducer(producer);
    }
}

package com.ibit.services;

import com.ibit.repositories.WebCounterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebCounterServiceImpl implements WebCounterService {
    private final WebCounterRepository webCounterRepository;

    @Autowired
    public WebCounterServiceImpl(WebCounterRepository webCounterRepository) {
        this.webCounterRepository = webCounterRepository;
    }
    @Override
    public int getCounter(String siteName) {
     return webCounterRepository.findById(siteName).get().getCounter();
    }

    @Override
    public void incrementCounter(String siteName) {
        var webCounter = webCounterRepository.findById(siteName).get();
        webCounter.setCounter(webCounter.getCounter() + 1);
        webCounterRepository.save(webCounter);
    }
}

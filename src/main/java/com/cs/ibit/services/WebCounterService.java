package com.cs.ibit.services;

public interface WebCounterService {
    int getCounter(String webSiteName);

    void incrementCounter(String webSiteName);
}

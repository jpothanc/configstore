package com.cs.ibit.services;

import java.util.Optional;

public interface WebCounterService {


    int getCounter(String webSiteName);

    void incrementCounter(String webSiteName);
}

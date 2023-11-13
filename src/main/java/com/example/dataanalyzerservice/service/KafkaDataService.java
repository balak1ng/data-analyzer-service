package com.example.dataanalyzerservice.service;

import com.example.dataanalyzerservice.model.Data;

public interface KafkaDataService {
    void handle(Data data);
}

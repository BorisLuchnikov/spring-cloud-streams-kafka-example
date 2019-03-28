package com.bl.output.service;

import org.springframework.cloud.stream.binder.PartitionKeyExtractorStrategy;
import org.springframework.messaging.Message;

public class CustomPartitionKeyExtractorClass implements PartitionKeyExtractorStrategy {

    @Override
    public String extractKey(Message<?> message) {
        return ((com.bl.model.dto.Message) message.getPayload()).getId().toString();
    }
}
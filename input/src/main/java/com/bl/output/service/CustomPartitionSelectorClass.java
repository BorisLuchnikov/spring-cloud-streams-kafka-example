package com.bl.output.service;

import com.bl.model.dto.Message;
import org.springframework.cloud.stream.binder.PartitionKeyExtractorStrategy;

public class CustomPartitionSelectorClass implements PartitionKeyExtractorStrategy {
    @Override
    public Object extractKey(org.springframework.messaging.Message message) {
        return ((Message) message.getPayload()).getId();
    }
}

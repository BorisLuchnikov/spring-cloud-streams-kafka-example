package com.bl.output.service;

import com.bl.model.dto.Message;
import com.bl.output.stream.MessageStreams;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MessageListener {
    @StreamListener(MessageStreams.INPUT)
    public void handle(@Payload Message message) {
        log.info("Received message: {}, thread {}", message.getMessage(), Thread.currentThread().getId());
    }
}

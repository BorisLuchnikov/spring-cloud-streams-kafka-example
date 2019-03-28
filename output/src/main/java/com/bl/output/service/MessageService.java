package com.bl.output.service;

import com.bl.model.dto.Message;
import com.bl.output.stream.MessageStreams;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Slf4j
@Service
@RequiredArgsConstructor
public class MessageService {
    private final MessageStreams messageStreams;

    public void send(final Message message) {
        log.info("Sending message {}", message);

        MessageChannel messageChannel = messageStreams.outboundMessage();
        messageChannel.send(MessageBuilder
                .withPayload(message)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }
}

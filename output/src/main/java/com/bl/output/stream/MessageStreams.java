package com.bl.output.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MessageStreams {
    String OUTPUT = "message-out";

    @Output(OUTPUT)
    MessageChannel outboundMessage();

}

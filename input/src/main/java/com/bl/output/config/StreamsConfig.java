package com.bl.output.config;

import com.bl.output.stream.MessageStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(MessageStreams.class)
public class StreamsConfig {
}

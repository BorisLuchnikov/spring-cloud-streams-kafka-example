package com.bl.input.config;

import com.bl.input.stream.MessageStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(MessageStreams.class)
public class StreamsConfig {

}

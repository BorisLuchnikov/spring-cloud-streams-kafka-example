package com.bl.output.config;

import com.bl.output.service.CustomPartitionKeyExtractorClass;
import com.bl.output.stream.MessageStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;

@EnableBinding(MessageStreams.class)
public class StreamsConfig {

    @Bean
    public CustomPartitionKeyExtractorClass customPartitionKeyExtractor() {
        return new CustomPartitionKeyExtractorClass();
    }

}

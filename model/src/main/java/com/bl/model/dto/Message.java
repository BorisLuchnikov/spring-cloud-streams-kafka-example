package com.bl.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class Message {
    public Long id;
    private long timestamp;
    private String message;
}

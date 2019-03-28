package com.bl.output.web;

import com.bl.output.service.MessageService;
import com.bl.model.dto.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MessageController {
    private final MessageService messageService;


    @GetMapping("/message")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void message(@RequestParam("message") String message,
                        @RequestParam("count") long count,
                        @RequestParam("partitionCount") long partitionCount) {

        for (long i = 0; i < count; i++) {
            for (long j = 0; j < partitionCount; j++) {
                Message m = Message.builder()
                        .id(j)
                        .message(message + " partition:" + j + ", message: " + i)
                        .timestamp(System.currentTimeMillis())
                        .build();

                messageService.send(m);
            }
        }
    }
}

package com.example.springdemo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SendMessage {
    private String content;

    public SendMessage(String content) {
        this.content = content;
    }
}

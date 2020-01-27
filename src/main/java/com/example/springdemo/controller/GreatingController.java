package com.example.springdemo.controller;

import com.example.springdemo.model.ReceiveMessage;
import com.example.springdemo.model.SendMessage;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import java.security.Principal;

@Controller
public class GreatingController {

    @MessageMapping("/inpoint")
    @SendTo("/topic/pit")
    public SendMessage greeting(MessageHeaders headers, ReceiveMessage message) throws InterruptedException {
        Thread.sleep(1000);
        return new SendMessage(headers.get("simpSessionId") + " > " + HtmlUtils.htmlEscape(message.getContent()));
    }

}

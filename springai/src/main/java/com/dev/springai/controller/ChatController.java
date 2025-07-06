package com.dev.springai.controller;

import com.dev.springai.dto.ChatRequest;
import com.dev.springai.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ChatController {

    private final ChatService chatService;

    @PostMapping("/chat")
    public String chat(@RequestBody ChatRequest chatRequest) {
        // This method will handle chat requests
        return chatService.chat(chatRequest);
    }
}

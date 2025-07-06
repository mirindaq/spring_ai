package com.dev.springai.service.impl;

import com.dev.springai.dto.ChatRequest;
import com.dev.springai.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatServiceImpl implements ChatService {

    private final ChatClient chatClient;

    @Override
    public String chat(ChatRequest chatRequest) {
        return chatClient.prompt(chatRequest.getPrompt())
                .call()
                .content();
    }
}

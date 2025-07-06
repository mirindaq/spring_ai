package com.dev.springai.service.impl;

import com.dev.springai.dto.ChatRequest;
import com.dev.springai.service.ChatService;
import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.messages.SystemMessage;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChatServiceImpl implements ChatService {

    private final ChatClient chatClient;

    @Override
    public String chat(ChatRequest chatRequest) {
        SystemMessage systemMessage = new SystemMessage("You are AI Assistant" +
                " You should response by Vietnamese language " +
                    " You should response in a short way");

        UserMessage userMessage = new UserMessage(chatRequest.getMessage());

        Prompt prompt = new Prompt(systemMessage,userMessage);

        return chatClient.prompt(prompt)
                .call()
                .content();
    }
}

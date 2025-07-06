package com.dev.springai.service;

import com.dev.springai.dto.ChatRequest;

public interface ChatService {
    String chat(ChatRequest chatRequest);
}

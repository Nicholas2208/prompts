package com.nwhite.prompts;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimplePromptController {
    private final ChatClient chatClient;

    public SimplePromptController(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @GetMapping("/stupid-jokes")
    public String simple() {
        return chatClient.prompt("Tell me a stupid joke").call().content();
    }
}

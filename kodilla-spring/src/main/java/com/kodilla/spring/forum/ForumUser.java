package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
   private String username;

    public ForumUser(String username) {
        this.username = username;
    }

    public String getUsername() {
        return "John Smith";
    }
}


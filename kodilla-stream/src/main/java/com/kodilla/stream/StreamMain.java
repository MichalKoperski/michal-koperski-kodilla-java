package com.kodilla.stream;

import com.kodilla.stream.forumuser.*;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();

        Map<Integer, ForumUser> mapofUsers = theForum.getUserList().stream()
                .filter(user -> user.getSex() == 'm')
                .filter(user -> user.getBirthDate().isBefore(LocalDate.of(1998, 04, 18)))
                .filter(user -> user.getPosts() >=1)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));

        mapofUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
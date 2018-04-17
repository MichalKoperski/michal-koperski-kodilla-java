package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int posts;

    public ForumUser(int id, String username, char sex, LocalDate birthDate, int posts) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.birthDate = birthDate;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", posts=" + posts +
                '}';
    }
}

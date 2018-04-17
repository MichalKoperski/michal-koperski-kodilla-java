package com.kodilla.stream.forumuser;

import java.util.*;
import java.time.*;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(0, "a",
                'm', LocalDate.of(1990, 03, 04), 10));
        theUserList.add(new ForumUser(0, "b",
                'f', LocalDate.of(1990, 01, 05), 120));
        theUserList.add(new ForumUser(0, "c",
                'f', LocalDate.of(1980, 01, 07), 5));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);
    }
}

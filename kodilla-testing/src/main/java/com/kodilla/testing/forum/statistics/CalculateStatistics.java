package com.kodilla.testing.forum.statistics;
public class CalculateStatistics {
    Statistics statistics;
    public void calculateAdvStatistics(Statistics statistics) {
        int usersCount = statistics.usersNames().size();
        int postsQuantity = statistics.postsCount();
        int commentsQuantity = statistics.commentsCount();
        int averagePostsPerUser = statistics.postsCount()/statistics.usersNames().size();
        int averageCommentsPerUser = statistics.commentsCount()/statistics.usersNames().size();
        int averageCommentPerPost = statistics.commentsCount()/statistics.postsCount();
    }
}

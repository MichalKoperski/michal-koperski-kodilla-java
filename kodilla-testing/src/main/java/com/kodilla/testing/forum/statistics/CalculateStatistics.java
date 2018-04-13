package com.kodilla.testing.forum.statistics;
public class CalculateStatistics {
    Statistics statistics;
    public void calculateAdvStatistics(Statistics statistics, int averagePostsPerUser, int averageCommentsPerUser, int averageCommentPerPost) {
        int usersCount = statistics.usersNames().size();
        int postsQuantity = statistics.postsCount();
        int commentsQuantity = statistics.commentsCount();
        averagePostsPerUser = statistics.postsCount()/statistics.usersNames().size();
        averageCommentsPerUser = statistics.commentsCount()/statistics.usersNames().size();
        averageCommentPerPost = statistics.commentsCount()/statistics.postsCount();
    }
    public int getAV1() {
        return this.averagePostsPerUser;
    }
    public int getAV2() {
        return this.averageCommentsPerUser;
    }
    public int getAV3() {
        return this.averageCommentPerPost;
    }
}

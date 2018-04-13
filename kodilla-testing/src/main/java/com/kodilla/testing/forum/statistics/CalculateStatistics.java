package com.kodilla.testing.forum.statistics;
public class CalculateStatistics {
    Statistics statistics;
    public void calculateAdvStatistics(Statistics statistics) {
        private int averagePostsPerUser;
        private int averageCommentsPerUser;
        private int averageCommentPerPost;

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

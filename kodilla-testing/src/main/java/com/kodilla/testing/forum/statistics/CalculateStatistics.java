package com.kodilla.testing.forum.statistics;
public class CalculateStatistics {
    Statistics statistics;
    private int averagePostsPerUser;
    private int averageCommentsPerUser;
    private int averageCommentPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        if (statistics.usersNames().size() != 0) {
            averagePostsPerUser = statistics.postsCount() / statistics.usersNames().size();
            averageCommentsPerUser = statistics.commentsCount() / statistics.usersNames().size();
        } else {
            averagePostsPerUser = 0;
            averageCommentsPerUser = 0;
        }
        if (statistics.postsCount() != 0) {
                averageCommentPerPost = statistics.commentsCount() / statistics.postsCount();
        } else {
                averageCommentPerPost = 0;
        }
    }
    public int getAveragePost() {
        return this.averagePostsPerUser;
    }
    public int getAverageComment() {
        return this.averageCommentsPerUser;
    }
    public int getAverageCperP() {
        return this.averageCommentPerPost;
    }
}
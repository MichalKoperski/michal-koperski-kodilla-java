package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User bob = new Millenials("Bob");
        User john = new YGeneration("John");
        User tom = new ZGeneration("Tom");

        //When
        String bobPrefers = bob.sharePost();
        System.out.println("Bob prefers"  + bobPrefers);
        String johnPrefers = john.sharePost();
        System.out.println("John prefers"  + johnPrefers);
        String tomPrefers = tom.sharePost();
        System.out.println("Tom prefers"  + tomPrefers);

        //Then
        Assert.assertEquals("Publish via Facebook", bobPrefers);
        Assert.assertEquals("Publish via Snapchat", johnPrefers);
        Assert.assertEquals("Publish via Twitter", tomPrefers);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User bob = new Millenials("Bob");

        //When
        String bobPrefers = bob.sharePost();
        System.out.println("Bob prefers"  + bobPrefers);
        bob.setSocialMethod(new TwitterPublisher());
        bobPrefers = bob.sharePost();
        System.out.println("Bob now prefers"  + bobPrefers);

       //Then
        Assert.assertEquals("Publish via Twitter", bobPrefers);
    }
}

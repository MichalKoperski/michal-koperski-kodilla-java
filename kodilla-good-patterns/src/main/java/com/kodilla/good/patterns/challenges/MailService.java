package com.kodilla.good.patterns.challenges;

public class MailService implements InformationSender {
    public void inform (User user) {
        System.out.println("You have bought new item");
    }
}

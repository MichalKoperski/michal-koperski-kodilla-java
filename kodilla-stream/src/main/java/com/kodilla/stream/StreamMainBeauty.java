package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMainBeauty {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Some text", (text) -> text+" ABC ");
        poemBeautifier.beautify("Some text", (text) -> text.toLowerCase());
        poemBeautifier.beautify("Some text", (text) -> text.toUpperCase());
        poemBeautifier.beautify("Some text", (text) -> text.substring(2));
        poemBeautifier.beautify("Some text", (text) -> text.substring(2, 6));
    }
}
package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    private Statistics statistics;

    public int averagePublicationYear(Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books) {
        Statistics statistics = new Statistics();
        return statistics.averagePublicationYear(books);
    }
    public int medianPublicationYear(Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book> books){
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }

}
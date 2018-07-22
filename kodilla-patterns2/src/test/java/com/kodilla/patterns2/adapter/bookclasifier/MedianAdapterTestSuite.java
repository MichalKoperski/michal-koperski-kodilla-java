package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        com.kodilla.patterns2.adapter.bookclasifier.librarya.Book book1 = new com.kodilla.patterns2.adapter.bookclasifier.librarya.Book("aa","bb",2000, "sss");
        com.kodilla.patterns2.adapter.bookclasifier.librarya.Book book2 = new com.kodilla.patterns2.adapter.bookclasifier.librarya.Book("aadd","bbff",1990, "sss");
        com.kodilla.patterns2.adapter.bookclasifier.librarya.Book book3 = new com.kodilla.patterns2.adapter.bookclasifier.librarya.Book("addadd","bbfdf",2010, "sss");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);

        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int medianYear = medianAdapter.publicationYearMedian(bookSet);
        //Then
        System.out.println(medianYear);
        assertEquals(medianYear, 2000);
    }
}

package com.kodilla.testing.library;

import java.util.*;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> bookListInHands = new ArrayList<Book>();
        HashMap<LibraryUser, Book> bookMapInHands = new HashMap<LibraryUser, Book>();

        for (Map.Entry<LibraryUser, Book> inHandsBook : bookMapInHands.entrySet()) {
            if (inHandsBook.getKey() == libraryUser) {
                bookListInHands.add(inHandsBook.getValue());
            }

        }
        return bookListInHands;
    }
}
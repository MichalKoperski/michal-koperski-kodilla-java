package com.kodilla.testing.library;

import org.junit.*;

import java.util.*;

import static org.mockito.Matchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    @Test
    public void testListBooksInHandsOf1() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> resultListOfBooksInHands = new ArrayList<Book>();

        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        LibraryUser user1 = new LibraryUser("John", "A", "9999");
        LibraryUser user2 = new LibraryUser("Bob", "B", "1111");

        resultListOfBooksInHands.add(book1);

        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(resultListOfBooksInHands);

        // When
        List<Book> theListOfBooksInHands = bookLibrary.listBooksInHandsOf(user1);

        // Then
        assertEquals(1, theListOfBooksInHands.size());
    }
    @Test
    public void testListBooksInHandsOf5() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> resultListOfBooksInHands = new ArrayList<Book>();

        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secrets of Alkkamo", "John Smith", 2088);
        Book book4 = new Book("Secrets of Alamo", "Jyyohn Smith", 2008);
        Book book5 = new Book("Secrets of Alamo", "John Smith", 2018);
        LibraryUser user1 = new LibraryUser("John", "A", "9999");

        resultListOfBooksInHands.add(book1);
        resultListOfBooksInHands.add(book2);
        resultListOfBooksInHands.add(book3);
        resultListOfBooksInHands.add(book4);
        resultListOfBooksInHands.add(book5);

        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(resultListOfBooksInHands);

        // When
        List<Book> theListOfBooksInHands = bookLibrary.listBooksInHandsOf(user1);

        // Then
        assertEquals(5, theListOfBooksInHands.size());
    }
    @Test
    public void testListBooksInHandsOf0() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> resultListOfBooksInHands = new ArrayList<Book>();

        LibraryUser user1 = new LibraryUser("John", "A", "9999");


        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(resultListOfBooksInHands);

        // When
        List<Book> theListOfBooksInHands = bookLibrary.listBooksInHandsOf(user1);

        // Then
        assertEquals(0, theListOfBooksInHands.size());
    }
    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }
    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
}
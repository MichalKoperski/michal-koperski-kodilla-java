package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testToString() {
        //given
        Book book1 = new Book("AAA", "John", LocalDate.of(2000,3,3));
        Book book2 = new Book("BBB", "John", LocalDate.of(2010,3,3));
        Book book3 = new Book("CCC", "John", LocalDate.of(2001,3,3));

        Book book4 = new Book(book1.getTitle(), book1.getAuthor(), book1.getPublicationDate());
        Book book5 = new Book(book2.getTitle(), book2.getAuthor(), book2.getPublicationDate());
        Book book6 = new Book(book3.getTitle(), book3.getAuthor(), book3.getPublicationDate());

        Library library = new Library("Book set 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //making a shallow copy of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Book set 2 SHALLOW");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Book set 3 DEEP");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}

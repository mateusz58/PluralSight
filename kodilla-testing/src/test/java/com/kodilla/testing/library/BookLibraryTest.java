package com.kodilla.testing.library;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import Generators.NumberGenerator;
import Generators.WordGenerator;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class BookLibraryTest {

    LibraryDatabase libraryDatabaseMock;
    BookLibrary bookLibrary;

    List<Book> generateListOfNBooks(int length)
    {
        List<Book> resultListOf10Books = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            resultListOf10Books.add(new Book(WordGenerator.generateRandomWord(),WordGenerator.generateRandomWord(), NumberGenerator.generateRandomNumber(10
            )));
        }
        return resultListOf10Books;
    }

    @BeforeEach
    void setUp() {
       libraryDatabaseMock = mock(LibraryDatabase.class);
       bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            resultListOf10Books.add(new Book(WordGenerator.generateRandomWord(),WordGenerator.generateRandomWord(), NumberGenerator.generateRandomNumber(10
            )));
        }
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
            .thenReturn(resultListOf10Books);
    }

    @Test
    void listBooksInHandsOfShouldReturnEmpty() {
        // Given
        List<Book> givenListOf0 = new ArrayList<>();
        LibraryUser user=new LibraryUser(WordGenerator.generateRandomWord(),WordGenerator.generateRandomWord(),WordGenerator.generateRandomWord());
        when(libraryDatabaseMock.listBooksInHandsOf(user))
            .thenReturn(givenListOf0);

        // When
        List<Book> rersultListOf0Books = bookLibrary.listBooksInHandsOf(user);

        // Then
        assertEquals(0, rersultListOf0Books.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    void listBooksInHandsOfShouldReturn1() {
        // Given
        List<Book> givenListOf1 = generateListOfNBooks(1);
        LibraryUser user=new LibraryUser(WordGenerator.generateRandomWord(),WordGenerator.generateRandomWord(),WordGenerator.generateRandomWord());
        when(libraryDatabaseMock.listBooksInHandsOf(user))
            .thenReturn(givenListOf1);

        // When
        List<Book> rersultListOf1Books = bookLibrary.listBooksInHandsOf(user);

        // Then
        assertEquals(1, rersultListOf1Books.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    void listBooksInHandsOfShouldReturn5() {
        // Given
        List<Book> givenListOf5 = generateListOfNBooks(5);
        LibraryUser user=new LibraryUser(WordGenerator.generateRandomWord(),WordGenerator.generateRandomWord(),WordGenerator.generateRandomWord());
        when(libraryDatabaseMock.listBooksInHandsOf(user))
            .thenReturn(givenListOf5);
        // When
        List<Book> rersultListOf5Books = bookLibrary.listBooksInHandsOf(user);
        // Then
        assertEquals(5, rersultListOf5Books.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
    @ParameterizedTest
    @ValueSource(ints={5,1,0})
    void listBooksInHandsOfParametrizedTests(int parametr) {
        // Given
        List<Book> givenListOf5 = generateListOfNBooks(parametr);
        LibraryUser user=new LibraryUser(WordGenerator.generateRandomWord(),WordGenerator.generateRandomWord(),WordGenerator.generateRandomWord());
        when(libraryDatabaseMock.listBooksInHandsOf(user))
            .thenReturn(givenListOf5);
        // When
        List<Book> rersultListOf5Books = bookLibrary.listBooksInHandsOf(user);
        // Then
        assertEquals(parametr, rersultListOf5Books.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
}

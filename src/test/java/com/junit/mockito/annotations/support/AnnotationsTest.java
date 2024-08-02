package com.junit.mockito.annotations.support;



import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

//@RunWith(MockitoJUnitRunner.class)
public class AnnotationsTest {

    // always it should be public if we use private it won't run
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @InjectMocks
    private BookService bookService;

    @Mock
    private BookRepository bookRepository;

//    @Before
//    public void beforeEach(){
//        MockitoAnnotations.initMocks(this);
//
//    }

    @Test
    public void demoCreateMocksUsingAnnotations(){


        Book book1 = new Book("1234","Mockito in action",500, LocalDate.now());
        Book book2 = new Book("1222","Junit Testing",400,LocalDate.now());

        List<Book> newBooks = new ArrayList<>();
        newBooks.add(book1);
        newBooks.add(book2);

        when(bookRepository.findNewBooks(7)).thenReturn(newBooks);

        List<Book> newBooksWithAppliedDiscount = bookService.getNewBooksWithAppliedDiscount(10,7);

        assertEquals(2,newBooksWithAppliedDiscount.size());
        assertEquals(450,newBooksWithAppliedDiscount.get(0).getPrice());
        assertEquals(360,newBooksWithAppliedDiscount.get(1).getPrice());


    }
}

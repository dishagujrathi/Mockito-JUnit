package com.junit.mockito.annotations.support;

import java.time.LocalDate;

public class Book {

    private String bookId;
    private String title;
    private int price;
    private LocalDate publishedTime;

    public Book(String bookId, String title, int price, LocalDate publishedTime) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.publishedTime = publishedTime;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getPublishedTime() {
        return publishedTime;
    }

    public void setPublishedTime(LocalDate publishedTime) {
        this.publishedTime = publishedTime;
    }
}

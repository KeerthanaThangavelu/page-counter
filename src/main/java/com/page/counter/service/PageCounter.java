package com.page.counter.service;

public class PageCounter {
    private Integer pageCount = 0;

    public synchronized void increment() {
        pageCount++;
    }

    public synchronized Integer getPageCount() {
        return pageCount;
    }
}

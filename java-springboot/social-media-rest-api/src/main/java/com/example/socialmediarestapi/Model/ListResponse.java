package com.example.socialmediarestapi.Model;

import java.util.List;
public class ListResponse<T> {
    private List<T> data;
    private int total;
    private int page;
    private int limit;

    // Constructors
    public ListResponse() {}

    public ListResponse(List<T> data, int total, int page, int limit) {
        this.data = data;
        this.total = total;
        this.page = page;
        this.limit = limit;
    }

    // Getters and Setters
    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}


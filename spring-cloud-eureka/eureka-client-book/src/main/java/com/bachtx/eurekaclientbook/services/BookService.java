package com.bachtx.eurekaclientbook.services;

import com.bachtx.eurekaclientbook.dto.response.BookResponse;

import java.util.List;

public interface BookService {
    BookResponse getBookById(int id);
    List<BookResponse> getAllBook();
}

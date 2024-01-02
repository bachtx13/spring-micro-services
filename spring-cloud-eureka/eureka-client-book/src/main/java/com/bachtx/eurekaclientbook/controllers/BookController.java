package com.bachtx.eurekaclientbook.controllers;

import com.bachtx.eurekaclientbook.dto.response.BookResponse;
import com.bachtx.eurekaclientbook.services.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/")
@AllArgsConstructor
public class BookController {
    private final BookService bookService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<BookResponse>> getAllBooks() {
        return ResponseEntity.ok(this.bookService.getAllBook());
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<BookResponse> getBookById(@PathVariable int id) {
        return ResponseEntity.ok(this.bookService.getBookById(id));
    }
}

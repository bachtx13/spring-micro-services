package com.bachtx.eurekaclientbook.services.impl;

import com.bachtx.eurekaclientbook.entities.Book;
import com.bachtx.eurekaclientbook.dto.response.BookResponse;
import com.bachtx.eurekaclientbook.exceptions.ResourceNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import com.bachtx.eurekaclientbook.services.BookService;

import java.util.List;

@Service
//@AllArgsConstructor
public class BookServiceImpl implements BookService {
    //mock data
    private final List<Book> books = List.of(
            new Book(1, "Naruto", "Kishimoto Musashi"),
            new Book(2, "Bleach", "Kubo Noriaki"),
            new Book(3, "Jigokuraku", "Kaku Yuuji")
    );

    private final ModelMapper modelMapper;
    public BookServiceImpl(ModelMapper modelMapper){
        super();
        this.modelMapper = modelMapper;
    }
    @Override
    public BookResponse getBookById(int id) {
        Book foundBook = this.books.stream().filter(book -> book.getId() == id)
                .findFirst().orElseThrow(ResourceNotFoundException::new);
        return this.modelMapper.map(foundBook, BookResponse.class);
    }

    @Override
    public List<BookResponse> getAllBook() {
        return this.books.stream().map(book -> this.modelMapper.map(book, BookResponse.class)).toList();
    }
}

package com.bachtx.genresservice.controllers;

import com.bachtx.genresservice.dto.request.CreateGenreRequest;
import com.bachtx.genresservice.dto.response.GenreResponse;
import com.bachtx.genresservice.dto.response.ResponseObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.UUID;

public interface GenreController {
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    ResponseEntity<ResponseObject<GenreResponse>> getGenreById(@PathVariable UUID id);

    @RequestMapping(value = "/get-all", method = RequestMethod.GET)
    ResponseEntity<ResponseObject<List<GenreResponse>>> getAllGenre();

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    ResponseEntity<ResponseObject<GenreResponse>> createGenre(@RequestBody CreateGenreRequest createMangaRequest);
}

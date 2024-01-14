package com.bachtx.genresservice.services;

import com.bachtx.genresservice.dto.request.CreateGenreRequest;
import com.bachtx.genresservice.dto.response.GenreResponse;

import java.util.List;
import java.util.UUID;

public interface GenreService {

    List<GenreResponse> getAllGenre();

    GenreResponse getGenreById(UUID id);

    GenreResponse createGenre(CreateGenreRequest createGenreRequest);
}

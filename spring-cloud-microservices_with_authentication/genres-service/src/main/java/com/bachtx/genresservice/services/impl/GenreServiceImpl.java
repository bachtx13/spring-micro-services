package com.bachtx.genresservice.services.impl;

import com.bachtx.genresservice.dto.request.CreateGenreRequest;
import com.bachtx.genresservice.dto.response.GenreResponse;
import com.bachtx.genresservice.services.GenreService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class GenreServiceImpl implements GenreService {
    @Override
    public List<GenreResponse> getAllGenre() {
        return null;
    }

    @Override
    public GenreResponse getGenreById(UUID id) {
        return null;
    }

    @Override
    public GenreResponse createGenre(CreateGenreRequest createGenreRequest) {
        return null;
    }
}

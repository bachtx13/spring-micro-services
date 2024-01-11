package com.bachtx.mangaservice.services;

import com.bachtx.mangaservice.dto.request.manga.CreateMangaRequest;
import com.bachtx.mangaservice.dto.response.MangaResponse;

import java.util.List;
import java.util.UUID;

public interface MangaService {
    List<MangaResponse> getAllManga();

    MangaResponse getMangaById(UUID id);

    MangaResponse createManga(CreateMangaRequest createMangaRequest);
}

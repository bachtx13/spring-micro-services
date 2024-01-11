package com.bachtx.mangaservice.services.impl;

import com.bachtx.mangaservice.dto.request.manga.CreateMangaRequest;
import com.bachtx.mangaservice.dto.response.MangaResponse;
import com.bachtx.mangaservice.entites.Manga;
import com.bachtx.mangaservice.exceptions.ResourceNotFoundException;
import com.bachtx.mangaservice.exceptions.UpdateResourceException;
import com.bachtx.mangaservice.mappers.MangaMapper;
import com.bachtx.mangaservice.repositories.MangaRepository;
import com.bachtx.mangaservice.services.MangaService;
import jakarta.persistence.OptimisticLockException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class MangaServiceImpl implements MangaService {
    private final MangaRepository mangaRepository;
    private final MangaMapper mangaMapper = MangaMapper.INSTANCE;

    @Override
    public List<MangaResponse> getAllManga() {
        try {
            List<Manga> mangas = mangaRepository.findAll();
            return mangaMapper.mangaEntityListToMangaResponseList(mangas);
        } catch (IllegalArgumentException ex) {
            throw new ResourceNotFoundException("Manga not found");
        } catch (OptimisticLockException ex) {
            throw new UpdateResourceException("Can't create manga");
        }
    }

    @Override
    public MangaResponse getMangaById(UUID id) {
        try {
            Manga manga = mangaRepository.findById(id)
                    .orElseThrow(IllegalArgumentException::new);
            return mangaMapper.mangaEntityToMangaResponse(manga);
        } catch (IllegalArgumentException ex) {
            throw new ResourceNotFoundException("Manga not found");
        } catch (OptimisticLockException ex) {
            throw new UpdateResourceException("Can't create manga");
        }
    }

    @Override
    public MangaResponse createManga(CreateMangaRequest createMangaRequest) {
        try {
            Manga manga = mangaMapper.createMangaRequestToMangaEntity(createMangaRequest);
            Manga mangaCreated = mangaRepository.save(manga);
            return mangaMapper.mangaEntityToMangaResponse(mangaCreated);
        } catch (OptimisticLockException ex) {
            throw new UpdateResourceException("Can't create manga");
        }
    }
}

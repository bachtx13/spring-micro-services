package com.bachtx.mangaservice.mappers;

import com.bachtx.mangaservice.dto.request.manga.CreateMangaRequest;
import com.bachtx.mangaservice.dto.response.MangaResponse;
import com.bachtx.mangaservice.entites.Manga;
import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MangaMapper {
    MangaMapper INSTANCE = Mappers.getMapper(MangaMapper.class);

    @Mappings({})
    Manga createMangaRequestToMangaEntity(CreateMangaRequest createMangaRequest);

    @Mappings({})
    MangaResponse mangaEntityToMangaResponse(Manga manga);

    @Mappings({})
    List<MangaResponse> mangaEntityListToMangaResponseList(List<Manga> mangas);
}

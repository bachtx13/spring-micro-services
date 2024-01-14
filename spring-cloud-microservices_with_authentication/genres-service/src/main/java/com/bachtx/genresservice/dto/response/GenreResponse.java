package com.bachtx.genresservice.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
public class GenreResponse {
    private UUID id;
    private String name;
    private String description;
    private List<MangaResponse> mangas;
}

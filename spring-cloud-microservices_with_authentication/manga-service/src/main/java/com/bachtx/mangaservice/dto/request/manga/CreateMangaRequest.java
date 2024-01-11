package com.bachtx.mangaservice.dto.request.manga;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CreateMangaRequest {
    private String name;
    private String description;
}

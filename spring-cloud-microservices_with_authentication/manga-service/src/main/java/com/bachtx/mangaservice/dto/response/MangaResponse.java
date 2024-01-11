package com.bachtx.mangaservice.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Builder
public class MangaResponse {
    private UUID id;
    private String name;
    private String description;
}

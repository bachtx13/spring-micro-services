package com.bachtx.genresservice.controllers.impl;

import com.bachtx.genresservice.controllers.GenreController;
import com.bachtx.genresservice.dto.request.CreateGenreRequest;
import com.bachtx.genresservice.dto.response.GenreResponse;
import com.bachtx.genresservice.dto.response.MangaResponse;
import com.bachtx.genresservice.dto.response.ResponseObject;
import com.bachtx.genresservice.feignclients.MangaFeignClient;
import com.bachtx.genresservice.services.GenreService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "")
@AllArgsConstructor
public class GenreControllerImpl implements GenreController {
    private final GenreService genreService;
    private final MangaFeignClient mangaFeignClient;
    @Override
    public ResponseEntity<ResponseObject<GenreResponse>> getGenreById(UUID id) {
        GenreResponse genreResponse = genreService.getGenreById(id);
        ResponseObject<GenreResponse> result = ResponseObject.<GenreResponse>builder()
                .message("Get genre successfully")
                .result(genreResponse)
                .build();
        return ResponseEntity.ok(result);
    }

    @Override
    public ResponseEntity<ResponseObject<List<GenreResponse>>> getAllGenre() {
        ResponseObject<List<MangaResponse>> mangaResponse = mangaFeignClient.getMangasByGenreId();
        ResponseObject<List<GenreResponse>> result = ResponseObject.<List<GenreResponse>>builder()
                .message("Get genres successfully")
                .result(List.of(
                        GenreResponse.builder()
                                .mangas(mangaResponse.getResult())
                                .build()
                ))
                .build();
        return ResponseEntity.ok(result);
    }

    @Override
    public ResponseEntity<ResponseObject<GenreResponse>> createGenre(CreateGenreRequest createMangaRequest) {
        ResponseObject<GenreResponse> result = ResponseObject.<GenreResponse>builder()
                .message("Create genre successfully")
                .build();
        return ResponseEntity.ok(result);
    }
}

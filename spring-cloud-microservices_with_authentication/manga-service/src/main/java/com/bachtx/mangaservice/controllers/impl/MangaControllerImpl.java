package com.bachtx.mangaservice.controllers.impl;

import com.bachtx.mangaservice.controllers.MangaController;
import com.bachtx.mangaservice.dto.request.manga.CreateMangaRequest;
import com.bachtx.mangaservice.dto.response.MangaResponse;
import com.bachtx.mangaservice.dto.response.ResponseObject;
import com.bachtx.mangaservice.services.MangaService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "")
@AllArgsConstructor
public class MangaControllerImpl implements MangaController {
    private final MangaService mangaService;

    @Override
    public ResponseEntity<ResponseObject<MangaResponse>> getMangaById(UUID id) {
        MangaResponse mangaResponse = mangaService.getMangaById(id);
        ResponseObject<MangaResponse> result = ResponseObject.<MangaResponse>builder()
                .message("Get manga successfully")
                .result(mangaResponse)
                .build();
        return ResponseEntity.ok(result);
    }

    @Override
    public ResponseEntity<ResponseObject<List<MangaResponse>>> getAllManga() {
        List<MangaResponse> mangaResponseList = mangaService.getAllManga();
        ResponseObject<List<MangaResponse>> result = ResponseObject.<List<MangaResponse>>builder()
                .message("Get mangas successfully")
                .result(mangaResponseList)
                .build();
        return ResponseEntity.ok(result);
    }

    @Override
    public ResponseEntity<ResponseObject<MangaResponse>> createManga(CreateMangaRequest createMangaRequest) {
        MangaResponse createdManga = mangaService.createManga(createMangaRequest);
        ResponseObject<MangaResponse> result = ResponseObject.<MangaResponse>builder()
                .message("Create manga successfully")
                .result(createdManga)
                .build();
        return ResponseEntity.ok(result);
    }
}

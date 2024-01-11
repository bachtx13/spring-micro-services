package com.bachtx.mangaservice.controllers;

import com.bachtx.mangaservice.dto.request.manga.CreateMangaRequest;
import com.bachtx.mangaservice.dto.response.MangaResponse;
import com.bachtx.mangaservice.dto.response.ResponseObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.UUID;

public interface MangaController {
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    ResponseEntity<ResponseObject<MangaResponse>> getMangaById(@PathVariable UUID id);

    @RequestMapping(value = "/get-all", method = RequestMethod.GET)
    ResponseEntity<ResponseObject<List<MangaResponse>>> getAllManga();

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    ResponseEntity<ResponseObject<MangaResponse>> createManga(@RequestBody CreateMangaRequest createMangaRequest);
}

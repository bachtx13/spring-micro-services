package com.bachtx.genresservice.feignclients;

import com.bachtx.genresservice.dto.response.MangaResponse;
import com.bachtx.genresservice.dto.response.ResponseObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "manga-service", url = "http://hb:8762/manga")
public interface MangaFeignClient {
    @RequestMapping(method = RequestMethod.GET, value = "/get-all")
    ResponseObject<List<MangaResponse>> getMangasByGenreId();

}

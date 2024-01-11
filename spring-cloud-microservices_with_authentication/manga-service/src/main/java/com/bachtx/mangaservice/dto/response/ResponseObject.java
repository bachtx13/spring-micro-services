package com.bachtx.mangaservice.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResponseObject<T> {
    private String message;
    private String error;
    private T result;
}

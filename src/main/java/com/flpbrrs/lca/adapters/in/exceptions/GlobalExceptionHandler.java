package com.flpbrrs.lca.adapters.in.exceptions;

import com.flpbrrs.lca.domain.exceptions.ChampionNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ChampionNotFoundException.class)
    public ResponseEntity<ApiError> handleDomainException(ChampionNotFoundException ex) {
        return ResponseEntity.badRequest().body(new ApiError(ex.getMessage()));
    }

    public record ApiError(String message) { }
}

package com.example.F1API.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class HttpErrorResponse {
    private int status;
    private String Error;
    private LocalDateTime timestamp;
}
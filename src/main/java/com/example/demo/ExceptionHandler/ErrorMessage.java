package com.example.demo.ExceptionHandler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ErrorMessage {
HttpStatus status;
String errorMessage;
LocalDateTime timeStamp;
}

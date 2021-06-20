package com.example.demo.request;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class UserNewRequest {
private String name;
private String description;
private MultipartFile image;
}

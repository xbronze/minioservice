package com.example.minioserver.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author: xbronze
 * @date: 2024-10-26 16:59
 * @description: TODO
 */
public interface FileUploadService {

    public String fileUpload(MultipartFile multipartFile);

}

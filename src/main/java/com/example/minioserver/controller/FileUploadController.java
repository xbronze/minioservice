package com.example.minioserver.controller;

import com.example.minioserver.service.FileUploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: xbronze
 * @date: 2024-10-26 16:59
 * @description: TODO
 */
@RestController
public class FileUploadController {

    @Autowired
    private FileUploadService fileUploadService ;

    @PostMapping(value = "/fileUpload")
    public Map<String,String> fileUploadService(@RequestParam(value = "file") MultipartFile multipartFile) {
        Map<String, String> map = new HashMap<>();
        String fileUrl = fileUploadService.fileUpload(multipartFile);
        map.put("fileurl",fileUrl);
        return map;
    }

}

package com.example.minioserver.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author: xbronze
 * @date: 2024-10-26 17:04
 * @description: TODO
 */
@Data
@ConfigurationProperties(prefix="minio") //读取节点
public class MinioProperties {

    private String endpointUrl;
    private String accessKey;
    private String secreKey;
    private String bucketName;

}

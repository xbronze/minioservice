package com.example.minioserver.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: xbronze
 * @date: 2024-10-26 17:04
 * @description: 加载配置文件中的信息
 */
@Data
@ConfigurationProperties(prefix="minio") //读取节点
public class MinioProperties {

    private String endpointUrl;
    private String accessKey;
    private String secreKey;
    private String bucketName;

}

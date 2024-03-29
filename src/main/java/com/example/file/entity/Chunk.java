package com.example.file.entity;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

/**
 * @author CJS
 * @description 文件块
 * @date 10:27 19/10/21
 */
@Data
public class Chunk implements Serializable {

    private Integer id;

    /**
     * 当前文件块，从1开始
     */
    private Integer chunkNumber;

    /**
     * 分块大小
     */
    private Long chunkSize;

    /**
     * 当前分块大小
     */
    private Long currentChunkSize;

    /**
     * 总大小
     */
    private Long totalSize;

    /**
     * 文件标识
     */
    private String identifier;

    /**
     * 文件名
     */
    private String filename;

    /**
     * 相对路径
     */
    private String relativePath;

    /**
     * 总块数
     */
    private Integer totalChunks;

    /**
     * 文件类型
     */
    private String fileType;

    private MultipartFile file;

}

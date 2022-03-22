package com.lt.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author lt
 * @since 2022-03-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BizFile implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer userId;

    private String storageType;

    private String originalFileName;

    private Long size;

    private String suffix;

    private Integer width;

    private Integer height;

    private String filePath;

    private String fullFilePath;

    private String fileHash;

    private String uploadType;

    private LocalDateTime uploadStartTime;

    private LocalDateTime uploadEndTime;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}

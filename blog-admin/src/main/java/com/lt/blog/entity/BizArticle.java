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
public class BizArticle implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 文章封面图片
     */
    private String coverImage;

    /**
     * 当前文章适用的编辑器类型
     */
    private String editorType;

    /**
     * 文章专属二维码地址
     */
    private String qrcodePath;

    private Boolean isMarkdown;

    /**
     * 文章内容
     */
    private String content;

    /**
     * markdown版的文章内容
     */
    private String contentMd;

    /**
     * 是否置顶
     */
    private Boolean top;

    /**
     * 类型
     */
    private Long typeId;

    /**
     * 状态
     */
    private Boolean status;

    /**
     * 是否推荐
     */
    private Boolean recommended;

    /**
     * 是否原创
     */
    private Boolean original;

    /**
     * 文章简介，最多200字
     */
    private String description;

    /**
     * 文章关键字，优化搜索
     */
    private String keywords;

    /**
     * 是否开启评论
     */
    private Boolean comment;

    /**
     * 文章私密访问时的密钥
     */
    private String password;

    /**
     * 该文章是否登录后才可访问
     */
    private Boolean requiredAuth;

    /**
     * 添加时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}

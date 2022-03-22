package com.lt.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 广告
 * </p>
 *
 * @author lt
 * @since 2022-03-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BizAd implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 广告类型
     */
    private String type;

    /**
     * 广告位置
     */
    private String position;

    /**
     * 广告标题
     */
    private String title;

    /**
     * 广告内容
     */
    private String content;

    /**
     * 广告图片
     */
    private String picture;

    /**
     * 广告链接
     */
    private String link;

    /**
     * 广告到期日
     */
    private LocalDateTime expiringDate;

    /**
     * 展示次数
     */
    private Integer showNumber;

    /**
     * 点击次数
     */
    private Integer clickNumber;

    /**
     * 添加时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}

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
public class SysResources implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private String type;

    private String url;

    private String permission;

    private Long parentId;

    private Integer sort;

    /**
     * 是否外部链接
     */
    private Boolean external;

    private Boolean available;

    /**
     * 菜单图标
     */
    private String icon;

    /**
     * 添加时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}

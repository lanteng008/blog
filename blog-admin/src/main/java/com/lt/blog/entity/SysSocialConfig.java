package com.lt.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 社会化登录应用
 * </p>
 *
 * @author lt
 * @since 2022-03-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SysSocialConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 应用ID
     */
    private String clientId;

    /**
     * 应用密钥
     */
    private String clientSecret;

    /**
     * 认证成功后跳转的地址
     */
    private String redirectUri;

    /**
     * 应用名
     */
    private String platformName;

    /**
     * 第三方平台
     */
    private String platform;

    /**
     * 应用 LOGO
     */
    private String logo;

    /**
     * 支付宝公钥
     */
    private String alipayPublicKey;

    /**
     * 是否需要申请unionid
     */
    private Boolean unionId;

    /**
     * Stack Overflow Key
     */
    private String stackOverflowKey;

    /**
     * 授权方的网页应用ID
     */
    private String agentId;

    /**
     * 授权范围
     */
    private String scope;

    /**
     * 当前配置是否可用
     */
    private Boolean available;

    /**
     * 记录创建时间
     */
    private LocalDateTime createTime;

    /**
     * 记录更新时间
     */
    private LocalDateTime updateTime;


}

package com.bear.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 助贷认证表
 * </p>
 *
 * @author LiuShanshan
 * @since 2024-09-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ResearchAuthentication  {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 认证状态：0：审核中；1：已通过；2：已拒绝
     */
    private Integer status;

    /**
     * 是否使用；0：不使用；1：使用
     */
    private Boolean isUse;

    /**
     * 助贷头像
     */
    private String researchAvatar;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 身份证头像url
     */
    private String identityCardsHeadUrl;

    /**
     * 城市编码
     */
    private Integer cityCode;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 服务区域
     */
    private String serviceArea;

    /**
     * 身份类型（1：公司从业人员；2：自由经纪人）
     */
    private Integer identityType;

    /**
     * 公司名称
     */
    private String companyName;

    private Date applyTime;

    /**
     * 审核时间
     */
    private Date auditTime;

    /**
     * 是否删除
     */
    private Boolean hasDeleted;

    /**
     * 创建用户
     */
    private Long createUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改用户
     */
    private Long modifyUser;

    /**
     * 修改时间
     */
    private Date modifyTime;

}

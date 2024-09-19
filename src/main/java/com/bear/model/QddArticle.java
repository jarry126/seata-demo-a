package com.bear.model;


import lombok.*;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class QddArticle {

    private Long id;

    private Long categoryId;

    private Integer categoryType;

    private String title;

    private String keyword;

    private Integer hasTop;

    private Date releaseTime;

    private Integer hasPush;

    private Integer approveStatus;

    private String content;

    private Integer viewNum;

    private Integer unsolveNum;

    private Integer solveNum;

    private Boolean hasDeleted;

    private Long createUser;

    private Date createTime;

    private Long modifyUser;

    private Date modifyTime;
}

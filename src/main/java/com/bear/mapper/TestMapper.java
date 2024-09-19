package com.bear.mapper;

import com.bear.model.ResearchAuthentication;

import java.util.List;

/**
 * <p>
 * 问题工单表 Mapper 接口
 * </p>
 *
 * @author zjl test
 * @since 2023-11-10
 */
public interface TestMapper {

    List<ResearchAuthentication> selectData();

    // 插入一条数据
    void insertData();


}

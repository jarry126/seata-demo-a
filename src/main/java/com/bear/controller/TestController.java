package com.bear.controller;

import com.bear.client.TestFeignClient;
import com.bear.mapper.TestMapper;
import com.bear.model.QddArticle;
import com.bear.model.ResearchAuthentication;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LiuShanshan
 * @version V1.0
 * @Description
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    private TestMapper testMapper;

    @Resource
    private TestFeignClient testFeignClient;

    @GetMapping("/test1")
    @GlobalTransactional(name = "test11",rollbackFor = Exception.class)
    public void test1() {
        System.out.println("请求成功");
    }

    @GetMapping("/selectList")
    @GlobalTransactional(name = "selectList",rollbackFor = Exception.class)
    public List<ResearchAuthentication> selectList() {
        List<ResearchAuthentication> researchAuthentications = testMapper.selectData();
        return researchAuthentications;
    }

    @GetMapping("/insertGlobal")
    @GlobalTransactional(name = "insertGlobal",rollbackFor = Exception.class)
    public String insertGlobal() {
        System.out.println("事务id是"+ RootContext.getXID());
        // 东融项目插入
        testMapper.insertData();
        // qiduoduo项目插入
        QddArticle qddArticle = QddArticle.builder()
                .approveStatus(1)
                .categoryId(1L)
                .content("内容")
                .categoryType(1)
                .hasPush(1)
                .hasTop(1).build();
        testFeignClient.updatePushUserStatus(qddArticle);
        int i = 1/0;
        return "成功";
    }

}

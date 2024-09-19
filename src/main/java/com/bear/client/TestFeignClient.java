package com.bear.client;

import com.bear.model.QddArticle;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author LiuShanshan
 * @version V1.0
 * @Description
 */
@FeignClient(name = "springboot-seata-qiduoduo-demo1")
public interface TestFeignClient {

    @PostMapping("/article/QddArticle/saveOrUpdateArticle")
    void updatePushUserStatus(@RequestBody QddArticle pushUserUpdateDto);

}

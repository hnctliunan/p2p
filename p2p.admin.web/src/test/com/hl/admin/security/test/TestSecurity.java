package com.hl.admin.security.test;

import com.alibaba.fastjson.JSONObject;
import com.hl.admin.biz.security.ITbSecurityAccountBiz;
import com.hl.admin.base.vo.DataVO;
import com.hl.admin.entity.security.TbSecurityAccount;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring-core.xml",
        "classpath:spring-datasource.xml",
        "classpath:spring-shiro.xml",
})
public class TestSecurity {
    @Autowired
    private ITbSecurityAccountBiz iTbSecurityAccountBiz;
    @Test
    public void test1(){
        JSONObject jsonObject = null;
        try {
            DataVO<TbSecurityAccount> vo =  this.iTbSecurityAccountBiz.userLogin("admin","123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("***********************" + jsonObject);
    }
}

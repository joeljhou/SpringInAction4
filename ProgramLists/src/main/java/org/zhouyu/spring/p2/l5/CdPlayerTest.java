package org.zhouyu.spring.p2.l5;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zhouyu.spring.p2.L3.CdPlayerConfig;
import org.zhouyu.spring.p2.l1.CompactDisc;

/**
 * @author 周宇
 * @create 2021-10-09 9:37
 * 程序清单2.5 测试组件扫描能发现CompactDisc
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CdPlayerConfig.class)
public class CdPlayerTest {

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        //断言非空
        Assert.assertNotNull(cd);
    }

}

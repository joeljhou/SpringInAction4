package org.zhouyu.spring.p2.l6;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zhouyu.spring.p2.L3.CdPlayerConfig;
import org.zhouyu.spring.p2.l1.CompactDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CdPlayerConfig.class)
public class CdPlayerTest {

    /**
     * 标准输出流日志
     */
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        //断言非空
        Assert.assertNotNull(cd);
    }

    @Test
    public void play(){
        player.play();
        Assert.assertEquals("Playing Sgt. Peepper's Lonely Hearts Club Band by The Beatles\r\n",log.getLog());
    }
}

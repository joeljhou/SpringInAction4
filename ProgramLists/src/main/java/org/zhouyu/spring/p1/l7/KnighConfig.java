package org.zhouyu.spring.p1.l7;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.zhouyu.spring.p1.l2.Knight;
import org.zhouyu.spring.p1.l3.BraveKnight;
import org.zhouyu.spring.p1.l3.Quest;
import org.zhouyu.spring.p1.l5.SlayDragonQuest;

/**
 * @author 周宇
 * @create 2021-09-25 23:43
 * 程序清单1.7 Spring提供的基于Java的配置可以替代XML
 */
@Configurable
public class KnighConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    private Quest quest() {
        return new SlayDragonQuest(System.out);
    }

}

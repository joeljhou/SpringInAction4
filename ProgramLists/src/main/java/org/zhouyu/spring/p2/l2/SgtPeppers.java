package org.zhouyu.spring.p2.l2;

import org.springframework.stereotype.Component;
import org.zhouyu.spring.p2.l1.CompactDisc;

/**
 * @author 周宇
 * @create 2021-10-07 18:23
 * 程序清单2.2 带有@Component注解的CompactDisc实现类SgtPeppers
 */
@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Peepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

}

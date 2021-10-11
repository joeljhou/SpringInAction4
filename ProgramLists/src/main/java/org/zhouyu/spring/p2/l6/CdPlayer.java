package org.zhouyu.spring.p2.l6;

import org.springframework.beans.factory.annotation.Autowired;
import org.zhouyu.spring.p2.l1.CompactDisc;

import javax.inject.Named;

/**
 * @author 周宇
 * @create 2021-10-09 10:46
 * 程序清单2.6 通过自动装配，将一个CompactDisc注入到CdPlayer之中
 */
@Named
public class CdPlayer implements MediaPlayer {
    /**
     * 压缩碟片
     */
    private CompactDisc cd;

    @Autowired
    public CdPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }
}

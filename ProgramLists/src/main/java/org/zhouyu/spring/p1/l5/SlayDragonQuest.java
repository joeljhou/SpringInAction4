package org.zhouyu.spring.p1.l5;


import org.zhouyu.spring.p1.l3.Quest;

import java.io.PrintStream;

/**
 * @author 周宇
 * @create 2021-09-25 23:13
 * 程序清单1.5 勇者斗恶龙
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    //无参构造
    public SlayDragonQuest() {
    }
    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("踏上追杀巨龙的征程！");
    }

}

/**
 * 我们可以看到SlayDragonQuest实现了Quest接口，这样它就可以注入到BraveKnight中去了
 * 如何将SlayDragonQuest交给BraveKnight呢？又如何将PrintStream交给SlayDragonQuest呢？
 */
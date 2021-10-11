package org.zhouyu.spring.p1.l9;

import java.io.PrintStream;

/**
 * @author 周宇
 * @create 2021-09-27 18:02
 * 程序清单1.9 吟游诗人是中世纪的音乐记录器
 */
public class Minstrel {

    private PrintStream stream;

    /**
     * 无参构造
     */
    public Minstrel() {
    }
    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    /**
     * 探险之前调用
     */
    public void singBeforeQuest(){
        stream.println("啦啦啦，骑士好勇敢！");
    }

    /**
     * 探险之后调用
     */
    public void singAfterQuest(){
        stream.println("嘻嘻，勇敢的骑士果然踏上了征程！");
    }

}

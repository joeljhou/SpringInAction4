package org.zhouyu.spring.p1.l3;

import org.zhouyu.spring.p1.l2.Knight;

/**
 * @author 周宇
 * @create 2021-09-23 15:57
 * 程序清单1.3 勇敢的骑士
 */
public class BraveKnight implements Knight {
    private Quest quest; //Quest接口

    public BraveKnight() {
    }

    public BraveKnight(Quest quest) { //Queue被注入进来
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest(){
        quest.embark();
    }

}

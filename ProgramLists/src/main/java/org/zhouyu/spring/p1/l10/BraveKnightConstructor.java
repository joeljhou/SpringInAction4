package org.zhouyu.spring.p1.l10;

import org.zhouyu.spring.p1.l2.Knight;
import org.zhouyu.spring.p1.l3.Quest;
import org.zhouyu.spring.p1.l9.Minstrel;

/**
 * @author 周宇
 * @create 2021-09-23 15:57
 * 程序清单1.10 BraveKnight调用Minstrel的方法
 */
public class BraveKnightConstructor implements Knight {
    private Quest quest;
    private Minstrel minstrel;

    public BraveKnightConstructor(Quest quest, Minstrel minstrel) {
        this.quest = quest;
        this.minstrel = minstrel;
    }

    @Override
    public void embarkOnQuest(){
        minstrel.singBeforeQuest();   //Knight应该管理它的Minstrel吗？
        quest.embark();
        minstrel.singAfterQuest();
    }

}

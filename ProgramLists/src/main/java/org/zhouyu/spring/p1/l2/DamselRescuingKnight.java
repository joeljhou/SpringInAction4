package org.zhouyu.spring.p1.l2;

/**
 * @author 周宇
 * @create 2021-09-23 15:40
 * 程序清单1.2 少女拯救骑士
 */
public class DamselRescuingKnight implements Knight{
    /**
     * 拯救少女任务
     */
    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        //与RescueDamselQuest紧耦合
        this.quest = new RescueDamselQuest();
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }
}

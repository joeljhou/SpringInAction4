package org.zhouyu.spring.p1.l4;

import org.junit.Test;
import org.mockito.Mockito;
import org.zhouyu.spring.p1.l3.BraveKnight;
import org.zhouyu.spring.p1.l3.Quest;

/**
 * @author 周宇
 * @create 2021-09-23 16:16
 * 程序清单1.4 为了测试BraveKnight，需要注入一个mock Quest
 */
public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest(){
        Quest mockQuest = Mockito.mock(Quest.class);      //创建mock Quest
        BraveKnight knight = new BraveKnight(mockQuest);  //注入mock Quest
        knight.embarkOnQuest();
        //校验embark()方法是否只调用了1次
        Mockito.verify(mockQuest,Mockito.times(1)).embark();
    }

}

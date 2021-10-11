package org.zhouyu.spring.p1.l8;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.zhouyu.spring.p1.l2.Knight;

import java.io.File;
import java.io.IOException;

/**
 * @author 周宇
 * @create 2021-09-27 13:53
 * 程序清单1.8 KnightMain.java加载包含Knight的Spring上下文
 */
public class KnightMain {
    public static void main(String[] args) throws IOException {
        //加载Sprinig应用上下文
        String path = new File("ProgramList").getCanonicalPath();
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(path + "/src/main/java/com/zhouyu/spring/p1/p1_6/knights.xml");
        //获取knight bean
        Knight knight = context.getBean(Knight.class);
        //使用knight
        knight.embarkOnQuest();
        context.close();
    }
}

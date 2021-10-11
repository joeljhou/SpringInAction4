package org.zhouyu.spring.p1.l12;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 周宇
 * @create 2021-09-30 0:15
 * 员工
 */
@Data
public class Employee {
    /**
     * id
     */
    private Long id;
    /**
     * 名
     */
    private String firstName;
    /**
     * 姓
     */
    private String lastName;
    /**
     * 薪水
     */
    private BigDecimal salary;

}

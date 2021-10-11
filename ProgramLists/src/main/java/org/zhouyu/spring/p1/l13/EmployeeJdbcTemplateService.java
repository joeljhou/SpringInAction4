package org.zhouyu.spring.p1.l13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.zhouyu.spring.p1.l12.Employee;

/**
 * @author 周宇
 * @create 2021-09-30 0:20
 * 员工服务(原生JDBC实现)
 */
@Service
public class EmployeeJdbcTemplateService {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Employee getEmployeeById(long id) {
        return jdbcTemplate.queryForObject(
                //sql查询
                "select id,firstname,lastbane,salary from employee where id = ?",
                (rs, rowNum) -> {
                    //将结果匹配为对象
                    Employee employee = new Employee();
                    employee.setId(rs.getLong("id"));
                    employee.setFirstName(rs.getString("firstname"));
                    employee.setLastName(rs.getString("lastname"));
                    employee.setSalary(rs.getBigDecimal("salary"));
                    return employee;
                },
                //指定查询参数
                id);
    }
}

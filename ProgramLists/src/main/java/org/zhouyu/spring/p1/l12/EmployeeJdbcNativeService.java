package org.zhouyu.spring.p1.l12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 周宇
 * @create 2021-09-30 0:20
 * 员工服务(原生JDBC实现)
 */
@Service
public class EmployeeJdbcNativeService {

    private DataSource dataSource;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Employee getEmployeeById(long id) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = dataSource.getConnection();
            //查找员工
            stmt = conn.prepareStatement("select id,name from employee where id = ?");
            stmt.setLong(1, id);
            rs = stmt.executeQuery();
            Employee employee = null;
            if (rs.next()) {
                //根据数据创建对象
                employee = new Employee();
                employee.setId(rs.getLong("id"));
                employee.setFirstName(rs.getString("firstname"));
                employee.setLastName(rs.getString("lastname"));
                employee.setSalary(rs.getBigDecimal("salary"));
            }
            return employee;
        } catch (SQLException e) {
            //捕获异常处理
        } finally {
            //清理
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}

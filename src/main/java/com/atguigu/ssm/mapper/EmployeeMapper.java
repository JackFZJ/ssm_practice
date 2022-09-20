package com.atguigu.ssm.mapper;

import com.atguigu.ssm.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {

    /**
     * 查询所有的员工信息
     */
    List<Employee> getAllEmployee();

    /**
     * 根据id获取员工
     * @param id
     */
    Employee getEmployeeById(@Param("id") Integer id);

    /**
     * 添加员工
     * @param employee
     */
    void addEmployee(Employee employee);

    /**
     * 修改员工
     * @param employee
     */
    void updateEmployee(Employee employee);

    /**
     * 删除员工
     * @param id
     */
    void deleteEmployee(Integer id);
}

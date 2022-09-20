package com.atguigu.ssm.service;

import com.atguigu.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface EmployeeService {

    /**
     * 查询所有的员工信息
     * @return
     */
    List<Employee> getAllEmployee();

    /**
     * 获取员工的分页信息
     * @return
     */
    PageInfo<Employee> getEmployeePage(Integer pageNum);

    /**
     * 根据id获取员工
     * @param id
     * @return
     */
    Employee getEmployeeById(Integer id);

    /**
     * 添加员工
     * @param employee
     */
    void addEmployee(Employee employee);

    /**
     * 修改
     * @param employee
     */
    void updateEmployee(Employee employee);

    /**
     * 删除
     * @param id
     */
    void deleteEmployee(Integer id);
}

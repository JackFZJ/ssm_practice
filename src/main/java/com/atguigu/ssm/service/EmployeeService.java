package com.atguigu.ssm.service;

import com.atguigu.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface EmployeeService {

    /**
     * ��ѯ���е�Ա����Ϣ
     * @return
     */
    List<Employee> getAllEmployee();

    /**
     * ��ȡԱ���ķ�ҳ��Ϣ
     * @return
     */
    PageInfo<Employee> getEmployeePage(Integer pageNum);

    /**
     * ����id��ȡԱ��
     * @param id
     * @return
     */
    Employee getEmployeeById(Integer id);

    /**
     * ���Ա��
     * @param employee
     */
    void addEmployee(Employee employee);

    /**
     * �޸�
     * @param employee
     */
    void updateEmployee(Employee employee);

    /**
     * ɾ��
     * @param id
     */
    void deleteEmployee(Integer id);
}

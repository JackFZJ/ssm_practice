package com.atguigu.ssm.mapper;

import com.atguigu.ssm.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {

    /**
     * ��ѯ���е�Ա����Ϣ
     */
    List<Employee> getAllEmployee();

    /**
     * ����id��ȡԱ��
     * @param id
     */
    Employee getEmployeeById(@Param("id") Integer id);

    /**
     * ���Ա��
     * @param employee
     */
    void addEmployee(Employee employee);

    /**
     * �޸�Ա��
     * @param employee
     */
    void updateEmployee(Employee employee);

    /**
     * ɾ��Ա��
     * @param id
     */
    void deleteEmployee(Integer id);
}
